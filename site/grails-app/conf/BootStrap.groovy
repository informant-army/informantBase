import br.com.informant.domain.Teste

class BootStrap {

    def init = { servletContext ->

    	if(Teste.count()==0){
	
			for(i in 0..10) {
				def item = new Teste([descricao:"Item "+i])
				item.save()
			}
	
		}

    }

    def destroy = {
    }
}
