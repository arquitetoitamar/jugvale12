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
        waitForQualityGate()
      }
    }
    stage('Docker UP') {
      parallel {
        stage('Docker UP') {
          steps {
            sh 'docker-compose up -d'
          }
        }
        stage('Notificar') {
          steps {
            emailext(subject: 'Deploy Efetuado', body: 'BUILD_NUMBER', from: 'isantos.ads@gmail.com', to: 'isantos.ads@gmail.com')
          }
        }
      }
    }
  }
}