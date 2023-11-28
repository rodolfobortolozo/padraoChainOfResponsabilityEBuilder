package br.com.chainofresponsibility.pedido;

import java.util.ArrayList;

public class PedidoVendaBuilder {

    private Pedido instancia;

    public PedidoVendaBuilder(){
        this.instancia = new Pedido();
    }

    public PedidoVendaBuilder comCliente(Long id, String nome){
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        this.instancia.setCliente(cliente);

        return this;
    }

    public PedidoVendaBuilder comItem(Long id, String nome, Double valorUnitario, Double quantidade){
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setId(id);
        itemPedido.setValorUnitario(valorUnitario);
        itemPedido.setQuantidade(quantidade);

        if(this.instancia.getItemPedido() == null){
            this.instancia.setItemPedido(new ArrayList<>());
        }

        this.instancia.getItemPedido().add(itemPedido);

        return this;
    }

    public Pedido construir(){
        return this.instancia;
    }
}
