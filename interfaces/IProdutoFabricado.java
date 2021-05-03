public interface IProdutoFabricado extends IProduto {

    public int getNumeroIngredientes();
    public IProduto getIngrediente(int numero);

}