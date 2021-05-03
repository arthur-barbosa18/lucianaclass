import java.util.ArrayList;
import java.util.Collections;

public class ProdutoFabricado implements IProdutoFabricado {

    private int numeroIngredientes;
    private String name;
    private float custo;
    public ArrayList<IProduto> ingredientes = new ArrayList<IProduto>();

    ProdutoFabricado(String name, IProduto... ingredientes) {
        this.name = name;
        this.numeroIngredientes = ingredientes.length; //https://www.tutorialspoint.com/demonstrating-variable-length-arguments-in-java#:~:text=A%20method%20with%20variable%20length,overloaded%20methods%20are%20not%20required.
        //this.ingredientes.addAll(ingredientes);
        Collections.addAll(this.ingredientes, ingredientes);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNome() {
        return this.name;
    }

    public int getNumeroIngredientes() {
        return this.numeroIngredientes;
    }

    public IProduto getIngrediente(int numero) {
        return ingredientes.get(numero);
    }

    public float getCusto() {
        this.custo = 0;
        for(int i = 0; i < this.numeroIngredientes; i++) {
            this.custo += ingredientes.get(i).getCusto();
        }
        return this.custo;
    }


}
