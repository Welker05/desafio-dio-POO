import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWelker = new Dev();
        devWelker.setNome("Welker");
        devWelker.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Welker: " + devWelker.getConteudosInscritos());
        devWelker.progredir();
        devWelker.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Welker: " + devWelker.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Welker: " + devWelker.getConteudosConcluidos());
        System.out.println("XP: " + devWelker.calcularTotalXp());

        System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Inscritos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
