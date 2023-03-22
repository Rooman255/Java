package DZ5;
// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
// И вывести Доску.
// Пример вывода доски 8x8

import java.util.ArrayDeque;

// 0x000000
// 0000x000
// 00x00000

public class dz5_3 {
    public static void main(String[] args) {
        int[][] desk = new int[8][8]; 
        ArrayDeque<Integer[]> resultQueen = new ArrayDeque<>(); 
        int queen = 1;
        Integer[] initCoords = new Integer[2]; 
        initCoords[1] = initCoords[0] = 0;
        while (queen <= 8) {
            boolean isSet = false;
            for (int i = initCoords[0]; i < 8; i++) {
                for (int j = initCoords[1]; j < 8; j++) {
                    if (desk[i][j] == 0) { 
                        boolean isFree = true;
                        for (int k = 0; k < 8; k++) {
                            if (desk[i][k] == 1 || desk[k][j] == 1)
                                isFree = false;
                            if (i + k < 8 && j + k < 8)
                                if (desk[i + k][j + k] == 1)
                                    isFree = false;
                            if (i + k < 8 && j - k >= 0)
                                if (desk[i + k][j - k] == 1)
                                    isFree = false;
                            if (i - k >= 0 && j + k < 8)
                                if (desk[i - k][j + k] == 1)
                                    isFree = false;
                            if (i - k >= 0 && j - k >= 0)
                                if (desk[i - k][j - k] == 1)
                                    isFree = false;
                        }
                        if (isFree) { 
                            Integer[] coords = new Integer[] { i, j };
                            resultQueen.addLast(coords);
                            desk[i][j] = 1;
                            i = j = 8;
                            queen++;
                            isSet = true;
                            initCoords[1] = initCoords[0] = 0;
                        }

                    }
                }
            }
            if (isSet == false) { 
                queen--; 
                if (resultQueen.isEmpty()) {
                    initCoords[1] = initCoords[0] = 0;
                } else {
                    initCoords = resultQueen.getLast();
                    resultQueen.removeLast(); 
                    desk[initCoords[0]][initCoords[1]] = 0; 
                    if (initCoords[1] == 7) { 
                        initCoords[0] = initCoords[0] + 1;
                        initCoords[1] = 0;
                    } else
                        initCoords[1]++;
                }
            }

        }
        for (int i = 0; i < 8; i++) { 
            for (int j = 0; j < 8; j++) {
                System.out.print(desk[i][j] + " ");
            }
            System.out.println();

        }
    }
}