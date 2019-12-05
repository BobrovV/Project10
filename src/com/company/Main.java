package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*enum Faculty{
    FFSM, MMF, FPMI, FMO, GEO
}*/

public class Main {

    public static void main(String[] args) throws IOException {

        /*TreeMap<String, Double> hm = new TreeMap<String, Double>();
        hm.put("John Doe", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Tod Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me:set){
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " + hm.get("John Doe"));*/

/*        List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
        Collections.reverse(list1);
        System.out.println(list1);

        List<String> list2 = Arrays.asList("yellow", "red", "green", "blue");
        Collections.shuffle(list2);
        System.out.println(list2);*/

/*        EnumSet<Faculty> set1 = EnumSet.range(Faculty.MMF, Faculty.FMO);
        EnumSet<Faculty> set2 = EnumSet.complementOf(set1);
        System.out.println(set1);
        System.out.println(set2);*/

        File file = new File("aa.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        File file1 = new File("com/company/az.txt");
        System.out.println(file1.getAbsolutePath());
        File file2 = new File(".");
        System.out.println(file2.getAbsolutePath());
        for (File listFile : file2.listFiles()) {
            if (listFile.isDirectory()) {
                System.out.println(listFile.getName().toUpperCase());
            } else {
                System.out.println(listFile.getName().toLowerCase());
            }
        }

        Path path = Paths.get("aa.txt");

            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);


    }
}
