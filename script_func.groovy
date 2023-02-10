def call() {
    withCredentials([usernamePassword(credentialsId: 'docker_repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t mksmvskv/mynginx:4.0 ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push mksmvskv/mynginx:4.0"
    }
}