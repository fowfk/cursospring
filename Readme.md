Projeto do Curso de Spring MVC - Alura

Aulas 1/2 - Controllers, Classes de Configuração...

@EnableWebMvc
@ComponentScan(basePackageClasses = {Controllers})
AppWebConfiguration{
	1 - IRVR - Internal Resource View Resolver = resolver
	2 - Definir pasta destino das views e tipo do arquivo (.jsp)
}

ServletSpringMvc extends AbstractAnnotationsConfigDispatcherServletInitializer{
	1 - Definir classe de configuração (AppWebConfiguration)
	2 - Definir Mapeamento ("/")
}

HomeController {
	1 - Controller de acesso da pagina principal
}

ProdutosController{
	1 - Controller do formulário de produtos.

	grava(){
		Faz um bind com as informações passadas no form, verificando se há algo com o
		mesmo nome
	}

}



