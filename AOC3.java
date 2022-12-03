import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class AOC3 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("D:\\Documents D\\Programming\\Advent of Code 2022\\day3.txt"));

        // part 2

        long ans = 0;
        while(sc.hasNextLine()) {
            String s[] = new String[3];
            s[0] = sc.nextLine();
            s[1] = sc.nextLine();
            s[2] = sc.nextLine();
            HashSet<Character> set = new HashSet<>();
            commonCharacters(s, set);
            for(char c: set) {
                if(Character.isLowerCase(c)) ans += c - 'a' + 1;
                else ans += c - 'A' + 27;
            }
        }
        System.out.println(ans);
    }

    public static void commonCharacters(String s[], HashSet<Character> set)
    {
        HashSet<Character> common = new HashSet<>();
        HashSet<Character> temp = new HashSet<>();
        for(char c: s[0].toCharArray()) temp.add(c);

        for(char c: s[1].toCharArray()) {
            if(temp.contains(c)) {
                common.add(c);
            }
        }

        for(char c: s[2].toCharArray()) {
            if(common.contains(c)) {
                set.add(c);
            }
        }
    }
}
