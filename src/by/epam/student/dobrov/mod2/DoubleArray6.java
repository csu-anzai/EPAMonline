package by.epam.student.dobrov.mod2;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1 1 1 1 1 1
0 1 1 1 1 0
0 0 1 1 0 0
0 1 1 1 1 0
1 1 1 1 1 1
 */
public class DoubleArray6 {
    public static void main(String[] args) {

        int n = 6;

        int arr[][] = createArrFirst(n);

        outPutDArr(arr);
    }

    public static int[][] createArrFirst(int n) {

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (n - i - 1 > j && i > j || i > n - j - 1 && n - i - 1 > n - j - 1)  {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }


            }
        }
        return arr;
    }



    public static void outPutDArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*


Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1 1 1 1 1 1
0 1 1 1 1 1 (1 0)
0 0 1 1 1 1 (2 1)
0 0 1 1 1 1 (3 1)
0 1 1 1 1 1 (4 0)
1 1 1 1 1 1
*/
//НЕДОДЕЛАНА