public class Main {
    public static void main(String[] args) {
        NewListBasedArrayList<Integer> arrayList = new NewListBasedArrayList<>();
        arrayList.add(15);
        arrayList.add(10);
        arrayList.add(8);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);
    }
}
