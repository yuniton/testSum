package com.example.suitably;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Judge {
    public static boolean judgeRetryExam(String[] judge){
        for (int i = 1; i < 4 ; i++) {
            if((Integer.parseInt(judge[i]) < 25) || (Integer.parseInt(judge[i]) == -1)){
                return true;
            }
        }
        return false;
    }

    public static boolean check(String[] judge){
        Pattern p = Pattern.compile("^[^!-~｡-ﾟ]*$");//全角判定
        Matcher m;
        Pattern p1 = Pattern.compile("[0].[0-9]??[0-9]??");

        if(judge[0] == null){ //名前チェック
            return false;
        }
        for (int i = 1; i <4 ; i++) {
            if((judge[i] == null) ||
                    (Integer.parseInt(judge[i]) < -1 || Integer.parseInt(judge[i]) > 100) ||
                    p.matcher(judge[i]).find() || p1.matcher(judge[i]).find()
            ){
                System.out.println(Arrays.asList(judge));
                System.out.println("エラーが発生しました。");
                return false;
            }
        }
        return true;
    }
}
