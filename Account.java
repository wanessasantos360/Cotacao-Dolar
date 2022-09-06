public class Account {

    private Double value;
    public Double getBalance() {
        return value;
    }

    public Double getBalance (Conversion conversion){
        return conversion.convert(value);
    }

    public void setValue(Double value){
        this.value = value;
    }
}