public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.desciption = "ASUS Laptop";
        product.price = 5000;
        product.stockAmount = 3;

        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);



    }
}