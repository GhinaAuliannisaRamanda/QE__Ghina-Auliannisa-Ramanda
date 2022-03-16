import java.util.ArrayList;
import java.util.List;
public class angka {
    private static void print(String data) {
        List <Integer> result = new ArrayList<>();

        for (int i = 0; i < data.length(); i++) {
            int x = Integer.parseInt(String.valueOf(data.charAt(i)));
            result.add(x);
        }

        for (int a = result.size() - 1; a >= 0; a--) {
            // System.out.println("A: " + a);
            // System.out.println("=====");
            for (int b = a - 1; b >= 0; b--) {
                // System.out.println("B: "+b);
                if (result.get(a) == result.get(b)) {
                    result.remove(a);
                    result.remove(b);
                    // System.out.println(hasil);
                    // System.out.println("Size: "+hasil.size());
                    // System.out.println();
                    a = result.size();
                    break;
                }
            }
        }

        System.out.println("Input: '" + data + "'");
        System.out.println("Output: " + result);
        System.out.println();
    }

    public static void main(String[] args) {
        print("76523752");
        print("1122");
    }
}
