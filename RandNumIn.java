
/**
 * Created by 张巍 on 2016/10/14.
 */
public class RandNumIn {
    public static int randNum(int input) {
        int ranNum = (int) Math.floor((input + 1) * Math.random());
        return ranNum;
    }
}
