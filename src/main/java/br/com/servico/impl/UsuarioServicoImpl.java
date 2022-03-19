package br.com.servico.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import br.com.model.Usuario;
import br.com.servico.UsuarioServico;

@Scope("singleton") // prototype
@Service
public class UsuarioServicoImpl implements UsuarioServico{

	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuário: " + usuario);
	}
	
}
