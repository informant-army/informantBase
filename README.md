informantBase
=============

Estrutura de projeto utilizando Grails 2.3.4 para suportar versão WEB e API JSON (Geralmente utilizada em Aplicativos Android\iOS) com dominio compartilhado.

Esta estrutura de projeto permite por exemplo que API e SITE estejam em diferentes servidores e ao mesmo tempo compatilhem de um mesmo dominio, evitando duplicação de código.

* **domain-plugin** Dominio (domain,service) compartilhado por API e SITE
* **api** (controllers,views)
* **site** (controllers,views)

## Testar é simples

Entre na pasta api e rode o comando grails runApp

Acesse a url:
http://localhost:8080/api/teste

Você deve receber o seguinte retorno:
{"message":"","status":true,"itens":[{"class":"br.com.informant.domain.Teste","id":1,"descricao":"Item 0"},{"class":"br.com.informant.domain.Teste","id":2,"descricao":"Item 1"},{"class":"br.com.informant.domain.Teste","id":3,"descricao":"Item 2"},{"class":"br.com.informant.domain.Teste","id":4,"descricao":"Item 3"},{"class":"br.com.informant.domain.Teste","id":5,"descricao":"Item 4"},{"class":"br.com.informant.domain.Teste","id":6,"descricao":"Item 5"},{"class":"br.com.informant.domain.Teste","id":7,"descricao":"Item 6"},{"class":"br.com.informant.domain.Teste","id":8,"descricao":"Item 7"},{"class":"br.com.informant.domain.Teste","id":9,"descricao":"Item 8"},{"class":"br.com.informant.domain.Teste","id":10,"descricao":"Item 9"},{"class":"br.com.informant.domain.Teste","id":11,"descricao":"Item 10"}]}

Entre na pasta site e rode o comando grails runApp

Você deve receber o seguinte retorno:
http://localhost:8080/site/teste

<html>
	<head>
		<title>Teste</title>
		<meta name="description" content="">
		<meta name="keywords" content="">
	</head>
<body>
	<div>Item 0</div>
	<div>Item 1</div>
	<div>Item 2</div>
	<div>Item 3</div>
	<div>Item 4</div>
	<div>Item 5</div>
	<div>Item 6</div>
	<div>Item 7</div>
	<div>Item 8</div>
	<div>Item 9</div>
	<div>Item 10</div>
</body>
</html>

-- 

## Adapte este exemplo ao seu novo projeto

Algumas entidades foram criadas para exemplificar o uso, lembre-se de excluí-las caso inicie um novo projeto.

* **Renomear projeto de acordo com a necessidade..** 
* **Excluir Controller\Service\View e Entidade Teste.**
* **Excluir criação de entidades no BootStrap.groovy**
* **Alterar banco de dados no DataSource.groovy**
* **Excluir ExemploJob.groovy..**
  
----------------------------------------------------------------


(UmPoucoDeSoftware.tumblr.com)
"Não é só bater na porta certa, mas bater até abrir" - Guy Falks
----------------------------------------------------------------
