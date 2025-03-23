package org.milestone4.ticket.platform.ticket_platform.repository;

import org.milestone4.ticket.platform.ticket_platform.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

    public Optional<Ticket> findById(Integer id);

    public List<Ticket> findByCategoryName(String categoryName);

    public List<Ticket> findByStateName(String stateName);

    List<Ticket> findByTitleContainingIgnoreCase(String title);
}
