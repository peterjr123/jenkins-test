pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'echo build!!'
            }
        }
        state('Test') {
            steps {
                sh './gradlew check'
            }
        }
    }
    post {
        always {
            echo 'This will always run'
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
            junit 'build/reports/**/*.xml'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
    }
}