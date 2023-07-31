package az.company.model;

import az.company.enums.StateEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends AbstractModel {
    private Long id;
    private String name;
    private String surname;
    private String address;
    private String mail;
    private String phoneNumber;
    private Group group;

    public Student(String name, String surname, String address, String mail, String phoneNumber, LocalDateTime createDate, StateEnum state) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.createDate = createDate;
        this.state = state;
    }

    public Student(String name, String surname, String address, String mail, String phoneNumber, LocalDateTime createDate, StateEnum state,Group group) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.createDate = createDate;
        this.state = state;
        this.group = group;
    }


    //    /**
//     * regex vasitesiyle mailin set olunmasina mehdudiyyetler qoyulur
//     */
//    public void setMail(){
//
//    }
}
