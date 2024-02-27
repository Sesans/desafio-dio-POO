package org.desafio;

import org.desafio.domain.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descricao da mentoria de java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}