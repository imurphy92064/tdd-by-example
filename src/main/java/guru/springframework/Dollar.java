package guru.springframework;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int mulitplier){
        return new Dollar(this.amount * mulitplier);
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return this.amount == dollar.amount;
    }
}
