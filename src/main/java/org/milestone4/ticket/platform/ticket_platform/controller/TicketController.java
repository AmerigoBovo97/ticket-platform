package org.milestone4.ticket.platform.ticket_platform.controller;

import java.util.List;

import org.milestone4.ticket.platform.ticket_platform.model.Ticket;
import org.milestone4.ticket.platform.ticket_platform.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/ticket")
public class TicketController {
    
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public String tickets(Model model) {
        List<Ticket> tickets = ticketService.findAll();
        System.out.println(tickets);
        model.addAttribute("tickets", ticketService.findAll());
        return "tickets/index";
    }
    
}
