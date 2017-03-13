import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8ComparisonEngine {

    public static void main(String[] args) {
        System.out.println("Running!");
        List<String> namesListA = new ArrayList<String>();
        namesListA.add("Jennifer");
        namesListA.add("Adam");
        namesListA.add("Zeke");
        namesListA.add("Marion");

        List<String> namesListB = new ArrayList<String>();
        namesListB.add("Theresa");
        namesListB.add("Gwen");
        namesListB.add("Kelly");
        namesListB.add("Sarah");

        List<String> namesListC = new ArrayList<String>();
        namesListB.add("Theresa");
        namesListB.add("Gwen");
        namesListB.add("Kelly");
        namesListB.add("Sarah");

        Java8ComparisonEngine java8ComparisonEngine = new Java8ComparisonEngine();
        java8ComparisonEngine.sortUsingJava7(namesListA);
        java8ComparisonEngine.sortUsingJava8(namesListB);
        System.out.println(namesListA);
        System.out.println(namesListB);
        System.out.println(Comparator.naturalOrder());
    }

    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}
