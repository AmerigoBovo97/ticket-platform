package org.milestone4.ticket.platform.ticket_platform.repository;

import org.milestone4.ticket.platform.ticket_platform.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer>{
    
}
