package az.developia.course.controller;

import az.developia.course.dto.Sector;
import az.developia.course.dto.Student;
import az.developia.course.service.SectorService;
import az.developia.course.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private SectorService sectorService;

    @Autowired
    private StudentService studentService;

    @ModelAttribute(name = "student")
    public Student studendModel() {
        return new Student();
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Sector> sectorList = sectorService.getSectorList();
        model.addAttribute("sectorList", sectorList);
        List<Student> studentList = studentService.getStudents();
        model.addAttribute("studentList", studentList);
        return "home";
    }

    @PostMapping("/")
    public String post(Student student) {
        System.out.println(student);
        studentService.addStudent(student);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        System.out.print(id);
        return "redirect:/";
    }


}
