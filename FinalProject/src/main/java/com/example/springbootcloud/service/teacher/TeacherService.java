package com.example.springbootcloud.service.teacher;

import com.example.springbootcloud.entity.Teacher;
import com.example.springbootcloud.model.dto.TeacherDTO;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {
    TeacherDTO createTeacher(Long account_id);
    Iterable<Teacher> getListTeacher();
    TeacherDTO updateTeacher(TeacherDTO teacherDTO);
    void deleteTeacher(Long id);
}
