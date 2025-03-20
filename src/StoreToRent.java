// StoreToRent类
class StoreToRent {
    private final double INTEREST_RATE = 0.25;
    private boolean loanRequired;
    private double loanAmount;
    private int loanPaymentTerm;

    // INTEREST_RATE的getter方法
    public double getINTEREST_RATE() {
        return INTEREST_RATE;
    }

    // loanRequired的getter方法
    public boolean isLoanRequired() {
        return loanRequired;
    }

    // loanAmount的getter方法
    public double getLoanAmount() {
        return loanAmount;
    }

    // loanPaymentTerm的getter方法
    public int getLoanPaymentTerm() {
        return loanPaymentTerm;
    }

    // 构造函数
    public StoreToRent(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        this.loanRequired = loanRequired;
        this.loanAmount = loanAmount;
        this.loanPaymentTerm = loanPaymentTerm;
    }

    // 计算贷款融资的方法
    public double calculateLoanFinancing() {
        if (loanRequired) {
            return (loanAmount * (1 + INTEREST_RATE)) / loanPaymentTerm;
        }
        return 0;
    }
}
