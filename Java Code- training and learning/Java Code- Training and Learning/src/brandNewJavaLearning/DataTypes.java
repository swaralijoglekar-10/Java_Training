package brandNewJavaLearning;

public class DataTypes {

    public static void main(String[] args) {

        byte b1 = 127; // range -128 to 127
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Character.MAX_VALUE);
        int x = Character.MAX_VALUE;
        System.out.println(x);

        float f = 2E7f; // scientific notation, 2 * 10^7
        //OR
        float f2= 2e7F; // scientific notation, 2 * 10^7

        char ch = 'व';
        int c = ch;
        System.out.println("Unicode value of "+ch+" is:"+c);

        char c2 = 2350; // म
        System.out.println(c2);

        int codePoint = 104578;
        char[] chars = Character.toChars(codePoint);
        System.out.println(new String(chars));

        int m,y,z;
        m=y=z=120;

        short _price;
        float $area;

    }
}
