def call() {
    pipeline {
        agent any
        options {
            skipDefaultCheckout()  // ⚠️ Evita que Jenkins haga Checkout SCM automáticamente
        }

        stages {
            stage('Config Work') {
                steps {
                    script {
                        configWork.setup()  // Ahora será el primer stage visible
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
