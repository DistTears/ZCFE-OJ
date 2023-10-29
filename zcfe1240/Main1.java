


public class Main1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1999; i++) {
            for (int j = i + 1; j <= 1999; j++) {
                for (int k = j + 1; k <= 1999; k++) {
                    if ((i + j + k == 2019) && check(i) && check(j) && check(k) && (i != j) && (j != k)) {
                        System.out.println(i + " " + j + " " + k);
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);


    }

    public static boolean check(int i) {
        String a = i + "";
        if (a.indexOf('2') != -1) {
            return false;
        }
        if (a.indexOf('4') != -1) {
            return false;
        }
        return true;


    }

}










