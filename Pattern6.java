public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i >= 0; i--) 
        {for(int j=n-i;j>=0;j--){
            System.err.print(" ");

        }
            for(int j=0;j<=i;j++)
            {
                System.err.print("*");
            }
            System.err.println("");
        }
    }
}
