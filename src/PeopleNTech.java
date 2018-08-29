public class PeopleNTech {
    //The use of static variable and static method.
    static String name;
    static int id;
    static String batch;
    static  String school="PeopleNTech";

    PeopleNTech(){
    }
   PeopleNTech(String name, int id , String batch){
        PeopleNTech.name=name;
        PeopleNTech.id=id;
        PeopleNTech.batch=batch;

    }

    public static String    attendAt(String name){
      PeopleNTech.school=school;   return school;
  }


}
