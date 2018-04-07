pipeline {
  agent any
  stages {
    stage('Build Docker') {
      parallel {
        stage('Build') {
          steps {
            sh 'mvn clean package'
          }
        }
        stage('Build Docker') {
          steps {
            sh 'docker-compose build'
          }
        }
      }
    }
  }
}