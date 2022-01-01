package migration_brids;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MigrationBridsProgram {

    static int migratoryBirds(List<Integer> arr) {
        int count=1;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (map.containsKey(arr.get(i))) {
                map.put(arr.get(i), map.get(arr.get(i))+1);
                count++;
            } else {
                map.put(arr.get(i),1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        int max=(Collections.max(map.values()));
        Iterator<Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next();
            if(max==entry.getValue()) {
                list.add(entry.getKey());
            }
        }
        if(list.isEmpty()) {
            return max;
        }
        Collections.sort(list);
        return list.get(0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
}
