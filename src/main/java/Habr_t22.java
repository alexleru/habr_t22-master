

public class Habr_t22 {
    public static void main(String[] args) {
        ListLinked<Integer> listLinked = new ListLinked<>();
        listLinked.add(3);
        listLinked.add(5);
        System.out.println(listLinked.size());
        listLinked.add(3);
        listLinked.add(5);
        System.out.println(listLinked.size());
        listLinked.add(3);
        listLinked.add(5);
        System.out.println(listLinked.size());

        System.out.println(listLinked.get(6));
    }
}
