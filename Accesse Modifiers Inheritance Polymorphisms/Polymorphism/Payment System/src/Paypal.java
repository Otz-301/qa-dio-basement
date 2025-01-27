

class Paypal extends Pagamento {
    @Override
    void realizarPagamento() {
        System.out.println("Pagamento realizado via PayPal");
    }
}
