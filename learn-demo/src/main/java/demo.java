/**
 * Created by zuolin on 17/4/19.
 */
public class Demo {
    public static void main(String[] args) {
        int a[][]= {{1, 2, 8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(findFixedNumber(a, 5));
    }

    public static boolean findFixedNumber(int matrix[][], int number){
        boolean found = false;
        if (matrix != null){
            int rows = matrix.length;
            int colums = matrix[0].length;
            int row = 0;
            int colum = colums - 1;
            while (row < rows && colum >= 0){
                if (matrix[row][colum] == number){
                    found = true;
                    break;
                }else if(matrix[row][colum] < number){
                    row++;
                }else{
                    colum --;
                }
            }
        }
        return found;
    }
}
