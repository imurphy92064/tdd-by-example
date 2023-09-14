package guru.springframework;

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int mulitplier){
        return new Dollar(this.amount * mulitplier);
    }


}
