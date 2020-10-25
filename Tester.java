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
  }

}
