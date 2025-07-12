/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidocamisas;

/**
 *
 * @author Yure
 */
public class Pedido {
    private int idPedido;
    private String aluno;
    private String tamanho;
    private String cor;
    private final double VALOR_UNITARIO = 50.00;
    
   public Pedido(String aluno, String tamanho, String cor) {
        if(aluno == null || aluno.isEmpty()) {
            throw new IllegalArgumentException("O nome do aluno não pode ser vazio.");
        }
        
        this.aluno = aluno;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public int getIdPedido() {
        return idPedido;
    }
 public void setIdPedido(int proxId) {
     this.idPedido = idPedido;
 }
    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public double getValor() {
        return VALOR_UNITARIO;
    }

}
