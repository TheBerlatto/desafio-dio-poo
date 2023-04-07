import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);
       
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developers");
        bootcamp.setDescricao("Bootcamp desenvolvido com o intuito de proporcionar uma trilha completa em Java, para pessoas em busca de sua primeira formação no mundo técnológico!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Eduardo: " + devEduardo.getConteudosInscritos());
        
        devEduardo.progredir();
        devEduardo.progredir();
        System.out.println("---------PROGREDIU-----------");
        System.out.println("Conteúdos restantes Eduardo: " + devEduardo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Eduardo: " + devEduardo.getConteudosConcluidos());
        System.out.println("XP: " + devEduardo.calcularTotalXp());
        
        System.out.println("-------------------------------------------------------");
        
        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lucas: " + devLucas.getConteudosInscritos());
        
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("---------PROGREDIU-----------");
        System.out.println("Conteúdos restantes Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
    }
}