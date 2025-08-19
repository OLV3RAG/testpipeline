def call() {
    pipeline {
        agent any
        stages {
            stage('Ejemplo') {
                steps {
                    echo 'Hola desde la librería compartida'
                }
            }
        }
    }
}
