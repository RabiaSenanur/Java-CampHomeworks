public class Main {
    public static void main(String[] args) {
        //for döngüsü
        for (int i=1; i<10; i++ ){
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");
        // i++ = i+=1, i + 2 = i+=2

        //While Döngüsü
        int i = 1;
        while(i<10){
            System.out.println(i);
            i++;
        }//şarta uymazsa hiç çalışmaz.
        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=1;
        do {
            System.out.println(j);
            j++;
        } while(j<10);//şarta uymasa bile bir kere çalışır.
        System.out.println("Do-While Döngüsü Bitti");
    }
}