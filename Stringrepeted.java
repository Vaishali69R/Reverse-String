public class Stringrepeted {
    public static void main(String[] args) {
        String str = "test string";
        char mostfrequent = ' ';
        int max = 0;
        for(int i=0;i<str.length();i++){
            int count = 0;
            for(int j=0;j<str.length();j++)
            {
                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
                if(count>max){
                    max=count;
                    mostfrequent=str.charAt(i);
                }
            }
        }
        System.out.println(mostfrequent);
        
    }
}
