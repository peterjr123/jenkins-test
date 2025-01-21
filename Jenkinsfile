pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'echo build!!'
            }
        }
        stage('Test') {
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew check'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            junit 'build/reports/**/*.xml'
        }
        failure {
            echo 'This will run only if failed'
        }
    }
}