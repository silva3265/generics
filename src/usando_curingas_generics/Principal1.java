package usando_curingas_generics;

public class Principal1 {

    public static void main(String[] args) {
        Colecao<Produto> produtos = new Fila<>();
        produtos.colocar(new Produto("Arroz"));
        produtos.colocar(new Produto("FeijÃ£o"));
        produtos.colocar(new Produto("Ã�gua de coco"));

        retirarTodos(produtos);

        Colecao<String> nomes = new Pilha<>();
        nomes.colocar("JoÃ£o");
        nomes.colocar("Maria");

        retirarTodos(nomes);
    }

    private static void retirarTodos(Colecao<?> objetos) { /* '?' tipo coringa */
        try {
            int i = 1;
            while (true) {
                Object objeto = objetos.retirar();
                System.out.printf("%d. %s%n", i, objeto);
                i++;
            }
        } catch (ColecaoVaziaException e) {
            System.out.println("ColeÃ§Ã£o de objetos esgotada");
        }
    }

}