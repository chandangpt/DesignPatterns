package com.chandan.LowerCaseInputStream;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("filename.txt")
                            )
                    );
            while ((c = in.read()) >= 0) {
                System.out.println(c);
            }
            in.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
