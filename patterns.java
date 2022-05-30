import java.util.Scanner;
public class patterns {

    static void hollowRectangle(int rows, int columns)
    {
        for (int i = 1; i <= rows; i++) {
           for (int j = 1; j <= columns; j++) {
                if(i == 1 || i == rows || j == 1 || j == columns){
                    System.out.print("*");
                }               

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void starPattern(int n){
        int i =1;
        String j = "*";
        String temp = j;
        while(i <= n){
            System.out.println(temp);
            temp += j;
            i++;
        }
    }

    static void butterflyPattern(int rows, int columns){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // int spaces = 2*(columns - i);

            for (int j = 1; j <= 2*(rows - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // int spaces = 2*(columns - i);

            for (int j = 1; j <= 2*(rows - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rohombusPattern(int n){
        for (int i = 1; i < n; i++) {

            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void numberPyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= i; j++) {
                for (int j2 = 1; j2 <= j; j2++) {
                    System.out.print(j + " ");
                }
            }

            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pallindromePyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void diamondPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i+i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i+i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("***********************************PATTERNS***********************************");
        System.out.println("1.Hollow Rectangle");
        System.out.println("2.Star Pattern");
        System.out.println("3.Butterfly Pattern");
        System.out.println("4.Rohombus pattern");
        System.out.println("5.Number Pyramid");
        System.out.println("6.Pallindrome Pyramid");
        System.out.println("7.Diamond Pattern");
        System.out.println("******************************************************************************");
        
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int rows, columns, n;
        // int choice = 7;

        switch (choice) {
            case 1:
                System.out.print("Rows :");
                rows = sc.nextInt();
                System.out.print("Columns :");
                columns = sc.nextInt();
                hollowRectangle(rows, columns);
                break;
            
            case 2:
                System.out.print("n :");
                n = sc.nextInt();
                starPattern(n);
                break;
        
            case 3:
                System.out.print("Rows :");
                rows = sc.nextInt();
                System.out.print("Columns :");
                columns = sc.nextInt();
                butterflyPattern(rows, columns);
                break;
            
            case 4:
                System.out.print("n :");
                n = sc.nextInt();
                n = 5;
                rohombusPattern(n);
                break;
        
            case 5:
                System.out.print("n :");
                n = sc.nextInt();
                numberPyramid(n);
                break;

            case 6:
                System.out.print("n :");
                n = sc.nextInt();
                pallindromePyramid(n);
                break;

            case 7:
                System.out.print("n :");
                n = sc.nextInt();
                diamondPattern(n);
                break;

        
            default:
                break;
        }
    }
    
}