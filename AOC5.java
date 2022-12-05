import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class AOC5 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("D:\\Documents D\\Programming\\Advent of Code 2022\\day5.txt"));

        ArrayList<Stack<Character>> stacks = new ArrayList<>();
        for(int i= 0; i < 9; i++) stacks.add(new Stack<>());
        stacks.get(0).push('S');
        stacks.get(0).push('L');
        stacks.get(0).push('W');

        stacks.get(1).push('J');
        stacks.get(1).push('T');
        stacks.get(1).push('N');
        stacks.get(1).push('Q');

        stacks.get(2).push('S');
        stacks.get(2).push('C');
        stacks.get(2).push('H');
        stacks.get(2).push('F');
        stacks.get(2).push('J');

        stacks.get(3).push('T');
        stacks.get(3).push('R');
        stacks.get(3).push('M');
        stacks.get(3).push('W');
        stacks.get(3).push('N');
        stacks.get(3).push('G');
        stacks.get(3).push('B');

        stacks.get(4).push('T');
        stacks.get(4).push('R');
        stacks.get(4).push('L');
        stacks.get(4).push('S');
        stacks.get(4).push('D');
        stacks.get(4).push('H');
        stacks.get(4).push('Q');
        stacks.get(4).push('B');

        stacks.get(5).push('M');
        stacks.get(5).push('J');
        stacks.get(5).push('B');
        stacks.get(5).push('V');
        stacks.get(5).push('F');
        stacks.get(5).push('H');
        stacks.get(5).push('R');
        stacks.get(5).push('L');

        stacks.get(6).push('D');
        stacks.get(6).push('W');
        stacks.get(6).push('R');
        stacks.get(6).push('N');
        stacks.get(6).push('J');
        stacks.get(6).push('M');

        stacks.get(7).push('B');
        stacks.get(7).push('Z');
        stacks.get(7).push('T');
        stacks.get(7).push('F');
        stacks.get(7).push('H');
        stacks.get(7).push('N');
        stacks.get(7).push('D');
        stacks.get(7).push('J');

        stacks.get(8).push('H');
        stacks.get(8).push('L');
        stacks.get(8).push('Q');
        stacks.get(8).push('N');
        stacks.get(8).push('B');
        stacks.get(8).push('F');
        stacks.get(8).push('T');


        String ans = "";
        while(sc.hasNextLine()) {
            String[] s = sc.nextLine().split(" ");
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[3]) -1;
            int c = Integer.parseInt(s[5]) -1;
            Stack<Character> temp = new Stack<>();
            for(int i= 0; i < a; i++) {
                temp.push(stacks.get(b).pop());
            }

            for(int i = 0; i < a; i++) {
                stacks.get(c).push(temp.pop());
            }
        }

        for(int i = 0; i < 9; i++) ans += stacks.get(i).peek();
        System.out.println(ans);
    }
}
