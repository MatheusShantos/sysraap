/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upe.sysraap.bean;

import br.upe.sysraap.dao.AlunoDao;
import br.upe.sysraap.model.Aluno;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author mathe
 */
@ManagedBean(name = "alunoMB")
public class AlunoBean {

    private Aluno aluno;
    private List<Aluno> lista;

    public String getNome() {
        return "Matheus";
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> getLista() {
        return lista;
    }

    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }

    public void salvar() {
        AlunoDao dao = new AlunoDao();
        dao.salvar(aluno);

        inicializar();
    }

    @PostConstruct
    public void inicializar() {
        aluno = new Aluno();
    }
}
