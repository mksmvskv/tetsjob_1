pipeline {
    agent { label 'webserver1' }
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
                sh 'ls -la'
                sh 'whoami'
                sh 'hostname'
                sh 'ip a'
            }
        }
        stage('Delete workspace before build starts') {
            steps {
                echo 'Deleting workspace'
                deleteDir()
            }
        }
    }
}
