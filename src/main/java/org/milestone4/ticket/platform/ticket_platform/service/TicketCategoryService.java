package org.milestone4.ticket.platform.ticket_platform.service;

import java.util.List;

import org.milestone4.ticket.platform.ticket_platform.model.TicketCategory;
import org.milestone4.ticket.platform.ticket_platform.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryService {
    
    @Autowired
    private TicketCategoryRepository repo;

    public List<TicketCategory> findAll(){
        return repo.findAll();
    }
}
