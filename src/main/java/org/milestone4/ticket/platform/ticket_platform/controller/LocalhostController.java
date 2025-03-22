package org.milestone4.ticket.platform.ticket_platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/")
public class LocalhostController {
    
    @GetMapping("/")
    public String redirect() {
        return "redirect:/ticket";
    }
    
}
