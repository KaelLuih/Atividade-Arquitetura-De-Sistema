package service;

import model.Pedido;

public class CalculoDeFrete {

    public double processar(Pedido pedido)
            throws Exception {
        double frete = 0.0;
        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00;
        } else {
            frete = 0.0; // Frete grátis
        }
        double impostos =
                pedido.getValorTotal() * 0.15; // 15% de imposto fixo
        double valorFinal = pedido.getValorTotal() + frete + impostos;
// Simulação de pagamento e atualização de status
        pedido.setPago(true);

        return frete;
    }
}
