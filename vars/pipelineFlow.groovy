def call() {
    pipeline {
        agent any
        options {
            skipDefaultCheckout()  
                    }

        stages {
            stage('Config Work') {
                println "CONFIG WORK"
                    }
                }
            }

            stage('Build') {
                steps {
                    script {
                        build.construir()
                    }
                }
            }

            stage('Unit Test') {
                steps {
                    script {
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
