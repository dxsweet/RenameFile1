package com.company;

import java.io.*;

public class Main{

    public static void main(String[] args) {
        File dir = new File("/home/dxsweet/sdc1/Education/0java/马士兵仅用30小时就把计算机底层原理_操作系统_数据结构和计算机网络融会贯通_相互联系起来了_计算机科学与软件工程专业的Java程序员必会_");
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
