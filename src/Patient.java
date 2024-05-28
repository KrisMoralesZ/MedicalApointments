public class Patient extends User{

  private String birthday;
  private double weight;
  private double height;
  private String blood;

  Patient(String name, String email) {
    super(name, email);
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }
  public String getBirthday() {
    return birthday;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
  public String  getWeight() {
    return Double.toString(weight);
  }

  public void setHeight(double height) {
    this.height = height;
  }
  public double getHeight() {
    return height;
  }

  public void setBlood(String blood) {
    this.blood = blood;
  }
  public String getBlood() {
    return blood;
  }
}
