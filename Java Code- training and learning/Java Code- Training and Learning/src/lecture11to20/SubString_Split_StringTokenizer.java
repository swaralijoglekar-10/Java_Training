package lecture11to20;

import java.util.StringTokenizer;

public class SubString_Split_StringTokenizer {
    public static void main(String[] args) {

        //1. Substring
        String str = "Hello Swarali, How are you?";
        System.out.println(str.substring(0, 5));

        //2. split
        String str2[] = str.split(" ");
        for(String s: str2){
            System.out.println(s);
        }

        System.out.println();

        //3. String tokenizer
        String country = "India USA UK Germany";
        StringTokenizer obj = new StringTokenizer(country, " ");
        while(obj.hasMoreElements()){
            String token = obj.nextToken();
            System.out.println(token);
        }

        System.out.println();

        //4. join()
        String gfg3 = String.join("-> ", "Wake up", "Eat",
                "Play", "Sleep", "Wake up");
        System.out.println(gfg3); //Wake up-> Eat-> Play-> Sleep-> Wake up

    }
}
