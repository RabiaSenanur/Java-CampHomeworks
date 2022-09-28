public class ProductManager {
    public void add(Product product){
        //ProductValidator validator = new ProductValidator(); static yapınca classın ismi ile çağrılır
        if (ProductValidator.isValid(product)) {
            System.out.println("Product was added");
        }else {
            System.out.println("Product information is invalid");
        }

        /*ProductValidator productValidator = new ProductValidator();
        productValidator.something();*/
    }

}
