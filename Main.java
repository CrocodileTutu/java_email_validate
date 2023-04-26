import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String args[]) throws IOException {

    Set<String> ts = new TreeSet<>();

    String str = "Mickey-Mouse1928@example.com";
    Pattern p = Pattern.compile("[A-Za-z0-9-_.]{1,}@[A-Za-z0-9-_.]*[a-z]{1,3}");
    Matcher m = p.matcher(str);

    if (m.find()) {
      ts.add(m.group());
    }

    Iterator<String> it = ts.iterator();
    while (it.hasNext()) {
      System.out.print(it.next());
      if (it.hasNext())
        System.out.print(";");
      else
        System.out.println("");
    }
  }
}