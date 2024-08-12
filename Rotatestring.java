public class Rotatestring {
   // public static void main(String[] args) {
        
    
    public boolean rotate(String s,String goal){
        return(s.length()==goal.length()&&(s+s).contains(s));


    }
    public static void main(String[] args) {
       // String s="abcd";

        Rotatestring sc=new Rotatestring();
      System.out.println(sc.rotate("abcd","bcda"));
    }
}
