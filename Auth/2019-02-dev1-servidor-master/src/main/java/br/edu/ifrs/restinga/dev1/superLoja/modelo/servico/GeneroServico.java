/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.dev1.superLoja.modelo.servico;

import br.edu.ifrs.restinga.dev1.superLoja.modelo.dao.GeneroDAO;
import br.edu.ifrs.restinga.dev1.superLoja.modelo.entidade.Genero;
import br.edu.ifrs.restinga.dev1.superLoja.modelo.entidade.Produto;
import br.edu.ifrs.restinga.dev1.superLoja.modelo.rn.RegraNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author jezer
 */
@Component
public class GeneroServico extends Servico<Genero>{
    @Autowired
    GeneroDAO generoDAO;
    
    @Override
    public CrudRepository<Genero, Integer> getDAO() {
        return generoDAO;
    }

    @Override
    public RegraNegocio<Genero> getRegraNegocio() {
        return null;
    }

}