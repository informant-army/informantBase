package br.com.informant.domain

class TesteService {

	def create(params) {
     
        def teste     	= new Teste()
        teste.properties  = params
        
        if (teste.validate()) {
            teste.save([flush: true, failOnError: true])
        }else{

            if (teste.hasErrors()) { teste.errors.each { println it } }

        }
		teste
    }

	def update(params) {
       
        def teste = Teste.findById(params.id)
        teste.properties  = params
       
        if (teste.validate()) 
        	teste.save([flush: true, failOnError: true])
        
        teste
    }

	def show(params) {
		def teste = Teste.findById(params.id);
		teste
    }

    def list(params) {
        def list = Teste.findAll("from Teste as u")
        list
    }

    def delete(params) {
        def teste = Teste.findById(params.id)
        teste.delete([flush: true, failOnError: true])
        teste
    }

}