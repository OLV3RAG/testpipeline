def call(String hola) {
    pipeline {
        agent any

        options {
            timeout(time: 10, unit: 'MINUTES')
        }

        stages {
            stage('Build') {
                steps {
                    echo '🔨 Compilando la aplicación...'
                    // Cambia esto por el comando real para tu app
                    // sh './gradlew build' // para Java/Gradle
                    // sh 'python setup.py build' // para Python
                }
            }

            stage('Unit Tests') {
                steps {
                    echo '🧪 Ejecutando pruebas...'
                    // Cambia esto por tu sistema de testing
                    // sh './gradlew test'
                    // sh 'pytest'
                }
            }

            stage('Deploy') {
                when {
                    branch 'main'  // Solo desplegar desde main
                }
                steps {
                    echo '🚀 Desplegando la aplicación...'
                    // Simulación de deploy
                }
            }
        }

        post {
            success {
                echo '✅ Pipeline completado con éxito.'
            }
            failure {
                echo '❌ El pipeline falló.'
            }
        }
    }
}
