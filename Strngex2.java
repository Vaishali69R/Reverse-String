public class Strngex2 {
    public static void main(String[] args) {
        String s = "vish@#12";
        int count=0;
     //   char ch= charAt(i);
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
                count++;
            }
          
        }
        System.out.println(count);
    }
}
