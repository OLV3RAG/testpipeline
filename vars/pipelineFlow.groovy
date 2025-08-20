def call() {
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    script {
                        build.construir()
                        build.unitTest()
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
