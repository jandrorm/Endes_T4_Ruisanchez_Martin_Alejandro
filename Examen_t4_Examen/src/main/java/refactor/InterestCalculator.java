package refactor;
/*
 * Refactoriza el siguiente código de forma para evitar utilizar un número mágico
 * y repetir el número cada vez que se utiliza.
 */
public class InterestCalculator {
    private final static int dias = 365;

    double calculateInterest(double principal, double rate, int time) {
        return principal * Math.pow(1 + (rate / dias), time * dias);
    }
}