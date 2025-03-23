package org.milestone4.ticket.platform.ticket_platform.repository;

import java.util.List;

import org.milestone4.ticket.platform.ticket_platform.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer>{
    
    public List<Note> findByTicketIdOrderByCreationDateTimeDesc(Integer id);
}
