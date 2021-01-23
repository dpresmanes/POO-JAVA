package TestMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
public static void main(String[] args) {
	Map<Integer, String> diccionarioClaveEntera = new TreeMap<Integer,String>();
	Map<String, Integer> diccionarioClaveString = new TreeMap<String,Integer>();
	
	diccionarioClaveEntera.put(2,"Lucas");
	diccionarioClaveEntera.put(3,"Jorge");
	diccionarioClaveEntera.put(4,"Pedro");
	diccionarioClaveEntera.put(5,"Raul");
	
	diccionarioClaveString.put("Lucas", 2);
	diccionarioClaveString.put("Pedro",3);
	diccionarioClaveString.put("Jorge",4);
	diccionarioClaveString.put("chino",5);
}

}
