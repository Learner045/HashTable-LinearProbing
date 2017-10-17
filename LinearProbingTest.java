package LinearProbing;

public class LinearProbingTest {
    public static void main(String[] args) {

        HashTable table=new HashTable();
        table.put(1,10);
        table.put(2,60);
        table.put(8,80);

        System.out.println(table.get(8));
        System.out.println(table.get(5));
        System.out.println(table.get(1));

        table.put(11,50);

        System.out.println(table.get(11));


    }
}
