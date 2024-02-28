package org.desafio;

import org.desafio.domain.Bootcamp;
import org.desafio.domain.Curso;
import org.desafio.domain.Dev;
import org.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso python");
        curso2.setDescricao("Descricao do curso de python");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descricao da mentoria de java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos"+ devLeonardo.getNome() + devLeonardo.getConteudosInscritos());
        devLeonardo.progredir();
        devLeonardo.progredir();
        System.out.println("---");
        System.out.println("Conteudos concluidos" + devLeonardo.getNome() + devLeonardo.getConteudosConcluidos());
        System.out.println("Conteudos inscritos" + devLeonardo.getNome() + devLeonardo.getConteudosInscritos());
        System.out.println("XP: " + devLeonardo.calcularTotalXp());

        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJoao.getNome() + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteudos concluidos" + devJoao.getNome() + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos inscritos" + devJoao.getNome() + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}