package guru.springframework;

public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int mulitplier){
        return Money.franc(this.amount*mulitplier);
    }
}
