import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        //For if there are no element that means empty list
        if(numRows == 0) return result;

        //for if there is only one element 
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(numRows == 1) return result;

        //for if there are n number of rows 
        for(int i = 1; i < numRows ; i++ ){
            List<Integer> previousList = result.get(i-1);
            
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j = 0; j < i-1; j++){
                row.add(previousList.get(j) + previousList.get(j+1));
            }

            row.add(1);

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
            List<List<Integer>> ans = generate(10);
            System.out.println(ans);
    }
}