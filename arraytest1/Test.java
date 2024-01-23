package arraytest1;

public class Test {
    public static void main(String[] args) {
        //目标完成对数组元素的求和
        //1.定义一个数组存储5名员工的销售额
        int [] arr={10,20,30,40,50};
        //2.遍历这个数组,把每一个数组中的数据取出
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }

}
