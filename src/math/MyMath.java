package math;

import java.util.ArrayList;
import java.util.List;

public class MyMath {
    public static List<String> fizzBuzz(int n) {
        System.out.println(n);
        List<String> fizzBuzz = new ArrayList<>();
        int fizz = 3;
        int buzz = 5;
        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % fizz == 0) {
                s = s + "fizz";
            }
            if (i % buzz == 0) {
                s = s + "buzz";
            }

            if (s.length() == 0) {
                s = s + i;
            }
            fizzBuzz.add(s);
        }
        return fizzBuzz;
    }
}
