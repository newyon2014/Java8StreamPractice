package StreamConcepts.FileStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreaming {
    public static void main(String[] args) {
        // 8. Stream rows from text file, sort, filter, and print
        Stream<String> bands = null;
        try {
            bands = Files.lines(Paths.get("bands.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();

        // 9. Stream rows from text file and save to List
        List<String> bands2 = null;
        try {
            bands2 = Files.lines(Paths.get("bands.txt"))
                    .filter(x -> x.contains("jit"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        bands2.forEach(x -> System.out.println(x));

        // 10. Stream rows from CSV file and count
        Stream<String> rows1 = null;
        try {
            rows1 = Files.lines(Paths.get("data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();

        // 11. Stream rows from CSV file, parse data from rows
        Stream<String> rows2 = null;
        try {
            rows2 = Files.lines(Paths.get("data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
        rows2.close();

        // 12. Stream rows from CSV file, store fields in HashMap
        Stream<String> rows3 = null;
        try {
            rows3 = Files.lines(Paths.get("data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();
        for (String key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }
    }
}
