import java.util.Scanner;

/**
 * Created by 张巍 on 2016/10/17.
 */
public class Human {
    public static String[] name, age, sex, sexOut;

    static void name(byte i) {
        Methods.getName();
        name[i] = Methods.name;
    }

    final static void sex(byte i) {
        Methods.getSex();
        sex[i] = Methods.sex;
        sexOut[i] = Methods.sexout;
    }

    static void age(int i) {
        Methods.getAge();
        age[i] = Methods.age;
    }

}
