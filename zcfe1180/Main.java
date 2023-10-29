import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long timeInMillis = scanner.nextLong(); // 从输入读取时间的毫秒表示

        // 计算时、分、秒
        long seconds = (timeInMillis / 1000) % 60;
        long minutes = (timeInMillis / (1000 * 60)) % 60;
        long hours = (timeInMillis / (1000 * 60 * 60)) % 24;

        // 将时、分、秒格式化为 HH:MM:SS
        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        System.out.println(formattedTime); // 输出格式化后的时间
    }
}
