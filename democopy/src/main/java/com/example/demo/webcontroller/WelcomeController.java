package com.example.demo.webcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.ui.ModelMap;
// import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;


//@RestController
@Controller
public class WelcomeController {

    @RequestMapping("/welcome2")
    public String welcome(Model model){
        return "welcome2";

    }

    // Login form  
    @RequestMapping("/employee")  
    public String login(Model model) {  
    
        return "employee";  
    }  
    
    @RequestMapping("/addEmployee")  
    public String add(Model model) {  
    
        return "addEmployee";  
    }  
    
//     @RequestMapping("/")
//     public String hello(ModelMap Model) {
//         return "welcome2";
// }

    // // Login form  
    // @RequestMapping("/welcome2.html")  
    // public String login() {  
    //     return "welcome2.html";  
    // }  
}
    

