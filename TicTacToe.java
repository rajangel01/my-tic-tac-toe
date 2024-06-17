
/**
 * TicTacToe
 */
import java.util.*;

public class TicTacToe {

    // For printing the Game

    public static void print(char arr[][]) {
        for (int i = 0; i < 30; i++) {
            System.out.print("_");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
            System.out.println();
        }
    }

    // For checking if any one pattern matched

    public static boolean checkStatus(char arr[][]) {
        if (arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2]) {
            System.out.println(arr[0][0] + "Won the match...!!!");
            return true;
        } else if (arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2]) {
            System.out.println(arr[1][0] + "Won the match...!!!");
            return true;
        } else if (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]) {
            System.out.println(arr[2][0] + "Won the match...!!!");
            return true;
        } else if (arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0]) {
            System.out.println(arr[1][0] + "Won the match...!!!");
            return true;
        } else if (arr[1][1] == arr[0][1] && arr[1][1] == arr[2][1]) {
            System.out.println(arr[0][1] + "Won the match...!!!");
            return true;
        } else if (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]) {
            System.out.println(arr[2][0] + "Won the match...!!!");
            return true;
        } else if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]) {
            System.out.println(arr[0][0] + "Won the match...!!!");
            return true;
        } else if (arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2]) {
            System.out.println(arr[2][0] + "Won the match...!!!");
            return true;
        }
        return false;
    }

    // checking for turn

    public static void checkTurn(int val) {
        if (val % 2 == 0) {
            System.out.println("It's X turn :  -  ");
            return;
        }

        System.out.println("It's O turn :  -  ");
    }

    // Updating the 2D array

    public static void updateArray(char arr[][], int turn) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        switch (val) {
            case 1:
                if (arr[0][0] != '1') {
                    System.out.println("Sorry this place is already booked : ");
                    updateArray(arr, turn);
                } else {
                    if (turn % 2 == 0) {
                        arr[0][0] = 'X';
                    } else {
                        arr[0][0] = 'O';
                    }
                }
                break;

            case 2:
                if (arr[0][1] != '2') {
                    System.out.println("Sorry this place is already booked : ");
                    updateArray(arr, turn);
                } else {
                    if (turn % 2 == 0) {
                        arr[0][1] = 'X';
                    } else {
                        arr[0][1] = 'O';
                    }
                }
                break;

            case 3:
                if (arr[0][2] != '3') {
                    System.out.println("Sorry this place is already booked : ");
                    updateArray(arr, turn);
                } else {
                    if (turn % 2 == 0) {
                        arr[0][2] = 'X';
                    } else {
                        arr[0][2] = 'O';
                    }
                }
                break;

            case 4:
                if (arr[1][0] != '4') {
                    System.out.println("Sorry this place is already booked : ");
                    updateArray(arr, turn);
                } else {
                    if (turn % 2 == 0) {
                        arr[1][0] = 'X';
                    } else {
                        arr[1][0] = 'O';
                    }
                }
                break;

            case 5:
                if (arr[1][1] != '5') {
                    System.out.println("Sorry this place is already booked : ");
                    updateArray(arr, turn);
                } else {
                    if (turn % 2 == 0) {
                        arr[1][1] = 'X';
                    } else {
                        arr[1][1] = 'O';
                    }
                }
                break;

            case 6:
                if (arr[1][2] != '6') {
                    System.out.println("Sorry this place is already booked : ");
                    updateArray(arr, turn);
                } else {
                    if (turn % 2 == 0) {
                        arr[1][2] = 'X';
                    } else {
                        arr[1][2] = 'O';
                    }
                }
                break;

            case 7:
                if (arr[2][0] != '7') {
                    System.out.println("Sorry this place is already booked : ");
                    updateArray(arr, turn);
                } else {
                    if (turn % 2 == 0) {
                        arr[2][0] = 'X';
                    } else {
                        arr[2][0] = 'O';
                    }
                }
                break;

            case 8:
                if (arr[2][1] != '8') {
                    System.out.println("Sorry this place is already booked : ");
                    updateArray(arr, turn);
                } else {
                    if (turn % 2 == 0) {
                        arr[2][1] = 'X';
                    } else {
                        arr[2][1] = 'O';
                    }
                }
                break;

            case 9:
                if (arr[2][2] != '9') {
                    System.out.println("Sorry this place is already booked : ");
                    updateArray(arr, turn);
                } else {
                    if (turn % 2 == 0) {
                        arr[2][2] = 'X';
                    } else {
                        arr[2][2] = 'O';
                    }
                }
                break;

            default: {
                System.out.println("Sorry You have entered a wrong choice......!!!");
                updateArray(arr, turn);
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char arr[][] = new char[3][3];
        char ch = '1';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ch;
                ch++;
            }
        }

        int val = 1;

        while (val < 10 && checkStatus(arr) != true) {
            print(arr);
            checkTurn(val);
            System.out.println("Enter the value where you want to insert your value:");
            int turn = sc.nextInt();
            switch (turn) {
                case 1:
                    if (arr[0][0] != '1') {
                        System.out.println("Sorry this place is already booked : ");
                        updateArray(arr, turn);
                    } else {
                        if (val % 2 == 0) {
                            arr[0][0] = 'X';
                        } else {
                            arr[0][0] = 'O';
                        }
                    }
                    break;

                case 2:
                    if (arr[0][1] != '2') {
                        System.out.println("Sorry this place is already booked : ");
                        updateArray(arr, turn);
                    } else {
                        if (val % 2 == 0) {
                            arr[0][1] = 'X';
                        } else {
                            arr[0][1] = 'O';
                        }
                    }
                    break;

                case 3:
                    if (arr[0][2] != '3') {
                        System.out.println("Sorry this place is already booked : ");
                        updateArray(arr, turn);
                    } else {
                        if (val % 2 == 0) {
                            arr[0][2] = 'X';
                        } else {
                            arr[0][2] = 'O';
                        }
                    }
                    break;

                case 4:
                    if (arr[1][0] != '4') {
                        System.out.println("Sorry this place is already booked : ");
                        updateArray(arr, turn);
                    } else {
                        if (val % 2 == 0) {
                            arr[1][0] = 'X';
                        } else {
                            arr[1][0] = 'O';
                        }
                    }
                    break;

                case 5:
                    if (arr[1][1] != '5') {
                        System.out.println("Sorry this place is already booked : ");
                        updateArray(arr, turn);
                    } else {
                        if (val % 2 == 0) {
                            arr[1][1] = 'X';
                        } else {
                            arr[1][1] = 'O';
                        }
                    }
                    break;

                case 6:
                    if (arr[1][2] != '6') {
                        System.out.println("Sorry this place is already booked : ");
                        updateArray(arr, turn);
                    } else {
                        if (val % 2 == 0) {
                            arr[1][2] = 'X';
                        } else {
                            arr[1][2] = 'O';
                        }
                    }
                    break;

                case 7:
                    if (arr[2][0] != '7') {
                        System.out.println("Sorry this place is already booked : ");
                        updateArray(arr, turn);
                    } else {
                        if (val % 2 == 0) {
                            arr[2][0] = 'X';
                        } else {
                            arr[2][0] = 'O';
                        }
                    }
                    break;

                case 8:
                    if (arr[2][1] != '8') {
                        System.out.println("Sorry this place is already booked : ");
                        updateArray(arr, turn);
                    } else {
                        if (val % 2 == 0) {
                            arr[2][1] = 'X';
                        } else {
                            arr[2][1] = 'O';
                        }
                    }
                    break;

                case 9:
                    if (arr[2][2] != '9') {
                        System.out.println("Sorry this place is already booked : ");
                        updateArray(arr, turn);
                    } else {
                        if (val % 2 == 0) {
                            arr[2][2] = 'X';
                        } else {
                            arr[2][2] = 'O';
                        }
                    }
                    break;

                default: {
                    System.out.println("Sorry You have entered a wrong choice......!!!");
                    updateArray(arr, turn);
                }
            }
            checkStatus(arr);
            val++;
        }

        if (checkStatus(arr)) {
            System.out.println("Congratulations you won the match...!!!");
        } else {
            System.out.println("Match Draw....!!");
        }
        sc.close();
    }
}