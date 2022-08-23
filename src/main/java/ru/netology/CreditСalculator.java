package ru.netology;

public class CreditСalculator {
    private final double CREDIT_SIZE;
    private final double INTEREST;
    private final double LOAN_PRIOD;

    CreditСalculator(double creditSize, double interest, double loanPriod) {
        this.CREDIT_SIZE = creditSize;
        this.INTEREST = interest;
        this.LOAN_PRIOD = loanPriod;
    }

    //Рассчет месячного платежа
    public double monthlyPayment() {
        return 0;
    }

    //Рассчет общей суммы к возврату в банк
    public double amountRefundBank() {
        return 1;
    }

    //Рассчет переплаты за весь период
    public double overpaymentsEntirePeriod() {
        return 11;
    }
}
