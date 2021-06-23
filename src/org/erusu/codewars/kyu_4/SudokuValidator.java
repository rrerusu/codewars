package org.erusu.codewars.kyu_4;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SudokuValidator {
    public static boolean validate(int[][] sudoku) {
        boolean rowsValid = true,
                columnsValid = true,
                squaresValid = true;

        List<Integer> nums = new ArrayList<>();

        // validate all rows
        for(int[] row : sudoku) {
            rowsValid = rowsValid && validateNums(row);
        }

        // validate all columns
        for(int column = 0; column < 9; column++) {
            for(int row = 0; row < 9; row++) {
                nums.add(sudoku[row][column]);
            }
            columnsValid = columnsValid && validateNums(nums.stream().mapToInt(num -> num).toArray());
            nums.clear();
        }

        // validate 3x3 squares
        for(int xSqrMult = 0; xSqrMult < 3; xSqrMult++) {
            for(int ySqrMult = 0; ySqrMult < 3; ySqrMult++) {
                for(int subSquareX = 0; subSquareX < 3; subSquareX++) {
                    for(int subSquareY = 0; subSquareY < 3; subSquareY++) {
                        nums.add(sudoku[3 * ySqrMult + subSquareY][3 * xSqrMult + subSquareX]);
                    }
                }

                squaresValid = squaresValid && validateNums(nums.stream().mapToInt(num -> num).toArray());
                nums.clear();
            }
        }

        return rowsValid && columnsValid && squaresValid;
    }

    private static boolean validateNums(int[] nums) {
        return Arrays.stream(nums).distinct().reduce(0, Integer::sum) == 45;
    }
}