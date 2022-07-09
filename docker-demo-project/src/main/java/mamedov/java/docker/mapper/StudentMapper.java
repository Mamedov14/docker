package mamedov.java.docker.mapper;

import mamedov.java.docker.dto.StudentDto;
import mamedov.java.docker.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public StudentDto toDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setFirstName(student.getFirstName());
        studentDto.setSecondName(student.getSecondName());
        studentDto.setAge(student.getAge());
        return studentDto;
    }
}
