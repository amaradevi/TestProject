pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'cd gradle-test-project'
                bat 'gradlew --info clean jar'
            }
        }
        stage('Testing') {
            steps {
                echo 'Testing..'
                bat 'gradlew --info clean test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
