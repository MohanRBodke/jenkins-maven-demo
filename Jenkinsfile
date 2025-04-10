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
                // sh 'mvn clean install'
                echo 'Skipping deployment step'
            }
        }
        // stage('Deploy to Test') {
        //     steps {
        //         sh './deploy-to-test.sh'
        //     }
        // }
        stage('Integration Tests') {
            steps {
                sh 'mvn verify'
            }
        }
        stage('API Tests') {
            steps {
                sh 'C:/Users/mohan/AppData/Roaming/npm/newman.cmd run your_collection.json'
                // sh 'newman run your_collection.json -e environment.json'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
            echo 'Sending email/report...'
        }
    }
}

//         stage('Build') {
//             steps {
//                 sh 'mvn clean package'
//             }
//         }

//         stage('Test') {
//             steps {
//                 sh 'mvn test'
//             }
//         }

//         // stage('Postman API Tests') {
//         //     steps {
//         //         sh 'C:\\Users\\mohan\\AppData\\Roaming\\npm\\newman.cmd run postman_collection.json'
//         //     }
//         // }
//     }

//     post {
//         always {
//             junit '**/target/surefire-reports/*.xml'
//         }
//     }
// }
