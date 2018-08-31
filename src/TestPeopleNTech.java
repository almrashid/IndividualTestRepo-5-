public class TestPeopleNTech  {


    public static void main(String[] args) {

        PeopleNTech piit=new PeopleNTech("AL Rashid",3704,"JavaCourse");
        System.out.println(PeopleNTech.name+"---"+ PeopleNTech.id + "---"+ PeopleNTech.batch);
        PeopleNTech.attendAt("Peoplentech");
        PeopleNTech.regAt("JavaCourse");
       try {
           PeopleNTech piit1 = PeopleNTech.getPeoplenTech();
           System.out.println(piit1.hashCode());
       }catch (Exception e){
           System.out.println("null_pointer_Exception");

       }

       try{
           PeopleNTech piit2 = PeopleNTech.getPeoplenTech();
           System.out.println(piit2.hashCode());

       }catch (Exception e){
          // e.printStackTrace();
           System.out.println("null_Pointer_Exception");
       }


    }




}
