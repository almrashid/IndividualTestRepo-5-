package StringUsage;
public class UseString {

    public static void main(String[] args) {
        String str="  This is the 9th Class of Java";
        char a='a';
        String str2="";
         int size= str.length();
        System.out.println("The size of str String is :"+size);
        char ind=str.charAt(10);
        System.out.println("The char index of str String at 10  :-"+ind);
        int comp= str.compareTo("This is the 9th Class of Java");
        System.out.println("comparison: = "+comp); //equal
        str.compareToIgnoreCase("This is the 9th Class of JAVA");
        str.concat("and C++ is the next sub to learn");
        boolean istrue=   str.contains("T");
        if(istrue)
                System.out.println("Found");
        if(!istrue)
                System.out.println("not found");
        boolean isequal=str.equals(str2);
        if(isequal)
            System.out.println("Both are same");
        if(!isequal)
            System.out.println("Both are not same");
        System.out.println( "String Hasecode is -: " +str.hashCode());

        int characterIndexAt=str.indexOf("T");
        System.out.println("The character index of letter T is :"+characterIndexAt);
        System.out.println(str.intern()); //not so sure
      int lastindexOF=  str.lastIndexOf(str);
        System.out.println("latstindexOF of str-:"+ lastindexOF);
      boolean isTrue=str.isEmpty();
        System.out.println("isEmpty : " +isTrue);
      boolean isendWith=str.endsWith("h");
        System.out.println("is Endwith--" +isendWith); //if ends true else false
        System.out.println("String matches --" +str.matches(str2));
        System.out.println("is Strarwith -: "+str.startsWith("T"));
        byte[] st= str.getBytes();
        System.out.println("the Byte code of str :" +st);
        System.out.println("subtring starts with 0 and enda at index 4: "+str.substring(0,4));

      char[] cAarr= str.toCharArray();
      if(cAarr!=null)
          for (int i=0;i<cAarr.length;i++)
          System.out.print(cAarr[i]+" -");
        System.out.println();

        System.out.println("source of String class--"+str.getClass());
        System.out.println("The lower cases of str ---" +str.toLowerCase());
        System.out.println("The UPPER cases of str ---" + str.toUpperCase());
        System.out.println(str);
        System.out.println("Romoves space of str string " +str.trim());

        if (str == null) {
            System.out.println("false");
        }else
            System.out.println("true");
        if (str != null) {
            str.length();
        }
        String [] sArr=(str.split("t"));
        System.out.println("First array -:"+ sArr[0]);
        for (int j=0; j<sArr.length;j++){

            System.out.println(" arrayIndex at : "+ j+ ">> "+sArr[j]);
        }
        str.toString();








    }
}
