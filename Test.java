/**
 * Created by 张巍 on 2016/10/17.
 */
public class Test extends Methods {
    public static void main(String[] args) {
        System.out.println("Greeting!");
        System.out.print("请输入前辈们的数量(最多255个哦）:");
        totalQtty = In.nextByte();
        System.out.println("那么，请告诉我前辈们的基本信息。");
        for (byte i = 0; i < totalQtty; i++) {
            System.out.println("前辈#" + (i + 1));
            Human.name(i);
            Human.age(i);
            Human.sex(i);
            System.out.println("前辈#" + (i + 1) + "设置完成~");
            if (i < totalQtty - 1) System.out.println("下一个：");
        }
        for (int i = 0; i < totalQtty; i++) {

        }
    }
}

