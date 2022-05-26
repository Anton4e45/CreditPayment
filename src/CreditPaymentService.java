public class CreditPaymentService {
    public double calculate(double time, double money, double precent) {
        double precentMonth = precent / (100 * 12);
        double y = 1 + precentMonth;

        double result = 1;
        for (double i = 1; i <= time; i++) {
            result = result * y;
        }

        double a = 1 - 1 / result;
        double x = precentMonth / a;

        double payment = money * x;
        return payment;
    }
}
