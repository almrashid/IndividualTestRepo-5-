public class PeopleNTech {
    //The use of static variable and static method.
    static String name;
    static int id;
    final static String batch="Selenium";
    final static  String school="PeopleNTech";
    private static PeopleNTech peopleNTech;

    public static PeopleNTech getPeoplenTech(){
        if (peopleNTech==null){
            new PeopleNTech();
        }
        return peopleNTech;
    }


    private PeopleNTech(){ //signleton
    }
  PeopleNTech(String name, int id , String batch){
       PeopleNTech.name=name;
      PeopleNTech.id=id;

   }

    public static String   attendAt(String name){
         return school;
  }

    public static void regAt(String batch){
        System.out.println("I am registered at PeopleNTech");

    }



}
