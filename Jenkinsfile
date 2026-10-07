pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {

        stage('Checkout Git') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        success {
            echo 'MATH MAVEN PIPELINE PASSED SUCCESSFULLY!'
        }

        failure {
            echo 'MATH MAVEN PIPELINE FAILED.'
        }
    }
}