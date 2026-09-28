import java.util.Scanner;
public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase();
       String[] words = str.split("\\s+");
        boolean[] visited = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(words[i] + " = " + count);
        }
        sc.close();
    }
}
OUTPUT:
Enter a sentence: I LOVE JAVA
i = 1
love = 1
java = 1
