public class ForLoop {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < i+1; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i < n ; i ++) {
            for (int j = i+1; j < n ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Pattern:
*
**
***
****
*****
******
*******
********
*********
**********
*********
********
*******
******
*****
****
***
**
*
*/