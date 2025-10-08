public class ArrayMethods
{
    public static void main(String[] args){
      //print
      int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};      
      print(arr1);

      // "[[8, 4, 2], [1, 0, 9], [5, 7, 8]]"

      //findSum
      int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}};      
      
      System.out.println("Before findSum: ");
      print(arr2);

      System.out.println("After findSum: ");
      System.out.println( findSum(arr2) );

      // {{1,3,4},{2,4,3},{3,4,5}} ==> {{1,2,3},{3,4,4},{4,3,5}}

      //transpose
      int[][] arr3 = {{1,2,3}, {4,5,6}, {7,8,9}};      
      
      System.out.println("Before transpose: ");
      print(arr3);

      System.out.println("After transpose: ");
      print( transpose(arr3) );
    }
    
    //"[[8, 4, 2], [1, 0, 9], [5, 7, 8]]"

    public static void print(int[][] array){
        System.out.print("\"[");
        for (int r = 0; r < array.length; r++) {
            System.out.print("[");
            for (int c = 0; c < array[r].length; c++) {
                System.out.print(array[r][c]);
                if (c < array[r].length-1) {
                  System.out.print(", ");
                }
              }
              System.out.print("]");
              if (r < array.length - 1) {
                System.out.print(", ");
              }
            }
        System.out.println("]\"");
    }
  
    public static int findSum(int[][] array){
      int sum = 0;
      for (int r = 0; r < array.length; r++) {
        for (int c = 0; c < array[r].length; c++) {
          sum += array[r][c];
        }
      }
      return sum;
    }
    
    public static int[][] transpose(int[][] array){
      int[][] result = new int[array.length][array[0].length];
      for (int r = 0; r < array.length; r++) {
        for (int c = 0; c < array[0].length; c++) {
          result[c][r] = array[r][c];
        }
      }
      return result;
    }

}
