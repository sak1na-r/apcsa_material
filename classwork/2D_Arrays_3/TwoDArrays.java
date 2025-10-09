import java.util.Arrays;

public class TwoDArrays{
    public static void main(String[]args){
    
    //sumMatrix in a row
    
    int[][] arr1 =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println("sumMatrix of row: ");

    System.out.println( sumMatrix(arr1, 1) );
    
    //sumMatrix in a range

    int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println("sumMatrix of range: ");

    System.out.println( sumMatrix(arr2, 1, 2) );

    //countZeros

    int[][] arr3 = {{1, 0, 3, 4, 5, 0}, {7, 8, 9, 0, 0}};

    System.out.println("After countZeros: ");

    System.out.println( countZeros(arr3) );

    //updateValue

    int[][] arr4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println("Before updateValue 1: ");
    
    System.out.println( Arrays.deepToString( arr4 ) );

    System.out.println("After updateValue 1: ");

    updateValue(arr4, 2);

    System.out.println( Arrays.deepToString( arr4 ) );

    //replaceNegative

    int[][] arr5 = {{-1, 8, 3}, {-4, 5, 6}, {7, -2, 9}};

    System.out.println("Before replaceNegative: ");
    
    System.out.println( Arrays.deepToString( arr5 ) );

    System.out.println("After replaceNegative: ");
    
    replaceNegative(arr5);

    System.out.println( Arrays.deepToString( arr5 ) );

    //copy

    int[][] arr6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println("After copy: ");

    System.out.println(Arrays.deepToString( copy(arr6) ));

    //htmlTable

    int[][] arr7 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println("Before htmlTable: ");
    
    System.out.println(Arrays.deepToString( arr7 ));

    System.out.println("After htmlTable: ");

    System.out.println( htmlTable(arr7) );
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////

    // Method Overloading: The next two methods have the same name and different parameter list

    // Returns the sum of all elements in a specific row
    public static int sumMatrix(int[][] matrix, int row) {
        int sum = 0;
        for (int c = 0; c < matrix[row].length; c++) {
            sum += matrix[row][c];
        }
        return sum;
    }

    // Returns the sum of all elements between rowStart and rowEnd (inclusive).
    public static int sumMatrix(int[][] matrix, int rowStart, int rowEnd){
        int sum = 0;
        for (int r = rowStart; r <= rowEnd; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
        }
        return sum;
    }

    // Return how many elements are zero in the 2D array
    public static int countZeros(int[][] nums){
        int zeros = 0;
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                if (nums[r][c] == 0) {zeros += 1;}
            }
        }
        return zeros;
    }

    /* The last element in each array in a 2D array is incorrect.
       Fix the last element of each row in the 2D array as follows:
       1st row, last col = number of rows
       2nd row, last col = total number of elements in the array
       3rd row, last col = sum of values in first and last rows in the 2D array
       Other rows, last col = 0
       Use updateValue(int[][] array, int row) to set each value.
       Call updateValue three times (once for each fix).
       Precondition: arr.length >= 3, row and col are valid indixes */
     public static void updateValue(int[][] arr, int row) {
        int last = arr[0].length - 1;

        if (row==0) {arr[row][last] = arr.length;}
        else if (row==1) {arr[1][last] = arr.length*(last+1);}

        else if (row==2) {
            int sumFirstLast = 0;
            for (int c = 0; c < arr[0].length; c++) {
                sumFirstLast += arr[0][c] + arr[arr.length-1][c];
                arr[row][last] = sumFirstLast;
            }
        }
        else {arr[row][last] = 0;}
    }
    
    /* Modify a given 2D array of integer as follows:
       Replace all the negative values:
         - When the row number is the same as the column number replace that negative with the value 1
         - All other negatives replace with 0 */
    public static void replaceNegative(int[][] vals){
        for (int r = 0; r < vals.length; r++) {
            for (int c = 0; c < vals[r].length; c++) {
                if (vals[r][c] < 0) {
                    if (r==c) {vals[r][c] = 1;}
                    else {vals[r][c] = 0;}
                }
            }
        }
    }

    /* Make a copy of the given 2d array.
       When testing : make sure that changing the original does not change the copy.
       DO NOT use any built in methods that copy an array.
       You may write a helper method for this. */
    public static int[][] copy(int[][] nums){
        int[][] copyNums = new int[nums.length][nums[0].length];
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                copyNums[r][c] = nums[r][c];
            }
        }
        return copyNums;
    }


    /* Make an HTML table by putting a table tag around the entire 2d array,
       tr tags around each row, and td tags around each value.
       You may use a helper method
       Note there is no whitespace in the string, it all one line with no spaces/tabs.
       e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
       "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>" */
    public static String htmlTable(int[][]nums){
        String result = "";
        result += "<table>";
        for (int r = 0; r < nums.length; r++) {
            result += "<tr>";
            for (int c = 0; c < nums[r].length; c++) {
                result += "<td>";
                result += nums[r][c];
                result += "</td>";
            }
            result += "</tr>";
        }
        result += "</table>";
        return result;
    }







}
