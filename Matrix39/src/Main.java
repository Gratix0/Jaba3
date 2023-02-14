import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       int m, n, count = 0;
       boolean stop = false;
       System.out.println("Enter the row");
       m = inp.nextInt();
       System.out.println("Enter the column");
       n = inp.nextInt();

        int max,min;
        int[][] a=new int[m][n];
        for (int i=0;i < a.length;i++){
            for (int j=0;j < a[i].length;j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }
        for (int i=0;i < a.length;i++,System.out.println()){
            for (int j=0;j < a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }}
        for(int k = 0; k < m; k++){
            stop = false;
            for(int i = 0; i < n - 1 && !stop; i++)
                for(int j = i + 1; j < n; j++){
                    if(a[k][i] == a[k][j]){
                        stop = true;
                        break;
                    }
                    if(j == n - 1 && i == n - 2){
                        count++;
                        stop = true;
                        break;
                    }
                }
        }

        System.out.println("unique rows count : " + count);


    }}