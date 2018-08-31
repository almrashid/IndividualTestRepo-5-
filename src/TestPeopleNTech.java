public class TestPeopleNTech  {


    public static void main(String[] args) {

        PeopleNTech peopleNTech=PeopleNTech.getPeoplenTech();
        System.out.println(peopleNTech.hashCode());
        PeopleNTech peopleNTech1=PeopleNTech.getPeoplenTech();
        System.out.println(peopleNTech1.hashCode());
        PeopleNTech peopleNTech2=PeopleNTech.getPeoplenTech();
        System.out.println(peopleNTech2.hashCode());



    }




}
