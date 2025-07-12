/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidocamisas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yure
 */
public class PedidoItem {
    private List<Pedido> itens;
    private int proxId = 1; 
    
    public PedidoItem(){
        this.itens = new ArrayList<>();
   }
   public void adicionarPedido(Pedido pedido) {
        if(pedido != null) {
            pedido.setIdPedido(proxId);
            this.itens.add(pedido);
            proxId++;
            
        }
   }
   
   public double calcularTotal() {
       double total = 0.0;
       
       for(Pedido pedido : itens) {
           total+= pedido.getValor();
   }
       return total;
}
}