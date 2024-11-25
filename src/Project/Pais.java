package Project;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private List<Pais> fronteiras;

    // Construtor
    public Pais(String codigoISO, String nome, long populacao, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    // Getters e Setters
    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    // Método para verificar igualdade semântica
    public boolean equals(Pais outro) {
        return this.codigoISO.equalsIgnoreCase(outro.codigoISO);
    }

    // Método para verificar se outro país é limítrofe
    public boolean eVizinho(Pais outro) {
        return this.fronteiras.contains(outro);
    }

    // Método que retorna a densidade populacional
    public double densidadePopulacional() {
        return populacao / dimensao;
    }

    // Método que adiciona um país à lista de fronteiras (limite de 40)
    public void adicionarFronteira(Pais pais) {
        if (this.fronteiras.size() < 40 && !this.equals(pais) && !this.fronteiras.contains(pais)) {
            this.fronteiras.add(pais);
        }
    }

    // Método que retorna a lista de vizinhos comuns
    public List<Pais> vizinhosComuns(Pais outro) {
        List<Pais> comuns = new ArrayList<>();
        for (Pais pais : this.fronteiras) {
            if (outro.fronteiras.contains(pais)) {
                comuns.add(pais);
            }
        }
        return comuns;
    }
}
