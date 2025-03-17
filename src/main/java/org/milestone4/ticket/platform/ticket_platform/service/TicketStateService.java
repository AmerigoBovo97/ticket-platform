package org.milestone4.ticket.platform.ticket_platform.service;

import java.util.List;

import org.milestone4.ticket.platform.ticket_platform.model.TicketState;
import org.milestone4.ticket.platform.ticket_platform.repository.TicketStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketStateService {
    

    @Autowired
    private TicketStateRepository repo;

    public List<TicketState> findAll(){
        return repo.findAll();
    }
}
