package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] irrArray = {
                {12, 14, 54},
                {42, 6, 19, 21,82},
                {96, 58, 33, 71, 9, 10}
        };

        for(int i = 0; i < irrArray.length; i++) {
            for(int j = 0; j < irrArray[i].length; j++){
                if(irrArray[i].length -1 == j){
                    System.out.printf("%2d%n",irrArray[i][j]);
                }else{
                    System.out.printf("%2d | ", irrArray[i][j]);
                }
            }

        }


/*
        for (int[] outer : irrArray) {
            for (int inner : outer) {
                System.out.print(inner + " | ");
            }
            System.out.println("");
}
*/

    }
}
