package az.company.model;

import az.company.enums.StateEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends AbstractModel {
    private Long id;
    private String name;
    private String surname;
    private String address;
    private String mail;
    private String phoneNumber;


    public Teacher(String name, String surname, String address, String mail, String phoneNumber, LocalDateTime createDate, StateEnum state) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.createDate = createDate;
    }

    //    /**
//     * regex vasitesiyle mailin set olunmasina mehdudiyyetler qoyulur
//     */
//    public void setMail(){
//
//    }

}
