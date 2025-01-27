

class CartaoCredito extends Pagamento {
    @Override
    void realizarPagamento() {
        System.out.println("Pagamento realizado com Cartão de Crédito");
    }
}
