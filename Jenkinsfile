pipeline {
    agent { label 'windows' }
        parameters {
        choice(name: 'VERSION', choices: ['6.0', '7.0', '8.0', '9.0'], description: '')
        }
    
    stages {
                
        stage('Docker build') {
            steps {
                script{
                    groovyscript.builddocker()
                }
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