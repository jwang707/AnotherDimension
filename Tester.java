import java.util.Arrays;
public class Tester{
  public static void main(String[] args) {
    int[] myNums = {0, 20, 3 , 1, 2};
    int[] blank = {};
    int[][] twodee = { {1, 2, 3, 4},
                       {1, 1, 1, 1},
                       {3, 3, 0, 5}};
    int[][] toodee = { {1, 2, 3, 4},
                       {2, 1, 2, 5},
                       {1, 2, 4, 3}};
    int[][] anotheronebitesthedust = { {4, 5, 6},
                                       {5, 4, 6},
                                       {4, 4, 1},
    };
    int[][] babyhotlinepleasehold = {{2, 2, 2},
                                     {2, 2, 2},
                                     {2, 2, 2}};

    System.out.println(ArrayOps.sum(myNums));
    System.out.println(ArrayOps.sum(blank));
    System.out.println(ArrayOps.largest(myNums));
    System.out.println(Arrays.toString(ArrayOps.sumRows(twodee)).replace("], ","],\n"));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(twodee)).replace("], ","],\n"));
    System.out.println(ArrayOps.sum(twodee)); //expect 20
    System.out.println(Arrays.toString(ArrayOps.sumCols(twodee)).replace("], ","],\n"));
    System.out.println(ArrayOps.isRowMagic(twodee)); //expect false
    System.out.println(ArrayOps.isRowMagic(toodee)); //expect true
    System.out.println(ArrayOps.isColMagic(toodee)); //expect false
    System.out.println(ArrayOps.isColMagic(anotheronebitesthedust)); //expect true
    System.out.println(ArrayOps.isLocationMagic(anotheronebitesthedust, 2, 2)); //expect false
    System.out.println(ArrayOps.isLocationMagic(babyhotlinepleasehold, 2, 2)); //expect true

    System.out.println("Maxwell's tests");

    int[] arr = {1,2,3,4};
    System.out.println(ArrayOps.sum(arr)==10);
    System.out.println(ArrayOps.largest(arr)==4);
    int[] arr2 = {5,5,5,5};
    System.out.println(ArrayOps.sum(arr2)==20);
    System.out.println(ArrayOps.largest(arr2)==5);
    int[][] arr3 = {{1},{100,10,1},{1,9,2,8,3,7,4,6,5,5}};
    int[] a = {1, 111, 50};
    int[] b = {1, 100, 9};
    System.out.println(Arrays.equals(ArrayOps.sumRows(arr3), a));
    System.out.println(Arrays.equals(ArrayOps.largestInRows(arr3), b));
    System.out.println(ArrayOps.sum(arr3)==162);
    int[][]  arr4 = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[] c = {12, 8, -14};
    int[] d = {12, 7, 2};
    int[] f = {3, -4, 16, -9};
    System.out.println(Arrays.equals(ArrayOps.sumRows(arr4), c));
    System.out.println(Arrays.equals(ArrayOps.largestInRows(arr4), d));
    System.out.println(ArrayOps.sum(arr4)==6);
    System.out.println(Arrays.equals(ArrayOps.sumCols(arr4), f));
    int[][] arr5 = { {  1,  2, 3, 4 },
    {  2, 3,  4,  1 },
    { 3, 4,  1, 2 } };
    System.out.println(ArrayOps.isRowMagic(arr5));
    System.out.println(! ArrayOps.isColMagic(arr5));
    int[][] arr6 = { {  1,  1, 1 },
    {  2, 2, 2 },
    { 3,  3, 3 } };
    System.out.println(! ArrayOps.isRowMagic(arr6));
    System.out.println(ArrayOps.isColMagic(arr6));
    int[][]E = {
    {  2,  4, 2 },
    {  2, 2, 2 } };
    System.out.println(! ArrayOps.isLocationMagic(E, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
  }

}
