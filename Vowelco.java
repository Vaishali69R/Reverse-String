public class Vowelco {
    public static void main(String  [] args) {
    String s = "Anamika";
    char ch;
    int countvowel =0;
    int countconstant=0;
    int l=s.length();
    for(int i =0;i<l;i++){
        ch=s.charAt(i);
        
        if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U')
        
   {
    countvowel++;
   }else{
    countconstant++;
   }
    }
   System.out.println(countvowel);
    System.out.println(countconstant);

    
}
}