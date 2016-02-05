import java.math.BigDecimal;

/**
 * Created by tanya on 1/30/2016.
 */
public  class Product implements Comparable<Product> {

    private String name;
    private BigDecimal price;

    public Product (String name,BigDecimal price){
        this.name=name;
        this.price=price;
};
    public String getName() {
        return name;
    }

    public void setName() {
        this.name=name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void  setPrice () {
       this.price=price;
    }

    @Override
    public int compareTo(Product pr) {
        return this.getPrice().compareTo(pr.getPrice());
    }


};
