public class PeopleNTech {
    //The use of static variable and static method.
    static String name;
    static int id;
    final static String batch="Selenium";
    final static  String school="PeopleNTech";
    private static PeopleNTech peopleNTech=null;

    public static PeopleNTech getPeoplenTech(){
        if (peopleNTech==null){
           peopleNTech= new PeopleNTech();
        }
        return peopleNTech;
    }


    private PeopleNTech(){ //signleton
    }
    public static String   attendAt(String name){
         return school;
  }

    public static void regAt(String batch){
        System.out.println("I am registered at PeopleNTech");

    }



}
