package guru.springframework;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return this.currency;
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return this.amount == money.amount
                && this.currency == money.currency;
    }

    @Override
    public Expression times(int multiplier){
        return new Money(this.amount*multiplier, this.currency);
    }

    @Override
    public Money reduce(Bank bank, String to){
//        return this;
//        int rate = (currency.equals("CHF") && to.equals("USD")) ? 2 : 1;

        return new Money(amount/bank.rate(this.currency, to), to);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public Expression plus(Expression addmend){
        return new Sum(this, addmend);
    }
}
