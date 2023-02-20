pipeline {
    agent { label 'windows' }

    stages {
                
        stage('Try DSC') {
            steps {
                bat 'powershell.exe -File run.ps1' 
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