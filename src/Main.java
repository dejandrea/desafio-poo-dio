import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java básico");
        curso1.setDescricao("Java básico");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java intermediário");
        curso2.setDescricao("Java intermediário");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como programar");
        mentoria.setDescricao("Aprendendo progrmação na pratica");
        mentoria.setData(LocalDate.now());

        DesafioCodigo desafioCodigo1 = new DesafioCodigo();
        desafioCodigo1.setTitulo("Desafio Java básico");
        desafioCodigo1.setDescricao("Desafio Basico");

        DesafioProjeto desafioProjeto1 = new DesafioProjeto();
        desafioProjeto1.setTitulo("Abstraindo Bootcamp");
        desafioProjeto1.setDescricao("POO");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcampo Java");
        bootcamp.setDescricao("Curso de java completo");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(desafioCodigo1);
        bootcamp.getConteudos().add(desafioProjeto1);

        Dev dev1 = new Dev();
        dev1.setNome("Andrea");
        dev1.inscreverBootcamp(bootcamp);

        System.out.println("*****************"+dev1.getNome()+"********************");
        System.out.println("Conteúdos inscritos: "+dev1.getConteudosInscritos());
        System.out.println("XP: "+dev1.calcularTotalXp());


        dev1.progredir();
        System.out.println("Conteúdos concluídos: "+dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+dev1.getConteudosInscritos());
        System.out.println("XP: "+dev1.calcularTotalXp());

        dev1.progredir();
        System.out.println("Conteúdos concluídos: "+dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+dev1.getConteudosInscritos());
        System.out.println("XP: "+dev1.calcularTotalXp());

        dev1.progredir();
        System.out.println("Conteúdos concluídos: "+dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+dev1.getConteudosInscritos());
        System.out.println("XP: "+dev1.calcularTotalXp());

        dev1.progredir();
        System.out.println("Conteúdos concluídos: "+dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+dev1.getConteudosInscritos());
        System.out.println("XP: "+dev1.calcularTotalXp());

        dev1.progredir();
        System.out.println("Conteúdos concluídos: "+dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+dev1.getConteudosInscritos());
        System.out.println("XP: "+dev1.calcularTotalXp());


        Dev dev2 = new Dev();
        dev2.setNome("José");
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("*****************"+dev2.getNome()+"********************");
        System.out.println("Conteúdos inscritos: "+dev2.getConteudosInscritos());
        System.out.println("XP: "+dev2.calcularTotalXp());


        dev2.progredir();
        System.out.println("Conteúdos concluídos: "+dev2.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+dev2.getConteudosInscritos());
        System.out.println("XP: "+dev2.calcularTotalXp());

        dev2.progredir();
        System.out.println("Conteúdos concluídos: "+dev2.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: "+dev2.getConteudosInscritos());
        System.out.println("XP: "+dev2.calcularTotalXp());

    }
}
