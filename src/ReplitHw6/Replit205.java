package ReplitHw6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit205 {
    /*
    Create a HashMap of String.

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all the values in upper case using entrySet

Expected Output:

265
22180
PATRICK ST
UNITED STATE
VIENNA
     */
    public static void main(String[] args) {
        Map<String,String> map205=new HashMap<>();
        map205.put("Street","Patrick ST");
        map205.put("Suite","265");
        map205.put("City","Vienna");
        map205.put("Zip","22180");
        map205.put("Country","United State");

        Iterator<Map.Entry<String,String>> iterator=map205.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getValue().toUpperCase());
        }

    }
}
