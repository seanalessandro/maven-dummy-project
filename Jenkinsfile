 
pipeline {
 
  agent any
 
  tools {
        maven "Maven"
    }
 
  stages {
   
    stage('SCM'){
     steps {
      checkout scm
     }
    }
   
    stage('TEST'){
      steps {
         sh 'mvn clean install compile test'
      
      }
     
    }
  }
 
}
