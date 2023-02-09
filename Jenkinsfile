pipeline {
    agent { label 'webserver1' }
    stages {
        stage('Docker build') {
            steps {
                echo 'Build container'
                sh 'docker build -t mynginx:2.0 .'
            }
        }
        stage('Docker RUN') {
            steps {
                sh 'docker run --name mynginx_2 -p 8080:80 -d mynginx:2.0'
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
