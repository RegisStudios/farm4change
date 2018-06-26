package org.regisstudios.farm4change.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenShiftController {
    @GetMapping("/test")
    public String test(){
        return "<h1>Welcome to Spring boot from OpenShift</h1>";
    }
}
