/*
利用for循环,计算1+4的结果
1+2+3+4=10
 */

public class ForDemo_1 {
    public static void main(String[] args) {
        int sum = 0;      // 定义变量,记录求和后的数据
        for (int i = 1; i < 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}