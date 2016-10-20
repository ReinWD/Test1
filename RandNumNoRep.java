/**
 * Created by 张巍 on 2016/10/14.
 */
public class RandNumNoRep {
    public static int RandNum(int input) {

        return input;
    }

    public static void main(String[] args) {
        int input=5;
        int[] usedNum = new int[input];
        int Times = 0, w = 0, ranNum = 0, i = 0;
        do {
            ranNum = (int) Math.floor(input * Math.random());
            for (Times = 0; Times < input; Times++) {
                if (usedNum[Times] == ranNum) {
                    i = 0;
                    break;
                }
                i = 1;
            }
        } while (i == 0);
        w = ranNum;
        usedNum[w] = w;

    }
}
