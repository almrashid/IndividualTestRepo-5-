package NestedClassExample;

import javax.print.attribute.standard.PrinterName;

public class HP extends Printer {
    InnerClassA innerA=new InnerClassA();

    public HP(String  printerName ) { //using super  keyword
        super();
    }

    public void printMethodouterA() {
        System.out.println("Dell printer Prints quickly and OuterA");

    }

    public void scanMethodOuterB() {
        System.out.println("Dell printer Scans quickly and OuterB");

    }

    public  class InnerClassA {
        public void printMethodA() {
            System.out.println("Dell printer Prints quickly and innerClassA");

        }

        private void scanMethodA() {
            System.out.println("Dell printer Scans quickly and innerClassA");

        }
    }
          public static class InnerClassB {
                private static void printMethodB() { //how do we acces private method from inner class
                    System.out.println("HP printer Prints quickly and InnerClassB");

                }

                public static void scanMethodB() {
                    System.out.println("HP.HP printer Scans quickly and InnerClassB");

                }
            }


    }//out

