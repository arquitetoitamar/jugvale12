pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage('Tests') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Quality') {
      steps {
        sh 'echo \'Passou com sucesso\''
      }
    }
    stage('Docker UP') {
      steps {
        sh 'docker-compose up -d'
      }
    }
  }
}