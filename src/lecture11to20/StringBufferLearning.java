package lecture11to20;

public class StringBufferLearning {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Swarali");
        sb.append(" Joglekar");
        System.out.println(sb);
        System.out.println(sb.capacity());

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.capacity());
        sb2.append("ertyuiopqsd"); // 11 characters
        System.out.println(sb2.capacity()); // 10+1= 11 -> 11*2 = 22

        String st = "Hello";
        st.concat(" World");
        System.out.println(st); //Hello

        StringBuffer sb3= new StringBuffer("abcd");
        System.out.println(sb3.capacity()); //16+4

    }
}
