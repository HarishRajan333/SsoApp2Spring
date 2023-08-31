package com.mycompany.application2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmsController {

    @GetMapping("/tenentEmployee/getEms-data")
    public String tenentEmployee() {
        return "Login in as Employee Management System's Tenent Employee.";
    }

    @GetMapping("/tenentAdmin/getEms-data")
    public String tenentAdmin() {
        return "Login in as Employee Management System's Tenent Admin.";
    }

    @GetMapping("/platformAdmin/getEms-data")
    public String platformAdmin() {
        return "Login in as Employee Management System's Platform Admin.";
    }

    @GetMapping("/platformEmployee/getEms-data")
    public String platformEmployee() {
        return "Login in as Employee Management System's Platform Employee.";
    }

}
