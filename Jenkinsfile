pipeline {
    agent any 
    stages {
        stage('Compile Stage') {
            steps {
                withMaven(maven : 'apache-maven-3.3.3'){
                       sh 'mvn clean compile'             
                                    
                   }

            }
        }
        stage('Testing Stage') {
            steps {
                withMaven(maven : 'apache-maven-3.3.3'){
                       sh 'mvn test'             
                                    
                   }

            }
        }
        stage('Deployment Stage') {
            steps {
                withMaven(maven : 'apache-maven-3.3.3'){
                       sh 'mvn deploy'             
                                    
                   }

            }
        }
    }
}