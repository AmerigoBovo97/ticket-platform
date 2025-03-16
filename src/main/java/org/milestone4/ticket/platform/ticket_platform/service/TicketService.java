package org.milestone4.ticket.platform.ticket_platform.service;

import java.util.List;

import org.milestone4.ticket.platform.ticket_platform.model.Ticket;
import org.milestone4.ticket.platform.ticket_platform.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    
    @Autowired
    private TicketRepository repo;

    public List<Ticket> findAll(){
        return repo.findAll();
    }
}
