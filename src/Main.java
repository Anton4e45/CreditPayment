public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(36,1_000_000,9.99);
        System.out.println("Ежемесячный платёж: " + (int) payment);
    }
}
