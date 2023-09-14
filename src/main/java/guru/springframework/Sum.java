package guru.springframework;

public class Sum implements Expression{
    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }


    //Reducing 2 Money objects into 1 Money object.
    @Override
    public Money reduce(Bank bank, String to){
        int amount = augmend.amount + addmend.amount;
        return new Money(amount, to);
    }
}
