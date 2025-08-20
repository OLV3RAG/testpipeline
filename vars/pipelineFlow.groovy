def call() {
    pipeline {
        agent any
        
stage('Config Work') {
    steps {
        script {
            checkout scm   // Si necesitas los archivos
            configWork.setup()
        }
    }
}

        stages {
            stage('Build') {
                steps {
                    script {
                        build.construir()  // Este aparecerá como stage "Build"
                    }
                }
            }

            stage('Unit Test') {
                steps {
                    script {
                        build.unitTest()  // Este aparecerá como stage "Unit Test" separado
                    }
                }
            }

            stage('Deploy') {
                steps {
                    script {
                        deploy.deployTo()
                    }
                }
            }

            stage('Notifications') {
                steps {
                    script {
                        notification.sendEmail("✅ Pipeline ejecutado correctamente (simulado)")
                    }
                }
            }
        }
    }
}
