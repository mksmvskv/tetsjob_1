def builddocker() {
    withCredentials([usernamePassword(credentialsId: 'docker_repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t mksmvskv/mynginx:${param.VERSION} ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push mksmvskv/mynginx:${param.VERSION}"
    }
}
return this