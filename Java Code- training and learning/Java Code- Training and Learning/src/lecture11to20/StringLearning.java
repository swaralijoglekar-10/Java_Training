package lecture11to20;

public class StringLearning {
    public static void main(String[] args) {
        String s1 = "Hello";// in String pool
        String s2 = "Hello"; //refers to same String pool

        System.out.println(s1==s2); //true

        String s3 = new String("Hello");

        System.out.println(s1==s3); // false

        // intern() method
        String a = new String("Java").intern();
        String b = "Java";
        System.out.println(a==b); //true

        String str1 = "Hello";
        str1.concat("Sir");
        System.out.println(str1); //Hello

        String str2= str1.concat("Sir");
        System.out.println(str2); // Hello Sir

        System.out.println(str2.toUpperCase()+ "/n"+ str2.toLowerCase()+"/n"+
        str2.charAt(5)+"/n"+str2.indexOf('l')+"/n"+
                str2.lastIndexOf('l')
        );
    }
}
