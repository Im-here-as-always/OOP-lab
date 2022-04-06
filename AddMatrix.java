public class AddMatrix{
    public static void main(String[] args){
        int n=3;
        int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int b[][] ={{1,5,0},{8,2,0},{0,0,1}};
        int c[][] = new int[3][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}