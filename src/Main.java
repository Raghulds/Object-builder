public class Main {
    public static void main(String[] args) throws IllegalAccessException {
      Student student = Student
              .getBuilder()
              .setName("Raghul S")
              .setAge(25)
              .setSchool(new String("ABC school"))
              .build();

      System.out.println("DEBUG");
    }
}