import java.util.Scanner;
public class basic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        int res[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m1[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}