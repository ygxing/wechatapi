package cn.muzin.util;

public class StringUtils {

    private StringUtils(){}

    public static boolean notEmpty (String str){
        return str != null && !"".equals(str);
    }


}
