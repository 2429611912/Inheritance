class StoreOneA extends StoreToRent {
    private boolean specialCustomer;
    private double monthlyPayment;
    // 折扣率，文档中未提及，假设为0.1
    private static final double DISCOUNT_RATE = 0.1;

    // 构造函数
    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    // 重写calculateLoanFinancing方法
    @Override
    public double calculateLoanFinancing() {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }
        return monthlyPayment;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Combining parent toString() \n" + super.toString() + "\nLOAN DETAILS (if applicable):\nLoan Amount: " + getLoanAmount() + "\nLoan Payment Term: " + getLoanPaymentTerm() + "\nInterest Rate: " + getINTEREST_RATE() + "\nSpecial Customer: " + specialCustomer + "\nMonthly Loan Payment: " + monthlyPayment + "\n and child toString()";
    }

    // showStoreInfo方法
    public void showStoreInfo() {
        System.out.println(toString());
    }
}