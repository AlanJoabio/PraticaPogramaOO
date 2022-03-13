import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

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
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlan = new Dev();
        devAlan.setNome("Alan Jobio");
        devAlan.inscriverBotcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Alan" + devAlan.getConteudosInscritos());
        devAlan.progredir();
        devAlan.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Alan" + devAlan.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Alan" + devAlan.getConteudosConcluidos());
        System.out.println("XP:" + devAlan.calcularTotalXp());

        System.out.println("-------");

        Dev devDaiane = new Dev();
        devDaiane.setNome("Daiane");
        devDaiane.inscriverBotcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Daiane" + devDaiane.getConteudosInscritos());
        devDaiane.progredir();
        devDaiane.progredir();
        devDaiane.progredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Daiane" + devDaiane.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Daiane" + devDaiane.getConteudosConcluidos());
        System.out.println("XP:" + devDaiane.calcularTotalXp());

    }
}
