pipeline {
    agent any 
    
    stages {
        stage('Compile Stage') {
        
            steps {
                withMaven(maven : 'maven_3_3_3'){
                       echo 'Hello, Maven'
                       sh 'mvn clean install'             
                                    
                   }

            }
        }
        
        stage('Testing Stage') {
        
            steps {
                withMaven(maven : 'maven_3_3_3'){
                       sh 'mvn test'             
                                    
                   }

            }
        }
        
        stage('Deployment Stage') {
            steps {
            
                withMaven(maven : 'maven_3_3_3'){
                       sh 'mvn deploy'             
                                    
                   }

            }
        }
    }
}