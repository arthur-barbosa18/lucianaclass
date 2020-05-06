import java.util.Scanner;
import java.text.DecimalFormat;

public class Lista8 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner leia = new Scanner (System.in);
    DecimalFormat real = new DecimalFormat ("R$ #,##0.00");
    DecimalFormat porcentagem = new DecimalFormat ("%##");
    
    float totalArrecadado=0; 
    float valorASerPago=0;
    float valorBroa=0;
    float valorPao=0; 
    float valorPoupanca=0; 
    int quantidadeBroa=0; 
    int quantidadePao=0;
    int quantidadeGeral=0; 
    int codigo=99;
    int quantidade_total_paes = 0;
    int quantidade_total_broa = 0;
    int pagamentoCartao=0; 
    int pagamentoDinheiro=0;
    float totalBroa=0;
    float totalPao=0;
    int porcentagemPao=0;
    int porcentagemBroa=0;

    float value_venda_atual;
    float value_maior_venda=0;
    float value_menor_venda=0;

    float max_valor = Float.POSITIVE_INFINITY;
    float min_valor = 0;
    
    do {
      
      System.out.println("digite forma de pagamento = 0 para sair do programa");
      
      
      do {
        
        System.out.print("digite a quantidade de pão desejados: ");
        quantidadePao = leia.nextInt();
        quantidade_total_paes = quantidade_total_paes + quantidadePao;
        
        if (quantidadePao<0) { 
          System.out.print("digite uma quantidade que seja maior ou igual a zero");
          
        }
          
        
      } while (quantidadePao<0);
      
      do { 
        
        System.out.print("digite a quantidade de broa desejadas: ");
        quantidadeBroa = leia.nextInt();
        quantidade_total_broa = quantidade_total_broa + quantidadeBroa;
        
        if (quantidadeBroa<0) { 
          System.out.print("digite uma quantidade que seja maior ou igual a zero");
          
        }
        
        } while (quantidadeBroa<0);
      
      do { 
        quantidadeGeral = quantidade_total_paes + quantidade_total_broa;
        System.out.print("a quantidade total de produtos é: " + quantidadeGeral + "\n");
        //quantidadeGeral ++;
        
        if (quantidadeGeral <= 0) { 
          System.out.print("a quantidade total de produtos deve ser maior que zero");
        }
        
        
      } while (quantidadeGeral <= 0);
      
      do { 
        
        System.out.println("digite a forma de pagamento(1 para cartão, 2 para dinheiro, 0 para sair do programa): ");
        codigo = leia.nextInt(); 
        
        if (codigo>3 || codigo <0) {
          System.out.print("digite um código válido!");
        }
        
        else if (codigo==1) {
          pagamentoCartao++;
        }
          
        else if (codigo==2) { 
          pagamentoDinheiro ++;
        }
        
      } while (codigo>3 || codigo<0);
     
      if (codigo==0) {
      break;
      }
      
        valorASerPago = valorASerPago + (float) ((quantidadeBroa*2.90) + (quantidadePao*0.62)); 

        System.out.print("o valor a ser pago é: " + valorASerPago);
      
      value_venda_atual = ( ((float) quantidadeBroa* (float) 2.9) + ((float) quantidadePao* (float) 0.62));
      if(value_venda_atual > min_valor){
        min_valor = value_venda_atual;
        value_maior_venda= value_venda_atual;
      }
      if (value_venda_atual < max_valor){
        max_valor = value_venda_atual;
        value_menor_venda = value_venda_atual;
      }
      
    } while (true);
    
    totalArrecadado = quantidade_total_broa + quantidade_total_paes;
    totalBroa = (float) ((float) quantidade_total_broa*2.90);
    totalPao = (float) ((float) quantidade_total_paes*0.62); 
        valorPoupanca = (float) ((float) (totalArrecadado*30)/100); 
        porcentagemPao = (quantidadePao*100)/quantidadeGeral; 
        porcentagemBroa = (quantidadeBroa*100)/quantidadeGeral;
        
    
    System.out.println("o total de produtos vendidos é: " + quantidadeGeral);
  
        System.out.println("o total arrecadado com a venda de broas é: " + real.format (totalBroa));
       
        System.out.println("o total arrecadado com a venda de pães é: " + real.format (totalPao));
        
        System.out.println("a quantidade arrecadada foi: " + real.format (totalArrecadado)); 
        
        System.out.println("o valor arreacadado para a poupança é: " + real.format (valorPoupanca));
        
        System.out.println("a porcentagem de pão vendidos é: " + porcentagem.format(porcentagemPao));
        
        System.out.println("a porcentagem de broa vendidos é: " + porcentagem.format(porcentagemBroa));

        System.out.println("Maior valor: " + value_maior_venda);
        System.out.println("Menor valor: " + value_menor_venda);
        
        
        
        
        
    

  }

}