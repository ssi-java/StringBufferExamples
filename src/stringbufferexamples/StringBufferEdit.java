package stringbufferexamples;

public class StringBufferEdit {
    public static void main(String[] args) {
        System.out.println("Checking Append Method==>>");
        StringBuffer sb1=new StringBuffer("This is Java.");
        sb1.append("Java Is Powerful");
        System.out.println(sb1);
        System.out.println("Checking Insert Method==>>");
        StringBuffer sb2=new StringBuffer("DemoText");
        sb2.insert(4, "NewData");
        System.out.println(sb2);
        System.out.println("Checking Replace Method==>>");
	StringBuffer sb3=new StringBuffer("someolddata");
	sb3.replace(4,7,"new");
        System.out.println(sb3);
        System.out.println("Checking setCharAt Method==>>");
        StringBuffer sb4=new StringBuffer("abcdef");
        sb4.setCharAt(3,'Z');
        System.out.println(sb4);
        System.out.println("Checking deleteCharAt Method==>>");
        StringBuffer sb5=new StringBuffer("abcdefgh");
	sb5.deleteCharAt(2);
        System.out.println(sb5);
        System.out.println("Checking delete Method==>>");
        StringBuffer sb6=new StringBuffer("abcdefghij");
	sb6.delete(2,6);
        System.out.println(sb6);
        System.out.println("Checking setLength Method==>>");
        StringBuffer sb7=new StringBuffer("hello user");
	sb7.setLength(5); 
        System.out.println(sb7);
        System.out.println("Checking reverse Method==>>");
        StringBuffer sb8=new StringBuffer("indore");
	sb8.reverse(); 
        System.out.println(sb8);
    }
}
