def call() {
    pipeline {
        agent any

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
