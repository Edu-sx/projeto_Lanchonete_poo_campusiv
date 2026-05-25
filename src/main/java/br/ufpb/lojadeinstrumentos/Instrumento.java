package br.ufpb.lojadeinstrumentos;

public class Instrumento {
    private String nome;
    private String tipo;
    private String categoria;
    private double preco;
    private String id;

    public String getId() {
        return this.id;
    }

    public Instrumento(String nome, String tipo, String categoria, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.categoria = categoria;
        this.preco = preco;
    }
    public Instrumento (){
        this("sem nome", "n/a", "sem categoria", 0);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getCategoria (){
        return this.categoria;
    }
    public void setCategoria (String categoria){
        this.categoria = categoria;
    }
}
