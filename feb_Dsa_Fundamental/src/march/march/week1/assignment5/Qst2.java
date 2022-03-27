//2. Print wave in matrix
package march.week1.assignment5;

public class Qst2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] waveMatrix= {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16}
        };
        //for even column-row will increase
        //for odd column-row will decrease
        for(int j = 0; j < waveMatrix[0].length; j++){

            if(j%2 == 0){
                for(int i = 0; i < waveMatrix.length; i++){
                    System.out.println(waveMatrix[i][j]);
                }
            } else {
                for(int i = waveMatrix.length-1; i>= 0; i--){
                    System.out.println(waveMatrix[i][j]);
                }
            }
        }
    }

}

