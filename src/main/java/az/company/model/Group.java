package az.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group extends AbstractModel{
    private Long id;
    private String name;
    private String lessonName;
    private Teacher teacher;

    public Group(Long id){
        this.id = id;
    }

}
