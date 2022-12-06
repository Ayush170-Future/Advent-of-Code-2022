import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AOC6 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("D:\\Documents D\\Programming\\Advent of Code 2022\\day6.txt"));

        // part 2
        
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        long ans = 0;
        for(int i = 13; i < s.length(); i++) {
            for(int j = i; j > i-14; j--){
                set.add(s.charAt(j));
            }

            if(set.size() == 14) {
                ans = i+1;
                break;
            }

            set.clear();
        }
        System.out.println(ans);
    }
}
