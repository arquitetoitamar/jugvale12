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
        sh '''mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent package sonar:sonar \\
    -Dsonar.host.url=https://sonarcloud.io \\
    -Dsonar.organization=imktec-github \\
    -Dsonar.login=ae2cca1da82a48ff405fecd1af16d78d6e8ff896'''
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