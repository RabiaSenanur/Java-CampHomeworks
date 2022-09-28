public class ProductValidator {
    static {
        System.out.println("Static constructive block worked.");
    }
    public ProductValidator() {
        System.out.println("The constructive block worked.");
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public  void something(){
        // Product manager'a bu class new ledikten sonra classın isminin yanına nokta konduğunda bu method gözükür.
    }

    /*public static class anotherClass{
        public static void remote(){

        }
    }*/

}
