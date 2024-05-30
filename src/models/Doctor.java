package models;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
  private String specialization;

  Doctor(String name, String email) {
    super(name, email);
    System.out.println("The assigned Doctor Name is: " + name);
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public String getSpecialization() {
    return specialization;
  }

  ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

  public void addAvailableAppointment(Date date, String time) {
    availableAppointments.add(new Doctor.AvailableAppointment(date, time));
  }

  public ArrayList<AvailableAppointment> getAvailableAppointments() {
    return availableAppointments;
  }

  public static class AvailableAppointment {
    private int id;
    private Date date;
    private String time;

    public AvailableAppointment(Date date, String time) {
      this.date = date;
      this.time = time;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public Date getDate() {
      return date;
    }

    public void setDate(Date date) {
      this.date = date;
    }

    public String getTime() {
      return time;
    }

    public void setTime(String time) {
      this.time = time;
    }

    @Override
    public String toString() {
      return "Available Appointments \nDate: " + date + "\nTime: " + time;
    }
  }
}
