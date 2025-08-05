package hei.school.tsinjo.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Payment {
  private LocalDate date;
  private double amount;
  private String meanOfPayment;
  @Setter private PaymentState state;
}
