 
pipeline {
  agent any
  stages {
    stage('SCM'){
     steps {
      checkout scm
     }
    }
    stage('TEST'){
      steps {
       withMaven(mavenSettingsConfig: 'jenkins-maven'){
         sh 'mvn clean install compile test'
       }
      }
    }
  }
}
