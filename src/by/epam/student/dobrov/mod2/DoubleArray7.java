package by.epam.student.dobrov.mod2;

public class DoubleArray7 {
    public static void main(String[] args) {

        int n = 4;

        double arr[][] = createArr(n);
        outPutDArr(arr);
        System.out.println();
        findPositivNum(arr);
    }

    public static double[][] createArr(int n) {

        double arr[][] = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
            }
        }
        return arr;
    }

    public static void outPutDArr(double arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findPositivNum(double[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( arr[i][j] > 0 ){
                    count++;
                }
            }
        }
        System.out.println(count);
        return  count;
    }
}
