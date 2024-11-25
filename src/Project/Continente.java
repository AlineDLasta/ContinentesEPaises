package Project;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    // Construtor
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    // Método para adicionar países ao continente
    public void adicionarPais(Pais pais) {
        this.paises.add(pais);
    }

    // Método que retorna a dimensão total do continente
    public double dimensaoTotal() {
        double total = 0;
        for (Pais pais : paises) {
            total += pais.getDimensao();
        }
        return total;
    }

    // Método que retorna a população total do continente
    public long populacaoTotal() {
        long total = 0;
        for (Pais pais : paises) {
            total += pais.getPopulacao();
        }
        return total;
    }

    // Método que retorna a densidade populacional do continente
    public double densidadePopulacional() {
        return populacaoTotal() / dimensaoTotal();
    }

    // Método que retorna o país com maior população
    public Pais paisComMaiorPopulacao() {
        Pais maior = null;
        for (Pais pais : paises) {
            if (maior == null || pais.getPopulacao() > maior.getPopulacao()) {
                maior = pais;
            }
        }
        return maior;
    }

    // Método que retorna o país com menor população
    public Pais paisComMenorPopulacao() {
        Pais menor = null;
        for (Pais pais : paises) {
            if (menor == null || pais.getPopulacao() < menor.getPopulacao()) {
                menor = pais;
            }
        }
        return menor;
    }

    // Método que retorna o país de maior dimensão
    public Pais paisMaiorDimensao() {
        Pais maior = null;
        for (Pais pais : paises) {
            if (maior == null || pais.getDimensao() > maior.getDimensao()) {
                maior = pais;
            }
        }
        return maior;
    }

    // Método que retorna o país de menor dimensão
    public Pais paisMenorDimensao() {
        Pais menor = null;
        for (Pais pais : paises) {
            if (menor == null || pais.getDimensao() < menor.getDimensao()) {
                menor = pais;
            }
        }
        return menor;
    }

    // Método que retorna a razão territorial entre maior e menor país
    public double razaoTerritorial() {
        Pais maior = paisMaiorDimensao();
        Pais menor = paisMenorDimensao();
        if (maior != null && menor != null) {
            return maior.getDimensao() / menor.getDimensao();
        }
        return 0;
    }
}
