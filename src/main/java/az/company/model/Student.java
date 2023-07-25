package az.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    private String surname;
    private String address;
    private String mail;
    private String phoneNumber;
    private LocalDateTime createDate;
    private Group group;

    /**
     * regex vasitesiyle mailin set olunmasina mehdudiyyetler qoyulur
     */
    public void setMail(){

    }
}
