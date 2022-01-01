package designer_pdf_viewer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {
    public static int designerPdfViewer(List<Integer> h, String word) {
        int maximum = 0;
        Map<Character, Integer> hmap = new HashMap<Character, Integer>();
        for(Character ch='a',i=0;ch<='z'&&i<=25;ch++,i++) {
            hmap.put(ch, h.get(i));
        }
        for(int i=0;i<word.length();i++) {
            if(hmap.get(word.charAt(i)) > maximum) {
                maximum = hmap.get(word.charAt(i));
            }
        }
        return (maximum*(word.length()));
    }
}

public class DesignerPdfViewerProgram {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
}
