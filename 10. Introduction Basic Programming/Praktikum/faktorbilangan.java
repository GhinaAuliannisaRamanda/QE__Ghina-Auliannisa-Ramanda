import java.util.Scanner;

 public class faktorbilangan {
     public static void main(String[] args){
         int bilangan;
         Scanner a = new Scanner(System.in);
         System.out.println("Masukkan Angka");
         bilangan = a.nextInt();
         System.out.println("faktornya yaitu ");
         for(int i = 1; i  <= bilangan; i++){
             if(bilangan % i == 0){
                 System.out.print(i  + " ");
             }
         }
     }

}
