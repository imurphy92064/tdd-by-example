package guru.springframework;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int mulitplier){
        return new Franc(this.amount * mulitplier);
    }
}
