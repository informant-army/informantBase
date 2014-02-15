package br.com.informant.controller

import grails.converters.JSON;

@Mixin(TesteValidation)
class TesteController {

	def testeService

    static allowedMethods = [index:'GET']

    def index() {
    	
        def list = testeService.list(params)
        [ itens: list ]

    }

}