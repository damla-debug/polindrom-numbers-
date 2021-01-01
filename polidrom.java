//ANLAYANA KDAR TEKRAR ET
import java.util.Scanner;

public class polidrom {

   /* static boolean isPolindrom(int input){
        Boolean isPolindrom= true; 
        int temp, tersSayı=0, kalan;
        temp= input;

        while(temp!=0){
        kalan= temp%10;
        tersSayı= tersSayı%10+kalan;
       temp /=10;
        }
        if(input == tersSayı){
       return true;
        } else{
            return false;
        }
        
    }*/
    public static void main(String[] args) {
      //System.out.println(isPolindrom(123));
    
      Scanner scan= new Scanner(System.in);
      System.out.println("bir sayı giriniz");
      int polindrom = scan.nextInt();
       
      int temp= polindrom;
      int uzunluk = String.valueOf(polindrom).length();//integer sayınının uzunluğunu algılamayı sağlar
         System.out.println(uzunluk); 
    int kalan=0;
    int deger = 0;
   System.out.println(temp);
        for(int i=0; i<uzunluk; i++){
          kalan= polindrom%10;
          deger= deger*10+kalan;//sayıyı tersten yazdırır.
          polindrom= polindrom/10;
        }

        if(deger== temp){
            System.out.println("polinrom sayıdır"+deger);
        }else{
            System.out.println("polindrom değildir"+deger);
        }
    }
}
