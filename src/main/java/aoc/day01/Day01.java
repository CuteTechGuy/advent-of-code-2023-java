package aoc.day01;

import aoc.Day;

import java.util.List;

public class Day01 implements Day {

    @Override
    public String part1(List<String> input) {
        int sumOfCalibrationNumbers = 0;

        // Loop through each line
        for (String line : input) {
            char firstDigit = '\0';
            char lastDigit = '\0';

            // Loop through each character in line to find digits
            for (char character : line.toCharArray()) {
                if (Character.isDigit(character)) {
                    if (firstDigit == '\0') {
                        firstDigit = character;
                    } else {
                        lastDigit = character;
                    }
                }
            }

            // If there is only one digit in the line, make the last digit the same as the first digit.
            if (lastDigit == '\0') {
                lastDigit = firstDigit;
            }
            sumOfCalibrationNumbers = sumOfCalibrationNumbers + (Character.getNumericValue(firstDigit) * 10) + Character.getNumericValue(lastDigit);
        }
        return Integer.toString(sumOfCalibrationNumbers);
    }

    @Override
    public String part2(List<String> input) {
        return null;
    }
}
