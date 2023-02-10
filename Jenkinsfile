pipeline {
    agent { label 'webserver1' }
        parameters {
        choice(name: 'VERSION', choices: ['2.0', '3.0', '4.0', '5.0'], description: '')
        }
    stages {
        stage('Docker build') {
            steps {
                script_func("$VERSION")

            }
        }
        stage('Docker RUN') {
            steps {
                echo 'Start container'
                //sh 'docker run --name mynginx_2 -p 8080:80 -d mynginx:2.0'
            }
        }
        stage('Delete workspace after all steps') {
            steps {
                echo 'Deleting workspace'
                deleteDir()
            }
        }
    }
}