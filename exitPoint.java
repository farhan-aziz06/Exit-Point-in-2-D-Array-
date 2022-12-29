import java.util.Scanner;
public class exitPoint{
    public static void main(String[]args) {
        Scanner console = new Scanner(System.in);
        try{
            System.out.println("Enter Row and Columns: ");
            int row =console.nextInt();
            int col =console.nextInt();

            int [][] array = new int[row][col];
            System.out.println("Please Enter Array Elements: ");
            for (int i=0; i< row; i++){
                for(int j =0; j<col;j++){
                    array[i][j]=console.nextInt();
                }
            }

            int diraction =0; //! 0--e 1--S 2--w 3--n
            int i = 0;
            int j = 0;

            while(true){
                diraction = (diraction+ array[i][j])%4;
                if (diraction==0){
                    j++;
                }else if(diraction==1){
                    i++;
                }else if(diraction==2){
                    j--;
                }else if(diraction==3){
                    i--;
                }
                if(i<0){
                    i++;
                    break;
                }else if(j<0){
                    j++;
                    break;
                }else if(i==array.length){
                    i--;
                    break;
                }else if(j==array.length){
                    j--;
                    break;
                }
            }
            System.out.println();
            System.out.println("Exit Point is"+i+","+j);
            

        }catch(Exception e){
            System.out.println("Exception" + e);
        }finally{
            console.close();
        }
        
    }
}