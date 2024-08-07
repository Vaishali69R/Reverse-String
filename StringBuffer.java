
class BufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" java ");
        System.out.println(sb);
        //append method concatenates the given argument with this String.
        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.insert(1,"java") ;
        System.out.println(sb2);
        //insert the given String with this stringg at the given position.
        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.replace(1,3,"java");
        System.out.println(sb3);
        //replace given String from the specifide beginindex and endindex.
        StringBuffer sb4 = new StringBuffer("Hello");
        sb4.delete(1,4);
        System.out.println(sb4);
        //delete given string from the beginindex and endindex.
        StringBuffer sb5 = new StringBuffer("Hello");
        sb5.reverse();
        System.out.println(sb5);
        // reverse current string
        StringBuilder sd = new StringBuilder("Hello");
        sd.replace(1,3,"Info
        ");
        System.out.println(sd);
        }

    }


