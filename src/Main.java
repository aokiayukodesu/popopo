import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Europe> europeList = List.of(new Europe("イギリス", "アイルランド", "マルタ", "英語"),
                new Europe("ギリシャ", "", "", "ギリシャ語"),
                new Europe("フランス", "", "", "フランス語"));


        for (Europe euList : europeList
        ) {
            if (euList.language.equals("英語")) {
                System.out.println("ヨーロッパ諸国で英語圏の国は" + euList.country + "、" + euList.country1 + "、" + euList.country2 + "です。");
            }

        }
    }

}


