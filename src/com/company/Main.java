package com.company;

import java.io.*;

public class Main{

    public static void main(String[] args) {
        File dir = new File("/home/dxsweet/sdc1/Education/2java/尚硅谷雷神SpringBoot2零基础入门springboot全套完整版_spring_boot2_");
        for(File file : dir.listFiles()){
//            System.out.println(file.getName());
            String[] oldNames = file.getName().split("_",2);
            String newName = oldNames[0] + "." + oldNames[1];
//            System.out.println(newName);
            File newFile = new File(dir.getAbsolutePath() + "/" + newName);
//            System.out.println(newaName);
            boolean flag = file.renameTo(newFile);
            if (flag){
                System.out.println(file.getName() + " has been done ");
            }
            else {
                System.out.println(file.getName() + " has been failed ");
            }
        }

    }
}
