<html>
	<head>
		<title>Teste</title>
		<meta name="description" content="" />
		<meta name="keywords" content="" />
	</head>
<body>

	<g:each var="teste" in="${itens}">
		<div>${teste?.descricao}</div>
	</g:each>

</body>
</html>