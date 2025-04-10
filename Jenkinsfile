pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1' // Configure Maven in Jenkins → Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/MohanRBodke/jenkins-maven-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Postman API Tests') {
            steps {
                sh 'newman run postman_collection.json'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
