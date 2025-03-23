package org.milestone4.ticket.platform.ticket_platform.service;

import java.time.LocalDate;
import java.util.List;

import org.milestone4.ticket.platform.ticket_platform.model.Ticket;
import org.milestone4.ticket.platform.ticket_platform.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    
    @Autowired
    private TicketRepository repo;

    @Autowired
    private TicketStateService ticketStateService;

    public List<Ticket> findAll(){
        return repo.findAll();
    }

    public Ticket findById(Integer id){
        return repo.findById(id).get();
    }

    public void save(Ticket ticket){
        repo.save(ticket);
    }

    public Ticket newTicket(){
        Ticket ticket = new Ticket();
        ticket.setCreationDate(LocalDate.now());
        ticket.setState(ticketStateService.findByName("to do"));
        return ticket;
    }

    public void delete(Ticket ticket){
        repo.delete(ticket);
    }

    public List<Ticket> findByCategory(String category){
        return repo.findByCategoryName(category);
    }

    public List<Ticket> findByState(String state){
        return repo.findByStateName(state);
    }

    public List<Ticket> findByTitle(String title){
        return repo.findByTitleContainingIgnoreCase(title);
    }
}
