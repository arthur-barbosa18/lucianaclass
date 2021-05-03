import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GerenteProdutos {

    public static final ArrayList<ProdutoFabricado> produtosFabricados = new ArrayList<ProdutoFabricado>();

    public static ArrayList<String> getIngredientes(String nome) {
        ArrayList<String> ingredientes =  new ArrayList<>();
        for(ProdutoFabricado produtoFabricado : produtosFabricados) {
            if (produtoFabricado.getNome().equalsIgnoreCase(nome)) {
                produtoFabricado.ingredientes.forEach( (ingrediente )-> {
                    ingredientes.add(ingrediente.getNome());
                });
            }
        }
        return ingredientes;
    }


    public static float getValorCompra(String nome) {
        for(IProdutoFabricado produtoFabricado : produtosFabricados) {
            if (produtoFabricado.getNome().equalsIgnoreCase(nome)) {
                return produtoFabricado.getCusto();
            }
        }
        return 0;
    }

    public static ProdutoFabricado getProdutoFabricado(String nome) {
        for (ProdutoFabricado produtoFabricado : produtosFabricados) {
            if (produtoFabricado.getNome().equalsIgnoreCase(nome)) {
                System.out.println("44444444");
                return produtoFabricado;
            }
        }
        return null;
    }



    public IProduto reducaoCusto(IProduto produtoComprado) {
        if(produtoComprado.getCusto() > GerenteProdutos.getValorCompra(produtoComprado.getNome())) {
            produtoComprado = GerenteProdutos.getProdutoFabricado(produtoComprado.getNome());
        }
        return produtoComprado;
    }
}