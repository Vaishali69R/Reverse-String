 class Sringcompare {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "SACHIN";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String b2="Sachin";
        String s3=new String("Sachin");
        System.out.println(s1==b2);
        System.out.println(s1==s3);
        String b3="Ratan";
        System.out.println(s1.compareTo(b2));
        System.out.println(s1.compareTo(b3));
        System.out.println(b3.compareTo(s2));
        System.out.println(s1.valueOf(s2));
        System.out.println(s1.startsWith("S"));
        System.out.println(s1.trim());
        System.out.println(s1.split(b2));
        System.out.println(s1.codePointBefore(3));
        System.out.println(s1.toUpperCase());


    }
    
}
