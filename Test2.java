package arraytest1;
//计算动态数组
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //学会动态初始化数组
        //1.定义一个动态数组，负责存储6个评委的分数

        double[] arr=new double[6];
        Scanner sc=new Scanner(System.in);
        double sum=0;
        //2.遍历数组每个位置并且存入数据,并求和
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"评委的分数");
            double score= sc.nextInt();
            arr[i]=score;
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
