pipeline {
    agent { label 'webserver1' }
    stages {
        stage('Docker build') {
            steps {
                echo 'Build container'
                sh 'docker build -t mynginx:1.0 .'
            }
        }
        stage('Docker RUN') {
            steps {
                sh 'docker run --name mynginx -d mynginx:1.0 -p 8080:80'
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
