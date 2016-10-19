import java.util.Scanner;

/**
 * Created by 张巍 on 2016/10/18.
 */

public class Methods {
    public static String name, sex, sexout, age;
    public static Scanner In = new Scanner(System.in);
    static int totalQtty = 0;
    static byte[] humanNo = new byte[totalQtty];
    static String[] humanName = new String[totalQtty];
    static String[] humanSex = new String[totalQtty];

    static void getName() {
        System.out.print("请输入学长の名：");
        name = In.next();
    }

    static void getAge() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
        System.out.println("年龄这个不用输,下一个问题");
        age = "500";
    }
    //// TODO: 2016/10/18


    static void getSex() {
        String cache;
        System.out.println("Ta是学长还是学姐呢？");
        cache = In.next();
        sexout = cache;
        switch (sexout) {
            case "学长":
                sex = "男";
                break;
            case "学姐":
                sex = "女";
                break;
        }
    }

    static void introduce(int i) {
        int phrase = RandNumIn.randNum(4);

        switch (phrase) {
            case 0:
                System.out.println("辣么，下面我来介绍一下自己~");
                break;
            case 1:
                System.out.println("嗯..自我介绍嘛……");
                break;
            case 2:
                System.out.println("这里其实可以没有开场白。。");
                break;
            case 3:
                System.out.println("下面是我的自我介绍。");
                break;
            case 4:
                System.out.println("要我个人信息干嘛？不过给你就是了：");
                break;
        }
        //// TODO: 2016/10/18
    }

}
