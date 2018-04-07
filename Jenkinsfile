pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    stages {
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}
