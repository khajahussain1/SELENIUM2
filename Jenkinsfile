node {
    agent any 
    
    stages {
        stage ('Compile Stage') {
        
            steps {
                withMaven(maven : 'apache-maven-3.3.3'){
                       echo 'Hello, Maven'
                       sh 'mvn clean install'             
                                    
                }
            }
        }
        
        stage ('Testing Stage') {
        
            steps {
                withMaven(maven : 'maven-3.3.3'){
                       sh 'mvn test'             
                                    
                 }
            }
        }        
        stage ('Deployment Stage') {
            steps {
            
                withMaven(maven : 'maven-3.3.3'){
                       sh 'mvn deploy'             
                                    
                 }
            }
        }    }
}