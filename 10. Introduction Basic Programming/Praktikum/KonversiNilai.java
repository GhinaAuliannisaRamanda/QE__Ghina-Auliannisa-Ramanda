import java.util.Scanner;

class konversiNilai {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float nilai;

        //code
        System.out.print("Program Konversi Nilai\n");
        System.out.print("Masukkan Nilai: ");
        nilai=input.nextFloat();

        if(nilai>=80){
            System.out.println("Nilai Anda A");
        }
        else if(nilai<=79 && nilai>=65){
            System.out.println("Nilai Anda B+");
        }
        else if(nilai<=64 && nilai>=50){
            System.out.println("Nilai Anda B");
        }
        else if(nilai<=49 && nilai>=35){
            System.out.println("Nilai Anda C");
        }
        else if(nilai<=34 && nilai>=0){
            System.out.println("Nilai Anda D");
        }
        else if(nilai<0 && nilai>100){
            System.out.println("Input Invalid");
        }
    }
}