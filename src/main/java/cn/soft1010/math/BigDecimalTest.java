package cn.soft1010.math;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by zhangjifu on 2017/4/27.
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(100);
        bigDecimal = bigDecimal.multiply(new BigDecimal("3.211"));

        DecimalFormat decimalFormat = new DecimalFormat("0000.0000");
        System.out.println(decimalFormat.format(bigDecimal));

        DecimalFormat decimalFormat1 = new DecimalFormat("#0.000");
        System.out.println(decimalFormat1.format(new BigDecimal("111.1111")));


    }
}
