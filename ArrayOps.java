import java.util.Arrays;
public class ArrayOps {
  public static int sum(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count += arr[i];
    }
    return count;
  }

  public static int largest(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > result) {
        result = arr[i];
      }
    }
    return result;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        result[i] += sum(matrix[i]);
  }
    return result;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        result[i] += largest(matrix[i]);
  }
    return result;
  }


}
