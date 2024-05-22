public class Patient {

  int id;
  private String name;
  private String email;
  private String address;
  private String phoneNumber;
  private String birthday;
  private double weight;
  private double height;
  private String blood;

  Patient(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public void setId(int id) {
    this.id = id;
  }
  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmail() {
    return email;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  public String getAddress() {
    return address;
  }

  public void setPhoneNumber(String phoneNumber) {
    if (phoneNumber.length() == 10) {
      this.phoneNumber = phoneNumber;
    }else {
      System.out.println("Invalid phone number");
    }
  }
  public String getPhoneNumber() {
    return phoneNumber;
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
