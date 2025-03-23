package org.milestone4.ticket.platform.ticket_platform.api;

import java.util.List;

import org.milestone4.ticket.platform.ticket_platform.model.Ticket;
import org.milestone4.ticket.platform.ticket_platform.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@CrossOrigin
@RequestMapping("/api/tickets")
public class TicketRestController {
    
    @Autowired
    private TicketService service;

    @GetMapping
    public List<Ticket> index(){
        return service.findAll();
    }

    @GetMapping("{category}")
    public List<Ticket> findByCategory(@RequestParam String category) {
        return service.findByCategory(category);
    }

    @GetMapping("{state}")
    public List<Ticket> findByState(@RequestParam String state) {
        return service.findByState(state);
    }
    
}
