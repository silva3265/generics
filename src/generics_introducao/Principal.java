package generics_introducao;


import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>(); /* Arraylist do tipo cliente */
//        var clientes = new ArrayList<Cliente>(); 
        clientes.add(new Cliente("Supermercado Pague e Leve", 2_000_000)); /* adicionando um novo cliente */
        clientes.add(new Cliente("Posto Gasolina Boa", 800_000));
//        clientes.add("José"); // não vai funcionar porque o tipo agora esta tipado (generics)

        double totalFaturamento = 0d;
        
        for (Cliente cliente : clientes) { /* a variavel 'cliente' do for vai percorrer a lista de 'clientes' do ArrayList */
            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println(totalFaturamento);
    }

}