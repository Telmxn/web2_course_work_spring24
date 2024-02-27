package az.edu.ada.wm2.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstSpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringAppApplication.class, args);
    }

////    @RequestMapping("/")
//    @GetMapping("/")
//    public String sayHello() {
//        return "Hi there";
//    }
//
////    @GetMapping("/students")
//    @RequestMapping(value = "/students", method = RequestMethod.GET)
//    @GetMapping("/student/{id}")
//    public List<Person> getStudents(@PathVariable("id") Long studId){
//        return List.of(
//                new Person("Ali","Aliyev"),
//                new Person("Telman","Yusifov"),
//                new Person("Aliya","Huseynova")
//        );
//    }



}
