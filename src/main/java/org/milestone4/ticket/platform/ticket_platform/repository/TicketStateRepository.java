package org.milestone4.ticket.platform.ticket_platform.repository;

import org.milestone4.ticket.platform.ticket_platform.model.TicketState;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketStateRepository extends JpaRepository<TicketState, Integer>{
    
}
