package com.tel_ran;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File("box/pasword1");
        File file2 = new File("box/pasword2");
        FileWriter fw1 = null;
        FileWriter fw2 = null;
        try {
            int a1 = 0;
            fw1 = new FileWriter(file1);
           //while((a1 = fw1.write();))
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fw2 = new FileWriter(file2);

        } catch (IOException e) {
            e.printStackTrace();
        }


        List<String> list1 = getFileContent(file1);
        List<String> list2 = getFileContent(file2);

        System.out.println(compareTwoFiles(list1, list2));
    }

    private static boolean compareTwoFiles(List<String> list1, List<String> list2) {
        for (String str1 : list1) {
            for(String str2 : list2){
                if(list1.equals(list2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static List<String> getFileContent(File file) {
        BufferedReader br = null;
        List<String> result = new LinkedList<String>();
        String str;
        try {
            br = new BufferedReader(new FileReader(file));

            try {
                while ((str = br.readLine()) != null) {
                    result.add(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}
