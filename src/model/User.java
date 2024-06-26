package model;

public class User {
  private int id;
  private String name;
  private String email;
  private String address;
  private String phoneNumber;

  public User(String name, String email) {
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
    } else {
      System.out.println("Invalid Phone Number");
    }
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  @Override
  public String toString() {
    return (
      "User: " +
      name +
      ", Email: " +
      email +
      "\n Address: " +
      address +
      ", Phone: " +
      phoneNumber
    );
  }
}
