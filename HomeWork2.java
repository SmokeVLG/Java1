/**
 * Java1: Home Work 2
 * author Denisov Maxim
 * date 17/07/2018
 */
public class SecondHomeWork {

    public static void main (String [] args) {

        //Task 1
        int [] firstTestmas = {0,1,1,1,0,1,0,0,1};
        int [] secondTestmas = {1,1,1,1,0,1,0,0,1};
        int [] thirdTestmas = {0,0,0,0,0,1,0,0,1};
        replacement(firstTestmas);
        replacement(secondTestmas);
        replacement(thirdTestmas);

        //Task 2
        int [] emptymas = new int[8];
        fillingIN(emptymas);

        //Task 3
        int [] taskThirdmas = {1,5,3,2,11,4,5,2,4,8,9,1};
        multiplication(taskThirdmas);

        //Task 4
        int [] [] taskFourthmas = new int[5][5];
        diagonal(taskFourthmas);

        //Task 5
        int [] fifthmasFirstTest = {1,2,3,2,5,4,3,10,-2,-3,-10};
        int [] fifthmasSecondTest = {0,2,3,9,1,2};
        int [] fifthmasThirdTest = {-12,-12,-3,0,0,-1};
        maxAndMinimum(fifthmasFirstTest);
        maxAndMinimum(fifthmasSecondTest);
        maxAndMinimum(fifthmasThirdTest);

        //Task 6
        int [] sixthmasTest = {1,1,1,2,1};
        int [] sixthmasSecondTest = {2,1,1,2,1};
        System.out.println("check = " + check(sixthmasTest));
        System.out.println("check = " + check(sixthmasSecondTest));

    }


    public static void replacement (int [] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas [i]);
        }
        for (int j = 0; j < mas.length; j++) {
            if (mas [j] == 0) {
                mas [j] = 1;
            } else if (mas [j] == 1) {
                mas [j] = 0;
            }
        }
         for (int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas [i]);
        }
    }

    public static void fillingIN (int [] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas [i] = i * 3;
        }
         for (int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas [i]);
        }
    }

    public static void multiplication (int [] mas) {
         for (int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas [i]);
        }
        for (int i = 0 ; i < mas.length; i++) {
            if (mas [i] < 6) {
                mas [i] = mas [i] * 2;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas [i]);
        }
    }

    public static void diagonal (int [][] mas) {
        for (int i = 0,j = mas.length -1; i < mas.length; i++, j--) {
            mas [i] [i] = 1;
            mas [j] [i] = 1;
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(" " + mas[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void maxAndMinimum (int [] mas) {
        int max = 0;
        int minimum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas [i] > max) {
                max = mas [i];
            } else if (mas [i] < minimum) {
                minimum = mas [i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("minimum = " + minimum);
    }

    public static boolean check (int [] mas) {
        int leftAmount = 0;
        int rightAmount = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas.length % 2 == 0) {
                if (i < mas.length / 2) {
                    leftAmount += mas[i];
                } else {
                    rightAmount += mas[i];
                }
            } else {
                if (i < mas.length / 2 + 1) {
                    leftAmount += mas[i];
                } else {
                    rightAmount += mas[i];
                }
            }
        }
        return leftAmount == rightAmount;
    }

}
