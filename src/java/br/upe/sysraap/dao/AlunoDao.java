/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upe.sysraap.dao;

import br.upe.sysraap.model.Aluno;
import java.util.List;
import br.upe.sysraap.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author mathe
 */
public class AlunoDao {
    
    public void salvar(Aluno aluno){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.persist(aluno);
        sessao.getTransaction().commit();
        sessao.close();
    }
    
    public List<Aluno>listar(){
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Aluno> lista = sessao.getNamedQuery("Aluno.findAll").list();
        sessao.close();
        return lista;
    }
}
