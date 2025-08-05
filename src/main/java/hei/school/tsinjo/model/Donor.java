package hei.school.tsinjo.model;

import lombok.Builder;

@Builder
public class Donor extends Person {
  public Donor(String email, String fullName) {
    super(email, fullName);
  }
}
