import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String args[]) throws IOException {

    Set<String> treesetStrings = new TreeSet<>();

    String emailString = "Mickey-Mouse1928@example.com";
    Pattern pattern = Pattern.compile("[A-Za-z0-9-_.]{1,}@[A-Za-z0-9-_.]*[a-z]{1,3}");
    Matcher matcher = pattern.matcher(emailString);

    if (matcher.find()) {
      treesetStrings.add(matcher.group());
    }

    Iterator<String> iterator = treesetStrings.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next());
      if (iterator.hasNext())
        System.out.print(";");
      else
        System.out.println("");
    }
  }
}