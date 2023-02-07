package inout.fileinout;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileInOut {
    public static void run() throws IOException {
//        FileOutputStream f = new FileOutputStream("./src/inout/fileinout/output.txt");
//        String d = "hello 1!!@!@1";
//        f.write(d.getBytes());
//        f.close();

        FileWriter f = new FileWriter("./src/inout/fileinout/output.txt", true);
        for (int i = 0; i < 10; i++) {
            f.write(i + "번째 줄\r\n");  // \r\n -> enter (\r with \n is necessary in window)
        }
        f.close();

        BufferedReader reader = new BufferedReader(new FileReader("./src/inout/fileinout/output.txt"));
        while (true) {
            String line = reader.readLine();
            if(line == null) break;
            System.out.println(line);
        }

    }
}
