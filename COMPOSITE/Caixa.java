package COMPOSITE;

import java.util.ArrayList;
import java.util.List;

public class Caixa implements PedidoComponente {

    private String descricao;
    private List<PedidoComponente> conteudo = new ArrayList<>();

    public Caixa(String descricao) {
        this.descricao = descricao;
    }

    public void adicionar(PedidoComponente componente) {
     conteudo.add(componente);
    }

    @Override
    public double getPreco() {
    double total = 0;
    for (PedidoComponente c : conteudo) {
     total += c.getPreco();
     }

    System.out.println(descricao + " - Total: R$" + total);
    return total;
     }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "+ Caixa: " + descricao);
       for (PedidoComponente c : conteudo) {
        c.exibir(prefixo);
        }

}
       
}