public class Stringexample {
    public static void main(String[] args) {
        String s = "Vaishali";
        String str = " ";
        for(int i=0;i<s.length();i++){
            str = s.charAt(i)+str;
        }
        System.out.println(str);
    }
}
