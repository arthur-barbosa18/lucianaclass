import java.text.*;
import java.util.*;
import java.lang.Math;




public class Main {


    public static void main(String[] argv) throws Exception {

        IProduto acucar = new Produto("açucar", 10);
        IProduto farinha = new Produto("farinha", 8);
        IProduto ovo = new Produto("ovo", 12);
        IProduto chocolate = new Produto("chocolate", 15);
        IProduto fermento = new Produto("fermento", 5);
        IProduto bolo = new Produto("bolo", 100);
        ProdutoFabricado boloFabricado = new ProdutoFabricado("bolo", acucar, farinha, ovo, chocolate, fermento);
        GerenteProdutos.produtosFabricados.add(boloFabricado);
        GerenteProdutos gerente = new GerenteProdutos();
        System.out.println(bolo.getCusto());

        bolo = gerente.reducaoCusto(bolo);

        System.out.println(bolo.getCusto());

    }

}

//ArrayList<User> arr_user = new ArrayList<User>();