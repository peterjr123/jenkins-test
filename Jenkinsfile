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
            junit 'build/test-results/**/*.xml'

            mail to: 'jsp020206@gmail.com',
                 subject: 'pipeline success ${currentBuild.fullDisplayName}',
                 body: 'build url: ${env.BUILD_URL}'
        }
        failure {
            echo 'This will run only if failed'
        }
    }
}