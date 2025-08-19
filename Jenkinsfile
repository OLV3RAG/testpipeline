pipeline {
    agent none
    stages {
        stage('Example') {
            agent any
            options {
                // Timeout counter starts BEFORE agent is allocated
                timeout(time: 3, unit: 'MINUTES')
            }
            steps {
                echo 'Hello World'
            }
        }
    }
}