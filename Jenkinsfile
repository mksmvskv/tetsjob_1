def groovyscript

pipeline {
    agent { label 'webserver1' }
        parameters {
        choice(name: 'VERSION', choices: ['6.0', '7.0', '8.0', '9.0'], description: '')
        }
    
    stages {
        
        stage('Script init'){
            steps {
                script{
                    groovyscript = load "script_func.groovy"
                }
            }
            
        }
        
        stage('Docker build') {
            steps {
                script{
                    sf.builddocker()
                }
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