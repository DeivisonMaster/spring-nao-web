package br.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.model.Usuario;
import br.com.servico.UsuarioServico;

public class Executa {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Executa.class.getPackage().getName());
		
		Usuario usuario = new Usuario("Deivison");
		UsuarioServico usuarioServico = appContext.getBean(UsuarioServico.class);
		usuarioServico.cadastrar(usuario);
	}
}
