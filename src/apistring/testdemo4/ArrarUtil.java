package apistring.testdemo4;

public class ArrarUtil {
    private ArrarUtil() {}
    public static String printArray(int[] arr){
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str+=arr[i]+"]";
            }
            else{
                str=str+arr[i]+", ";
            }
        }
        return str;
    }

}
