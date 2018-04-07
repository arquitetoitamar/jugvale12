pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage('Docker Up') {
      steps {
        sh 'docker-compose up -d'
      }
    }
  }
}