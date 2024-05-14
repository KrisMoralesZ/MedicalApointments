public class Doctor {
  static int id = 0;
  String name;
  String specialization;

  Doctor() {
    id++;
  }

  public void showName() {
    System.out.println(name);
  }

  public void showId() {
    System.out.println(id);
  }
}
