package org.regisstudios.farm4change.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenShiftController {
    @GetMapping("/test")
    public String test(){
        return "<h2>Welcome to Farm4Change</h2><br><div>This is the test-server-page</div>";
    }
}
