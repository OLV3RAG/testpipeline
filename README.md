pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
                script {
                    bat "dir"
                    bat "cd C:\\Program Files\\Git\\bin"
                   <!-- bat """
                        git clone https://github.com/OLV3RAG/testpipeline.git
                    """ -->
                    bat "ping github.com"
                    bat """cd C:\\Program Files\\Git\\bin
                    git config --global user.name
                    git config --global user.email"""

                }
            }
        }
    }
}