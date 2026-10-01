pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Build de l application Python'
            }
        }

        stage('Tests') {
            steps {
                sh 'pytest --junitxml=test-results/results.xml'
            }
        }

        stage('Publication du rapport JUnit') {
            steps {
                junit 'test-results/results.xml'
            }
        }
    }
}