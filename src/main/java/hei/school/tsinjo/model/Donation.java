package hei.school.tsinjo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Donation {
  //    Entrée d'argent
  private Donor donor;
  private Payment payment;
}
