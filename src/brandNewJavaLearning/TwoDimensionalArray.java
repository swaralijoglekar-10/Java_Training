package brandNewJavaLearning;

import java.util.ArrayList;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(0);
        row1.add(-2);
        twoDList.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(-56);
        row2.add(-3);
        row2.add(67);
        twoDList.add(row2);

        int rowSize = twoDList.size();
        int colSize = twoDList.get(0).size();

        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                System.out.print(twoDList.get(i).get(j) +" ");
            }
            System.out.println();
        }


    }
}
