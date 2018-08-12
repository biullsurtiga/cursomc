package com.urtiga.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urtiga.cursomc.domain.Categoria;
import com.urtiga.cursomc.repositories.CategoriaRepository;
import com.urtiga.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + 
												Categoria.class.getName());
		}
		return obj;
	}

}
