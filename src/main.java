import array.MyArray;
import array.MyArrayExercizes;
import math.MyMath;
import math.MyMathExercises;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ExercisesArray();
        ExercisesMath();
    }
    public static void ExercisesArray(){
        MyArrayExercizes.RemoveDuplicates();
        MyArrayExercizes.MaxProfit();
        MyArrayExercizes.RotateArray();
        MyArrayExercizes.ContainsOneDuplicate();
        MyArrayExercizes.SingleNumber();
        MyArrayExercizes.Intersect();
    }

    public static void ExercisesMath(){
        MyMathExercises.Fizzbuzz();
    }
}
