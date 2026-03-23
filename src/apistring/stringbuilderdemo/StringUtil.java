package apistring.stringbuilderdemo;

public class StringUtil {
    private StringUtil() {
    }

    public static String reverse(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1){
                sb=sb.append(arr[i]+", ");
            }
            else {sb.append(arr[i]+"]") ;}
        }

        return sb.toString();
    }
}
