import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class morita {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int age;

        System.out.print("こんにちは、あなたの名前を教えてください。");
        name = br.readLine();
        System.out.print("あなたの年齢を教えてください。");
        age = Integer.parseInt(br.readLine());

        System.out.println(age+"歳の"+name+"さんですね。");
        System.out.println("情報を登録しました。");
    }
}