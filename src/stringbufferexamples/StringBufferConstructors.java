package stringbufferexamples;

public class StringBufferConstructors {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();//capacity=16,length=0
        StringBuffer sb2=new StringBuffer(50);//capacity=50,length=0
        StringBuffer sb3=new StringBuffer("indore");//capacity=22,length=6
        System.out.println("Capacity And Length Of Zero Arg Constructor");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println("Capacity And Length Of int Arg Constructor");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println("Capacity And Length Of String Arg Constructor");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
    }
    
}
