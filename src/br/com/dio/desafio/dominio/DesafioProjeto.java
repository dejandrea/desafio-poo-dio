package br.com.dio.desafio.dominio;

public class DesafioProjeto extends Conteudo{



    @Override
    public double calcularXp() {
        return XP_PADRAO+120;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() +
                '}';
    }
}
