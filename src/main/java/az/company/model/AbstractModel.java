package az.company.model;

import az.company.enums.StateEnum;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AbstractModel {
    LocalDateTime createDate;
    StateEnum state;
}
