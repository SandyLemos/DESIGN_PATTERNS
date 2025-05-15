package COMPOSITE;

public class Main {
    public static void main(String[] args) {
    Item item1 = new Item("Notebook", 3500.00);
    Item item2 = new Item("Mouse", 120.00);
     
    Caixa caixaPequena = new Caixa("Eletrônicos");
     caixaPequena.adicionar(item1);
     caixaPequena.adicionar(item2);
     
    Caixa caixaGrande = new Caixa("Pedido Completo");
     caixaGrande.adicionar(caixaPequena);
     caixaGrande.adicionar(new Item("Cupom Fiscal", 0.00));
     
     System.out.println("=== Hierarquia do Pedido ===");
     caixaGrande.exibir("");
     
     System.out.println("\n=== Totais ===");
    double totalFinal = caixaGrande.getPreco();
     System.out.println("TOTAL GERAL: R$" + totalFinal);
     }
 }
    
