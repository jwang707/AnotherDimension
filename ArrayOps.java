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

  public static void main(String[] args) {
    int[] myNums = {0, 20, 3 , 1, 2};
    int[] blank = {};

    System.out.println(sum(myNums));
    System.out.println(sum(blank));
    System.out.println(largest(myNums));
  }

}
