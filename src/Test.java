import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        //extracted(arr);
        String[] str = {"flower", "flow", "flight"};
        //String prefix = longestCommonPrefix(str);
       // System.out.println("Longest Common Prefix: " + prefix);
        Optional<String> reduce = Arrays.stream(str).reduce((s1, s2) -> {
            int i = 0;
            while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
                i++;
            }
            return s1.substring(0, i);
        });
        System.out.println(reduce);

    }

    /* private static void extracted(int[] arr) {
         int target = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == 0) {
                 System.out.println(i);
             }
         }
     }*/

//    public static String longestCommonPrefix(String[] str) {
//        if (str == null ||  str.length == 0) return "";
//        String prifix = str[0];
//        for(int i=1;i<str.length;i++){
//            while (str[i].indexOf(prifix)!=0){
//               // while (!str[i].startsWith(prifix)){
//                prifix = prifix.substring(0, prifix.length() - 1);
//                if (prifix.isEmpty())   return "";
//
//            }
//        }
//        return prifix;
//    }

}
