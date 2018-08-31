package NestedClassExample;

public class TestHp {
    public static void main(String[] args) {

        HP hp =new HP("HP Model1");
        hp.printerName="HP model2";
        hp.printMethodouterA();
        hp.scanMethodOuterB();
        HP.InnerClassB.scanMethodB();




    }
}
