pipeline {
    stages {
        agent { docker 'openjdk:11-jdk-oracle' }
        stage('Run Unit Tests') {
            steps {
                sh './auto/run-unit-tests'
            }
        }
    }
    stage('Deploy to Production') {
        input {
            message "Should we continue?"
            ok "Yes, we should."
        }
        agent {
            docker {
                image 'openjdk:11-jdk-oracle'
                args  '-p 9091:8080'
            }
        }
        steps {
            sh './auto/deploy'
        }
    }
}