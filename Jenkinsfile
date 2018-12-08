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
		String(name: 'PHASE', defaultValue: 'BUILD', description: 'The stage to run pipeline')
		String(name: 'TARGET_ENV', defaultValue: 'SCAN')
		String(name: 'SLAVE_AGENT', defaultValue: '172.31.29.41')
		String(name: 'REL', defaultValue: 'dev')
		String(name: 'bld', defaultValue: 'st')
		String(name: 'proj', defaultValue: 'devsecops01')
	}
	
	stages{
	
		stage("BUILD"){
			agent{
				node {
					label "${params.SLAVE_AGENT}"
					customWorkspace "/opt/app/"
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