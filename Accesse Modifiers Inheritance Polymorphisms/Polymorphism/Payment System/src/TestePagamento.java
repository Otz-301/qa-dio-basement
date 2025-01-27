

public class TestePagamento {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new Paypal()};
        for (Pagamento pagamento : pagamentos) {
            pagamento.realizarPagamento();
        }
    }
}