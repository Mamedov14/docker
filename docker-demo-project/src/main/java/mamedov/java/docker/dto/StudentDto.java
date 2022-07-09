package mamedov.java.docker.dto;

import lombok.Data;

@Data
public class StudentDto {
    private Long id;
    private String firstName;
    private String secondName;
    private int age;
}
