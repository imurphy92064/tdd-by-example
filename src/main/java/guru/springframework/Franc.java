package guru.springframework;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int mulitplier){
        return new Franc(this.amount * mulitplier);
    }

    public boolean equals(Object object){
        Franc franc = (Franc) object;
        return this.amount == franc.amount;
    }
}
