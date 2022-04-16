public class 位运算 {

    public static final int A_1 = 0x1;      //十进制为1 二进制为 0001
    public static final int A_2 = 0x1 << 1; //十进制为2 二进制为 0010
    public static final int A_3 = 0x1 << 2; //十进制为4 二进制为 0100
    public static final int A_4 = 0x1 << 3; //十进制为8 二进制为 1000

    public static final int A_12 = 0x1 << 11;//十进制2048 二进制为100000000000

    public static void main(String[] args) {
        int res = 0;

        //或运算 |
        //0|0=0；  0|1=1；  1|0=1；   1|1=1
        res |= A_1;
        res |= A_3;
        res |= A_4;

        //与运算符 &
        //0&0=0；0&1=0；1&0=0；1&1=1
        if ((A_4 & res) != 0) {
            //(A_4 & res)结果为1000
            //标识第4位为1
        }

        System.out.println(res);
    }
}
