/**
 * Jenkins Pipeline for Maven Project
 *
 * This pipeline defines a simple build process for a Maven-based Java project.
 *
 * Stages:
 * 1. Build:
 *    - Executes Maven command to clean and package the project, skipping tests.
 *    - Command: 'mvn -B -DskipTests clean package'
 *
 * Agent:
 * - Runs on any available Jenkins agent.
 */
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Run') {
            steps {
                sh 'java -jar target/my-app-1.0-SNAPSHOT.jar'
            }
        }
    }
}