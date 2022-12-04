import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AOC4 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("D:\\Documents D\\Programming\\Advent of Code 2022\\day4.txt"));

        // part 2

        long ans = 0;
        while(sc.hasNextLine()) {
            String[] s = sc.nextLine().split(",");
            String[] a = s[0].split("-");
            String[] b = s[1].split("-");

            long x1 = Long.parseLong(a[0]);
            long y1 = Long.parseLong(a[1]);

            long x2 = Long.parseLong(b[0]);
            long y2 = Long.parseLong(b[1]);

            ArrayList<long[]> pair = new ArrayList<>();
            pair.add(new long[]{x1, y1});
            pair.add(new long[]{x2, y2});
            pair.sort((a1, a2) -> {
                return (int) (a1[0] - a2[0]);
            });

            if(pair.get(0)[1] >= pair.get(1)[0]) ans++;
        }

        System.out.println(ans);
    }
}
