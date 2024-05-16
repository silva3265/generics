package desafio_generics;

public class GerenciadorEstoque {

    private int quantidadeTotal;

    public void adicionar(Estocavel estocavel) {
        quantidadeTotal += estocavel.getQuantidadeEstoque();
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

}
