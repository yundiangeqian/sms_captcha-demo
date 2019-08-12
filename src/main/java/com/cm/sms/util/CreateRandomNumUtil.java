package com.cm.sms.util;

/**
 * @description:创建随机数
 * @author: caomian
 * @data: 2019/8/12 10:22
 */
public class CreateRandomNumUtil {
    private static int result_zero = 0;

    public static String createrandomNum(Integer count) {
        StringBuffer randomNumStr = new StringBuffer("");
        for (int i = result_zero; i < count; i++) {
            String randomNum = String.valueOf((int)(Math.ceil(Math.random() * 10)));
            randomNumStr.append(randomNum);
        }
        return randomNumStr.toString();
    }
}
