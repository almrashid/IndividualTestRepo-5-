public class TestSingleTon {
    public static void main(String[] args) {
        SingleTonClass singleTonClass1=SingleTonClass.getSingleTonClass();
        System.out.println(singleTonClass1.hashCode());
        SingleTonClass singleTonClass2=SingleTonClass.getSingleTonClass();
        System.out.println(singleTonClass2.hashCode());
        System.out.println("SingleTon Class restring multi object creations");

    }
}
