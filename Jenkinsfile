#!/usr/bin/env groovy

pipeline{

	agent any
	
	environment{
		APPNAME="DevOps-01"
		DEBUG_FLAGS='-g'
		SLAVE_AGENT='172.31.29.41'
		REL=''
		bld=''
		proj=''
		ARTIFACT_ID=''
	}
	
	//All jenkins job parameters will come here
	parameters{
		string(name: 'PHASE', defaultValue: 'BUILD', description: 'The stage to run pipeline')
		string(name: 'TARGET_ENV', defaultValue: 'SCAN')
		string(name: 'SLAVE_AGENT', defaultValue: '172.31.29.41')
		string(name: 'REL', defaultValue: 'dev')
		string(name: 'bld', defaultValue: 'st')
		string(name: 'proj', defaultValue: 'devsecops01')
	}
	
	stages{
	
		stage("BUILD"){
			agent{
				node {
					label "${params.SLAVE_AGENT}"
					customWorkspace "/home/jenkins-slave-01/workspace/"
				}
			}
			when{
				expression{	return "${params.PHASE}" =~ /(BUILD.*)/}
			}
			steps{
				echo "compile Stages"
			}
		}
		
	}
	
}