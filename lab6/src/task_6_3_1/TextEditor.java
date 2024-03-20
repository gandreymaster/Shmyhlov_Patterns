package task_6_3_1;

import java.io.*;

public class TextEditor {
    private TextEditor() {
    }

    final private static TextEditor instance = new TextEditor();

    public static TextEditor getInstance() {
        return instance;
    }

    public String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }

            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void writeToFile(String fileName, String content){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(content);
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
