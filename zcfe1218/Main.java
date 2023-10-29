import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-23
 * Time: 22:11
 */

/*
BABBACAC
-------------
AB
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//输入流
        String s = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        list.sort((o1, o2) -> o1 - o2);
        for (Character c : list) {
            System.out.print(c);
        }
    }
}
