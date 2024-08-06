public class Removestring {
    public static void main(String[] args) {
        String name="Aakansha";
        int sum;
        String newchar="";
        for(int i= 0;i<name.length();i++){ 
        if ('A'!=name.charAt(i)&&'a'!=name.charAt(i)) {
            newchar=newchar+name.charAt(i);
        }

    }
        name=newchar;
        System.out.println("new name is " + name);
    
}
}