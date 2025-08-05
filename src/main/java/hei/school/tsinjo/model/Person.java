package hei.school.tsinjo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public abstract class Person {
  protected String email;
  protected String fullName;
}
