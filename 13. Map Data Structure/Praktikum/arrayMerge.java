import java.util.LinkedHashSet;
import java.util.Set;
public class arrayMerge {
    private static void print(String[] nama1, String[] nama2) {
            Set<String> nama = new LinkedHashSet<>();
            Set<String> names = new LinkedHashSet<>();

            for (int i=0; i<nama1.length; i++)
            {
                nama.add(nama1[i]);
            }

            for (int i=0; i<nama2.length; i++)
            {
                names.add(nama2[i]);
            }

            System.out.print("Input: " + nama);
            System.out.println(", " + names);

            for (int j=0; j<nama2.length; j++)
            {
                nama.add(nama2[j]);
            }
            System.out.println("Output: " + nama);
            System.out.println();
        }
        public static void main(String[] args) {
            String[] nama1 = {"kazuya", "jin", "lee"};
            String[] nama2 = {"kazuya", "feng"};
            print(nama1, nama2);

            String[] nama3 = {"lee", "jin"};
            String[] nama4 = {"kazuya", "panda"};
            print(nama3, nama4);
        }
    }
