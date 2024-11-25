package Project;

public class Main {
    public static void main(String[] args) {
        // Criando países
        Pais brasil = new Pais("BRA", "Brasil", 211000000, 8515767.049);
        Pais argentina = new Pais("ARG", "Argentina", 45195777, 2780400);
        Pais uruguai = new Pais("URY", "Uruguai", 3473727, 176215);

        // Definindo fronteiras
        brasil.adicionarFronteira(argentina);
        brasil.adicionarFronteira(uruguai);
        argentina.adicionarFronteira(brasil);

        // Criando continente
        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(uruguai);

        // Exemplo de uso dos métodos
        System.out.println("\033[34mDensidade populacional do Brasil: \033[0m" + brasil.densidadePopulacional());
        System.out.println("\033[34mPopulação total da América do Sul: \033[0m" + americaDoSul.populacaoTotal());
        System.out.println("\033[34mRazão territorial: \033[0m" + americaDoSul.razaoTerritorial());
    }
}
