public class Product {
    public String productname;
    public double price;

    public Product(String productname,int price) {
        this.productname = productname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productname='" + productname + '\'' +
                ", price=" + price +
                '}';
    }
}
