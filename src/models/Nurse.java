package models;

public class Nurse extends User {
  private String specialization;

  public Nurse(String name, String email) {
    super(name, email);
  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }
}
