import groovy.json.JsonSlurperClassic

node ('master'){
    
    stage ('Checkout'){
        
        git credentialsId: 'GHE_account_New', url: 'https://github.com/szabbas/Sample_programs.git'
    }
    
    stage ('Build'){
        
        dir ('sample_program'){
            bat 'ant'
        }
        archiveArtifacts 'sample_program\\web\\lib\\*.jar'
    }
    
	stage ('Test'){
	
		parallel (
			"IntegrationTest": {
				echo "Integration Test completed"
			},			
			"SmokeTest": {
				echo "Smoke Test completed"
			},			
			"UnitTest": {
				echo "Unit Test completed"
			}
		)
	}
	
    stage ('Notifier'){
        
        //emailext attachLog: true, body: "Check console output at ${env.BUILD_URL} to view the results.<br></br> ", subject: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} ", to: 'syeda@newtglobal.com'
        mail body: "Check console output at ${env.BUILD_URL} to view the results.", subject: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} ", to: 'syeda@newtglobal.com'
    }
    deleteDir()
}