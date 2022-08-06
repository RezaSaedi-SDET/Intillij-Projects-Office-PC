package ReplitHw6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class Replit204 {
    public static void main(String[] args) {
        Map<String,String> map204=new LinkedHashMap<>();
        map204.put("Street","Patrick ST");
        map204.put("Suite","265");
        map204.put("City","Vienna");
        map204.put("Zip","22180");
        map204.put("Country","United State");
        Iterator<Map.Entry<String, String>> iterator=map204.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String>entry=iterator.next();
            System.out.println(entry.getValue());
        }
    }
}
