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
                sh '''
                    python3 --version
                    python3 -m pip --version
                '''
            }
        }

        stage('Publication du rapport JUnit') {
            steps {
                junit 'test-results/results.xml'
            }
        }
    }
}