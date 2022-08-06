package ReplitHw6;

import java.util.LinkedHashMap;
import java.util.Map;

public class Replit201 {
    /*
    Create a Map in which you do not need to preserve the order of the entries

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Find how many entries are inside the map

Remove all entires from the Map

Find the Map size again

Expected Output:

5
0
     */
    public static void main(String[] args) {
        Map<String,String> map201 =new LinkedHashMap<>();
        map201.put("Street","Patrick ST");
        map201.put("Suite","265");
        map201.put("City","Vienna");
        map201.put("Zip","22180");
        map201.put("Country","United State");
        System.out.println(map201.size());
        map201.clear();
        System.out.println(map201.size());

    }
}
