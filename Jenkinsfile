pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'cd gradle-test-project'
                sh 'gradlew --info clean jar'
            }
        }
        stage('Testing') {
            steps {
                echo 'Testing..'
                sh 'gradlew --info clean test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
