public class Doctor {
  static int id = 0;
  String name;
  String specialization;

  Doctor(String name, String specialization) {
    id++;
    this.name = name;
    this.specialization = specialization;
  }

  public void showName() {
    System.out.println(name);
  }

  public void showId() {
    System.out.println(id);
  }
}
