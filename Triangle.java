import java.util.Scanner;
public class Triangle{
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.println("What's the numbers of line?");
        int line = n.nextInt();
        for(int i=1;i<=line;i++){
            for(int a=1;a<=(line-i);a++){
                System.out.print(" ");
            }
            for(int b=1;b<=(2*i-1);b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}