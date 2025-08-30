/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.dio.bootcampjava;

import java.time.LocalDate;

/**
 *
 * @author janil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Programacao Orientada a Objeto");
        curso1.setDescricao("Java em nivel iniciante ao intermediario");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();
        curso2.setTitulo(" Desenvolvendo APIs");
        curso2.setDescricao(" curso para iniciantes");
        curso2.setCargaHoraria(38);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria sobre Java");
        mentoria.setDescricao("A linguagem Java no mercado de trabalho");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Start #7 - Java");
        bootcamp.setDescricao("Atividades com desafios teoricos e projetos");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJanilton = new Dev();
        devJanilton.setNome("Janilton Francisco");
        devJanilton.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Janilton:" + devJanilton.getConteudosInscritos());
        devJanilton.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Janilton: " + devJanilton.getConteudosInscritos());
        System.out.println("Conteudos concluidos Janilton: " + devJanilton.getConteudosConcluidos());
        System.out.println("XP: " + devJanilton.calcularTotalXp());

    }

}
