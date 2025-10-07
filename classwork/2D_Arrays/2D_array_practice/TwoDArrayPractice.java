public class TwoDArrayPractice
{

  public static void main(String[] args)
    {
      //rowSwap
      int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};      
      
      System.out.println("Before rowSwap: ");
      print2dA(arr1);

      rowSwap(arr1, 0, 2)

      System.out.println("After rowSwap: ")
      print2dA(arr1);

      
      //colSwap
      int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}};      
      
      System.out.println("Before colSwap: ");
      print2dA(arr2);
      
      colSwap(arr2, 0, 2)

      System.out.println("After colSwap: ")
      print2dA(arr2);


      //fillRows
      int[][] arr3 = {{1,2,3}, {4,5,6}, {7,8,9}};      
      
      System.out.println("Before fillRows: ");
      print2dA(arr3);

      fillRows("hello", 3, 4)

      System.out.println("After fillRows: ")
      print2dA(arr3);

    }

  public static void print2dA(int[][] array){
      for (int r = 0; r < array.length; r++) {
        for (int c = 0; c < array[r].length; c++) {
          System.out.println(array[r][c] );
        }
        System.out.println();
      }
    }

  public static void print2dA(String[][] array){
      for (int r = 0; r < array.length; r++) {
        for (int c = 0; c < array[r].length; c++) {
          System.out.println(array[r][c] );
        }
        System.out.println();
      }
    }

  public static void rowSwap(int[][] array, int rowAIndex, int rowBIndex){
      int[] nums = array[rowAIndex];
      array[rowAIndex] = array[rowBIndex];
      array[rowBIndex] = nums;
    }

    public static void colSwap(int[][] array, int colAIndex, int colBIndex){
      for (int i = 0; i < array.length; i++) {
        int value = array[i][colAIndex];
        array[i][colAIndex] = array[i][colBIndex];
        array[i][colBIndex] = value;
      }
    }

    public static String[][] fillRows(String str, int rows, int cols)
    {   
      String[][] result = new String[rows][cols];
      int ind = 0;

      for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
          if (ind < str.length()) {
            result[r][c] = str.subtring(ind, ind+1);
            ind++
          }
          else {
            result[r][c] = null;
          }
        }
      }
        return result;
    }

}    
