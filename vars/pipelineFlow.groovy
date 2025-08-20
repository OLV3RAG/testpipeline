def call() {
    pipeline {
        agent any

        options {
            timeout(time: 10, unit: 'MINUTES')
        }

        stages {
            stage('Build') {
                steps {
                    script {
                        build_construir()
                        build_unittest()
                    }
                }
            }

            stage('Deploy') {
                steps {
                    script {
                        deploy_deployto()
                    }
                }
            }

            stage('Notifications') {
                steps {
                    script {
                        notification_sendemail("Build & Deploy completados con éxito ✅")
                    }
                }
            }
        }
    }
}
