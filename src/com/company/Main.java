package com.company;

import java.io.*;

public class Main{

    public static void main(String[] args) {
        File dir = new File("/home/dxsweet/sdc1/Education/0java/2022年全网首发_价值200W的_从Java零基础小白到阿里P8级架构师_800集全套教学视频_免费分享给大家");
        for(File file : dir.listFiles()){
//            System.out.println(file.getName());
            String[] oldNames = file.getName().split("_",2);
            String newName = oldNames[0] + "." + oldNames[1];
//            System.out.println(newName);
            File newFile = new File(dir.getAbsolutePath() + "/" + newName);
//            System.out.println(newaName);
            boolean flag = file.renameTo(newFile);
            if (flag == true){
                System.out.println(file.getName() + "已完成");
            }
            else {
                System.out.println(file.getName() + "失败");
            }
        }

    }
}
