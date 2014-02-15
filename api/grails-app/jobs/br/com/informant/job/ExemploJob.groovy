package br.com.informant.job

class ExemploJob {
	
    def grailsApplication
    //def testeService
    def concurrent = false
    def group = "TesteUser"
    def static final NUMBER_OF_DAYS_TO_EXPIRE_PWD = 60

    def getTriggers(){
        return config.grails.plugin.api.exemploTriggerConfig
    }

    def execute() {
    	
        println("============== JOB Exemplo - Sem acao!")
    
    }
}
