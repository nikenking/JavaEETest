package com.dell.test;
import com.dell.Dao.impl.BookImpl;
import com.dell.Service.BookService;
import com.dell.pojo.Book;
import com.dell.pojo.Page;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class JustTest {
    public static void main(String[] args) {
        List<String> problem = new ArrayList<>();
        List<String> answer = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        List<String> list = Arrays.asList("34、写一个单例模式并优化",
                "/**",
                " * 方式一：创建private实例，公共方法调用"
        );
        for (String s : list) {
            if (Pattern.matches("\\d+、.*", s)) {//答案汇总
                if (temp.length()!=0){
                    answer.add(temp.toString());
                    temp = new StringBuilder();
                }
                problem.add(s);//加下一个问题
            }else if (problem.size()!=0){
                temp.append(s).append("\n");//答案积累
            }
        }
        if (temp.length()!=0){
            answer.add(temp.toString());
        }
        for (int i = 0; i < answer.size(); i++) {
            System.out.println("<div class=\"problem-box\">");
            System.out.println("<h2>"+problem.get(i)+"</h2>");
            System.out.println("<span>"+answer.get(i)+"</span>");
            System.out.println("</div>");
        }
    }
}
