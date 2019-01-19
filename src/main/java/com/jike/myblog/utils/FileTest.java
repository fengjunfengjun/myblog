package com.jike.myblog.utils;

import java.io.*;

public class FileTest implements Serializable {
    public static void main(String[] args) throws IOException {
        File f=new File(".\\src\\b.txt");

        /*System.out.println( f.mkdir());
        System.out.println( f.createNewFile());*/



        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(f));
        objectOutputStream.writeObject(new FileTest());

    }
}
