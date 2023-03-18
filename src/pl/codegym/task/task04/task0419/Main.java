package pl.codegym.task.task04.task0419;

import java.io.*;

/**
 Created by xciechan
 on 2023-03-18

 The application checks 4 entered numbers
 and prints the biggest of them.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(isBiggestNumber(enterNumbers()));
    }

    public static int[] enterNumbers() throws IOException {
        int[] arrayNumber = new int[4];
        for (int i = 0; i < 4; i++){
            arrayNumber[i] = readNumber();
        }
        return  arrayNumber;
    }

    public static int readNumber () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());

        return number;
    }

    public static int isBiggestNumber (int[] arrayNumber){
        int isBiggest = arrayNumber[0];

        for (int i = 1; i < 4; i++){
            if (arrayNumber[i] > isBiggest) {
                isBiggest = arrayNumber[i];
            }
        }
        return  isBiggest;
    }

}