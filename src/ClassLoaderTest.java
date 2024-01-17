
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ClassLoaderTest {


  public static void main(String[] args) {


    System.out.println("System : " + System.class.getClassLoader());
    System.out.println("String : " + String.class.getClassLoader());
    System.out.println("Long : " + Long.class.getClassLoader());
    System.out.println("Integer : " + Integer.class.getClassLoader());
    System.out.println("Object : " + Object.class.getClassLoader());

    System.out.println("Math : " + Math.class.getClassLoader());

    System.out.println("ArrayList : " + ArrayList.class.getClassLoader());

    System.out.println("PreparedStatement : " + PreparedStatement.class.getClassLoader());

    System.out.println("Main : " + Main.class.getClassLoader());
    System.out.println("Member : " + MemberDTO.class.getClassLoader());



  }


  class MemberDTO {

    private String name;

    private Integer age;

    private String birth;
  }
}
