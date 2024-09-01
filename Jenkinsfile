pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/chapant/ShoppingApp.git', branch: 'master')
      }
    }

    stage('Build Product Service') {
      steps {
        sh '''cd product-service
./mvnw clean package'''
      }
    }

    stage('Build Gateway API') {
      steps {
        sh '''cd gateway-api
./mvnw clean package
'''
      }
    }

    stage('Build Docker Images') {
      steps {
        sh '''docker build -t product-service:latest ./product-service
docker build -t gateway-api:latest ./gateway-api'''
      }
    }

    stage('Deploy') {
      steps {
        sh 'docker-compose -f path/to/your/docker-compose.yml up -d --build'
      }
    }

  }
}