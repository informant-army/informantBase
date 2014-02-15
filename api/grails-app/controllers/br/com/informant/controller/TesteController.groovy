package br.com.informant.controller

import grails.converters.JSON;

class TesteController {

	def testeService

    static allowedMethods = [index:'GET']

    def listar() {

		def testeList = testeService.list()
		def status  = true
		def message = ""

		def responseData = [
	    	'message': message,
	    	'status': status,
	    	'itens': testeList
		]
		render responseData as JSON;
    }

}