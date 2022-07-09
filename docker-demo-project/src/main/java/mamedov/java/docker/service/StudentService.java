package mamedov.java.docker.service;

import lombok.RequiredArgsConstructor;
import mamedov.java.docker.dto.StudentDto;
import mamedov.java.docker.entity.Student;
import mamedov.java.docker.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student save(StudentDto studentDto) {
        return studentRepository.save(new Student(studentDto.getId(), studentDto.getFirstName(),
                studentDto.getSecondName(), studentDto.getAge()));
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
