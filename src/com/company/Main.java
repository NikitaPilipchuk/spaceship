package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Массив со входными данными из forlabs
        //int spaceships[] = new int[] {1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, -1000000000, -1000000000, -1000000000, -1000000000, -1000000000, -1000000000, -1000000000, 0, -1000000000, -1000000000, -1000000000};

        int spaceships[] = new int[] {5, -7, 9, -3, 4}; // СВОЙ МАССИВ КОРОБЛЕЙ
        List output = new ArrayList();
        int index = 0;

        for (int i =0; i < spaceships.length; i++) {
            if (sum(spaceships, spaceships[i]) == spaceships[i]) {
                index = i;
            } else {
                output.add(spaceships[i]);
            }
        }
        output.add(spaceships[index]);
        System.out.println("Очередность убитых кораблей: " + output);
    }

    public static int sum(int[] args, int y) {
        int sum=0;
        for (int i = 0; i < args.length; i++){
            sum += args[i];
        }
        return  sum - y;
    }
}
