package service;

import model.Pedido;

public class ProcessarPedido {
    public double processar(Pedido pedido)
            throws Exception {
// 1. Lógica de Validação de Estoque
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }


        return 0;
    }
}



