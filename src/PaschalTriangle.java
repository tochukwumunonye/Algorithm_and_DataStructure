import java.util.ArrayList;

public class Solution {

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0){
            return triangle;
        }

        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        triangle.add(firstrow);

        for (int =1; i<numRows; i++){
            List<Integer> prevrow = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int j=1; j<1; j++) {
                row.add(prevrow.get(j-1) + prevrow.get(j));
            }

            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }
}
