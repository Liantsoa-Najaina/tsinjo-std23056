package hei.school.tsinjo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Help {
  //    Sortie d'argent
  private Donation donation;
  private Payment payment;
  private String incidentDescription;
}
