package com.example.suitably;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        Judge judge = new Judge();
        try(BufferedReader br = new BufferedReader(new FileReader("testsum.txt"))) {
            String str = br.readLine();
            String[] arg = new String[4];
            while (str != null) {
                arg = str.split(",");
                if(judge.check(arg)){
                    System.out.println(Arrays.asList(arg));
                    if(judge.judgeRetryExam(arg)){
                        System.out.println(arg[0]+":再試験です");
                    }else{
                        System.out.println(arg[0]+":合格です");
                    }
                }
                str = br.readLine();


            }
            br.close();
        }
    }

}
