/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PacoteTeste;

import com.mycompany.sistemapedidocamisas.Pedido;
import com.mycompany.sistemapedidocamisas.PedidoItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yure
 */
public class PedidoTest {

    /**
     * CT1 - Teste de criação de um pedido pelo metodo testCriacaoPedido. R: deverá criar pedido normalmente.
     */
    @Test
    public void testCriacaoPedido() {
        String nomeAluno = "Pedro";
        String tamanhoEscolhido = "M";
        String corSelecionada = "Vermelho";

        Pedido pedido = new Pedido(nomeAluno, tamanhoEscolhido, corSelecionada);
      
        assertEquals(nomeAluno, pedido.getAluno(), "O nome do aluno não corresponde.");
        assertEquals(tamanhoEscolhido, pedido.getTamanho(), "O tamanho da camisa não corresponde.");
        assertEquals(corSelecionada, pedido.getCor(), "A cor da camisa não corresponde.");
        assertEquals(50.00, pedido.getValor(), "O valor da camisa não corresponde.");
    }

    /**
     * CT2 - Teste de criação de pedido com campo Aluno vazio retornando
     * Exception.
     */
    @Test
    public void testCriacaoPedidoAlunoVazio() {

        String alunoVazio = "";
        String tamanho = "P";
        String cor = "Branco";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Pedido(alunoVazio, tamanho, cor);
        }, "É lançar para estourar uma IllegalArgumentException para aluno vazio.");
    }

    /**
     * CT3 - Teste de criação de pedido com multiplos pedidos e verificando se
     * valor total dos pedidos estão corretos.
     */
    @Test

    public void testCalcularTotalMultiplosPedidos() {
        PedidoItem pedidoD = new PedidoItem();

        try {
            Pedido pedido1 = new Pedido("Pedro", "P", "Azul");
            Pedido pedido2 = new Pedido("Maria", "M", "Vermelha");

            pedidoD.adicionarPedido(pedido1);
            pedidoD.adicionarPedido(pedido2);

            double totalValor = pedidoD.calcularTotal();

            double totalEsperado = 2 * 50.00;
            assertEquals(totalEsperado, totalValor, "O valor total não corresponde.");
        } catch (IllegalArgumentException e) {
            fail("Erro ao criar pedido para o teste: " + e);
        }
    }
}
