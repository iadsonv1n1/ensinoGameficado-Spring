package ensinoGameficado_Spring.dto;

import ensinoGameficado_Spring.model.Clazz;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ClazzDto {
    private Long id;
    private String name;
    private String teacher_name;
    private String teacher_email;
    private LocalDateTime creating_date;

    public ClazzDto(Clazz clazz){
        this.id = clazz.getId();
        this.name = clazz.getName();
        this.teacher_name = clazz.getTeacher().getName();
        this.teacher_email = clazz.getTeacher().getEmail();
        this.creating_date = clazz.getCreatingDate();
    }

}
