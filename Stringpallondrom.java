 class Stringpallondrom {
    public static void main(String[] args) {
        String name="naman";
        String rev="";
        char newchar;
        int l=name.length();
        for(int i=0;i<l;i++){
            newchar=name.charAt(i);
            rev=rev+newchar;
        }
        int n=name.length()-1;
        int x =0;
        int count=0;
        while(x<rev.length()&&name.charAt(n)==rev.charAt(x))
        {
count++;
n--;
x++;
        }
        if(count==name.length()){
            System.out.println(name + " Is a pallindrom");
        }
        else{
            System.out.println(name  + " is not pallindrom");
        }
    }
    
    
}
