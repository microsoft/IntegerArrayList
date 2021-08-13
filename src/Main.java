public class Main {
    public static void main(String[] args) {
        IntegerArrayList list = new IntegerArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
