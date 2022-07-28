package br.com.dio.desafio.dominio;

public class DesafioCodigo extends Conteudo{
    @Override
    public double calcularXp() {
        return XP_PADRAO+50;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() +
                '}';
    }
}
