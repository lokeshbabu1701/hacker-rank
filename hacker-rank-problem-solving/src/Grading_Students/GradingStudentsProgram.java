package Grading_Students;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        int sum=0;
        for(int i=0;i<grades.size();i++) {
            if(grades.get(i)>=38) {
                if(grades.get(i)%5==3) {
                    sum = grades.get(i)+2;
                    grades.set(i,sum);
                } else if(grades.get(i)%5==4) {
                    sum = grades.get(i)+1;
                    grades.set(i,sum);
                }
            }
        }
        return grades;
    }
}

public class GradingStudentsProgram {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
	
}
