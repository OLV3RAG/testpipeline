def call() {
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    script {
                        construir()
                        unit_test()
                    }
                }
            }

            stage('Deploy') {
                steps {
                    script {
                        deployto()
                    }
                }
            }

            stage('Notifications') {
                steps {
                    script {
                        sendemail("✅ Build & Deploy completados con éxito en Windows")
                    }
                }
            }
        }
    }
}
