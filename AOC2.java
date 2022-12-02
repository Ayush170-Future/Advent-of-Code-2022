import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AOC2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("D:\\Documents D\\Programming\\Advent of Code 2022\\day2.txt"));
        // part 2
        long res = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        while(sc.hasNextLine()) {
            String[] s = sc.nextLine().split(" ");
            char[] c = new char[2];
            c[0] = s[0].charAt(0);
            c[1] = s[1].charAt(0);
            if(c[1] == 'X') {
                // lose
                if(c[0] == 'A') {
                    res += 3;
                } else if(c[0] == 'B') {
                    res += 1;
                } else res += 2;
            } else if(c[1] == 'Y') {
                // draw
                res += 3;
                if(c[0] == 'A') {
                    res += 1;
                } else if(c[0] == 'B') {
                    res += 2;
                } else res += 3;
            } else {
                // win
                res += 6;
                if(c[0] == 'A') {
                    res += 2;
                } else if(c[0] == 'B') {
                    res += 3;
                } else res += 1;
            }
        }

        System.out.println(res);
    }
}
