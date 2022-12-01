import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AOC1 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("D:\\Documents D\\Programming\\Advent of Code 2022\\day1.txt"));

        long curr = 0;
        long a = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        while(sc.hasNextLine()) {
            a++;
            String line = sc.nextLine();
            if(line.length() == 0) {
                if(pq.size() < 3) pq.add(curr);
                else {
                    if(pq.peek() < curr) {
                        pq.poll();
                        pq.add(curr);
                    }
                }
                curr = 0;
            } else {
                curr += Long.parseLong(line);
            }
        }
        if(pq.size() < 3) pq.add(curr);
        else {
            if(pq.peek() < curr) {
                pq.poll();
                pq.add(curr);
            }
        }
        long ans = 0;
        for(long val: pq) ans += val;
        System.out.println(a);
        System.out.println(ans);
    }
}
