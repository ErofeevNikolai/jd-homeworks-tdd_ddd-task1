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
        double interestRateMonth = INTEREST / (12 * 100);
        return (Math.ceil(CREDIT_SIZE * (interestRateMonth + interestRateMonth / (Math.pow((1 + interestRateMonth), LOAN_PRIOD) - 1))*100)/100);
    }

    //Рассчет общей суммы к возврату в банк
    public double amountRefundBank() {
        return monthlyPayment()*LOAN_PRIOD;
    }

    //Рассчет переплаты за весь период
    public double overpaymentsEntirePeriod() {
        return amountRefundBank() - CREDIT_SIZE;
    }
}
