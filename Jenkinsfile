node {

    stage('SCM checkout') {
       git 'https://github.com/khajahussain1/SELENIUM2'
        
    }

        
   stage ('Compile Stage') {
        
           def mvnHome = tool name: 'MAVEN_HOME', type: 'maven'
                 sh "{mvnHome}/bin/mvn package"  
                                    
                }
            }
        
        
        