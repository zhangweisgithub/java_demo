/*
do...while 循环
编写格式:
		do{
		     循环体
		    }while(条件);
		特点: 无条件先执行一次
 */

public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}

