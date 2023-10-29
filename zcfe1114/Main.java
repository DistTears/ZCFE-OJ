/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-09-26
 * Time: 15:53
 */

public class Main {
    public static boolean is(String s) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < 10; i++) {
            if ("0010100100".charAt(i) == s.charAt(i)) {
                count1++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if ("0111010111".charAt(i) == s.charAt(i)) {
                count2++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if ("0111000101".charAt(i) == s.charAt(i)) {
                count3++;
            }
        }
        if (count1 == 7 && count2 == 5 && count3 == 3) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("222222222");
        int count = 0;
        for (int i = 0; i < 2; i++) {
            s.replace(0, 1, Integer.toString(i));
            for (int j = 0; j < 2; j++) {
                s.replace(1, 2, Integer.toString(j));
                for (int k = 0; k < 2; k++) {
                    s.replace(2, 3, Integer.toString(k));
                    for (int l = 0; l < 2; l++) {
                        s.replace(3, 4, Integer.toString(l));
                        for (int m = 0; m < 2; m++) {
                            s.replace(4, 5, Integer.toString(m));
                            for (int n = 0; n < 2; n++) {
                                s.replace(5, 6, Integer.toString(m));
                                for (int o = 0; o < 2; o++) {
                                    s.replace(6, 7, Integer.toString(o));
                                    for (int p = 0; p < 2; p++) {
                                        s.replace(7, 8, Integer.toString(p));
                                        for (int q = 0; q < 2; q++) {
                                            s.replace(8, 9, Integer.toString(q));
                                            for (int r = 0; r < 2; r++) {
                                                s.replace(9, 10, Integer.toString(r));
                                                if (is(s.toString())) {
                                                    for (int z = 0; z < 10; z++) {
                                                        if ("0011100111".charAt(z) == s.charAt(z)) {
                                                            count++;
                                                        }
                                                    }
                                                    System.out.println(count * 10);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
