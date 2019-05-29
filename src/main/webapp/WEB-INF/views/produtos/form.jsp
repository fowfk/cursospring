<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Adicionar Livro - Casa do Código</title>
<link href="src/main/webapp/WEB-INF/views/produtos/css/site.css" rel="stylesheet" type="text/css">
</head>
<body>
			<form action="/casadocodigo/produtos">
				<div>
					<label>Titulo</label>
					<input type="text" name="titulo">
				</div>
				<div>
					<label>Descrição</label>
					<textarea rows="10" cols="20" name="descricao"></textarea>
				</div>
				<div>
					<label>Paginas</label>
					<input type="text" name="paginas">
				</div>
				<button type="submit">Cadastrar</button>
			</form>

</body>
</html>