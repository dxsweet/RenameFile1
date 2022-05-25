package com.company;

import java.io.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String pnm = scn.nextLine();
        File dir = new File(pnm);
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
