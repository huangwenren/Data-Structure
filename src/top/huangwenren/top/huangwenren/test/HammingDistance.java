package top.huangwenren.top.huangwenren.test;

/**
 * Created by huang on 2017/6/8.
 */
public class HammingDistance {
    public int calHammingDistance1(int x, int y) {
        int z = x ^ y;
        int res = 0;
        while (z != 0) {
            if (z % 2 == 1) {
                res ++;
            }
            z /= 2;
        }
        return res;
    }

    public int calHammingDistance2(int x, int y) {
        int[] nums = {};
        System.out.println(nums.length);
        return Integer.bitCount(x ^ y);

    }


    public static void main(String[] args) {
        String.valueOf();
        Integer.toString()
        System.out.println(new StringBuilder("12 12").toString());
    }
}
