public class Produto implements IProduto {

    public String name;
    private float custo;

    Produto(String name, float  custo) {
        this.name = name;
        this.custo = custo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String getNome() {
        return this.name;
    }
    public float getCusto() {
        return this.custo;
    }

}