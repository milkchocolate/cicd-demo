pipeline {
    agent { docker 'openjdk:11-jdk-oracle' }
    stages {
        stage('Run Unit Tests') {
            steps {
                sh './auto/run-unit-tests'
            }
        }
    }
}