#!/usr/bin/env groovy

pipeline{

	agent none
	
	environment{
		APPNAME="DevOps-01"
		DEBUG_FLAGS='-g'
		SLAVE_AGENT='Slave01'
		REL=''
		bld=''
	}
	
	//All jenkins job parameters will come here
	parameters{
		string(name: 'PHASE', defaultValue: 'BUILD', description: 'The stage to run pipeline')
		string(name: 'TARGET_ENV', defaultValue: 'SCAN')
		string(name: 'SLAVE_AGENT', defaultValue: 'Slave01')
		string(name: 'REL', defaultValue: 'dev')
		string(name: 'bld', defaultValue: 'st')
	}
	
	stages{
	
		stage("BUILD"){
			agent{
				node {
					label "${params.SLAVE_AGENT}"
					customWorkspace "/home/jenkins-slave-01/"
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