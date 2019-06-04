package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

<<<<<<< HEAD
import br.com.casadocodigo.loja.controlers.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver irvrInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
=======
import br.com.casadocodigo.loja.controllers.HomeController;
import br.com.casadocodigo.loja.dao.ProdutoDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class, ProdutoDAO.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix( ".jsp");
>>>>>>> 24c894f8d36b4cb7674ec43582b4945986d63ed9
		return resolver;
	}

}
<<<<<<< HEAD
																																																												 
=======
	
>>>>>>> 24c894f8d36b4cb7674ec43582b4945986d63ed9
