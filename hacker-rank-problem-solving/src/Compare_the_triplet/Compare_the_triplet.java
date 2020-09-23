package Compare_the_triplet;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Compare_the_triplet {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int aLength = a.size();
		int bLength = b.size();
		int aTemp = 0, bTemp = 0;
		List<Integer> result = new ArrayList<Integer>();
		if (aLength == bLength) {
			for (int check = 0; check < aLength; check++) {
				if (a.get(check) > b.get(check)) {
					aTemp++;
				} else if (a.get(check) < b.get(check)) {
					bTemp++;
				} else {

				}
			}
		}
		result.add(aTemp);
		result.add(bTemp);
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = compareTriplets(a, b);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
