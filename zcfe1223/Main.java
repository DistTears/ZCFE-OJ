import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈磊
 * Date: 2023-10-24
 * Time: 22:52
 */
/*
A0
----
1189 841
-----
A1
----
841 594
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paper[] papers = new Paper[10];
        papers[0] = new Paper("A0", 1189, 841);
        for (int i = 1; i < papers.length; i++) {
            int l = (int) papers[i - 1].l / 2;
            int w = papers[i - 1].w;
            if (l > w) {
                papers[i] = new Paper("A" + i, l, w);
            } else {
                papers[i] = new Paper("A" + i, w, l);
            }
        }
        String s = scanner.nextLine();
        for (int i = 0; i < papers.length; i++) {
            if (papers[i].id.equals(s)) {
                System.out.println(papers[i].l + "\n" + papers[i].w);
            }
        }

    }
}

class Paper {
    String id;//纸的型号
    int l;//长
    int w;//宽

    public Paper(String id, int l, int w) {
        this.id = id;
        this.l = l;
        this.w = w;
    }
}
