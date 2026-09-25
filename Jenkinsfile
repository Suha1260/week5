pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Suha1260/week5'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java files...'
                bat 'javac Factorial.java TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running factorial test...'
                bat 'java TestFactorial'
            }
        }
    }
}