 
pipeline {
 
  agent any
 
  tools {
        maven "jenkins-maven"
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
