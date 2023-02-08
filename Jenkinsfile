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
                sh 'pwd'
            }
        }
        stage('Copy index file') {
            steps {
                sh 'sudo cp index.html /var/www/html/index.html'
                sh 'ls -la /var/www/html/'
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
