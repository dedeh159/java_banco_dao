package org.senai;

import org.senai.dao.Conexao;
import org.senai.dao.EstudanteDAO;
import org.senai.dao.PessoaDAO;
import org.senai.dao.ProfessorDAO;
import org.senai.model.Estudante;
import org.senai.model.Pessoa;
import org.senai.model.Professor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        //preenchendo as pessoas
        //Pessoa bruno = new Pessoa(0,"brruno", "bruno@bruno.com");

        //inserindo pessoa
        PessoaDAO pessoaDAO = new PessoaDAO();

        //inserindo pessoas
        //pessoaDAO.inserir(bruno);

        //listando
        //System.out.println(pessoaDAO.listar());

        //atualizando a entidade
        //bruno.setNome("Bruno");
        //bruno.setEmail("bruno@correto.com");
        //pessoaDAO.atualizar(bruno);

        //deletando pessoa
        //pessoaDAO.deletar(3);

        //listando para impressão
        //List<Pessoa> pessoas = pessoaDAO.listar();

        //pessoas.forEach(System.out::println);

        //ProfessorDAO professorDAO = new ProfessorDAO();
        //Professor professor = new Professor(
        //       0,"Carlos Alberto2", "carlos2@universidade.com","Matemática"
        //);
        //professorDAO.inserir(professor);
        //System.out.println("Professor inserido: " + professor);
        //professorDAO.buscarPorId(5);

        //System.out.println(professorDAO.buscarPorId(5));

        //List<Professor> professores = professorDAO.listarTodos();
        //Professor profe = professores.getFirst();
//
        //System.out.println(profe);
        //for (Professor professor : professores) {
        //    System.out.println(professor);
        //}
        //profe.setNome("Maria");
        //profe.setDepartamento("Português");
        //profe.setEmail("maria@tudo.com");
//
        //professorDAO.atualizar(profe);
        //System.out.println(professorDAO.buscarPorId(5));
        //professorDAO.deletar(5);


        //abaixo testes com a classe estudante e estudanteDAO
        EstudanteDAO estudanteDAO = new EstudanteDAO();
        //Estudante jose = new Estudante(8,"José Almeida atualizado", "josecorreto@senai.com.br", "2253389");
        //estudanteDAO.inserir(jose);
        //estudanteDAO.buscarPorId(jose.getId());
        //estudanteDAO.atualizar(jose);

        //listando os estudantes

        List<Estudante> estudantes = estudanteDAO.listarTodos();
        estudantes.forEach(System.out::println);


        //para executar esse deletar de estudante também precisei executar o delete cascade no my sql
        //como foi com o codigo do professor visto em aula
        estudanteDAO.deletar(8);





    }
}