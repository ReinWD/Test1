/**
 * Created by 张巍 on 2016/10/14.
 */
public class RandNumNoRep {
    public static int RandNum() {
        int[] usedNum = new int[6];
        int Times = 0, w = 0, ranNum = 0, i = 0;
        do {
            ranNum = (int) Math.floor(55 * Math.random());
            for (Times = 0; Times < 54; Times++) {
                if (usedNum[Times] == ranNum) {
                    i = 0;
                    break;
                }
                i = 1;
            }
        } while (i == 0);
        w = ranNum;
        usedNum[w] = w;
        return w;
    }
}
