package org.milestone4.ticket.platform.ticket_platform.service;

import java.util.List;

import org.milestone4.ticket.platform.ticket_platform.model.Note;
import org.milestone4.ticket.platform.ticket_platform.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    private NoteRepository repo;

    public void save(Note note){
        repo.save(note);
    }

    public List<Note> findByTicket(Integer id){
        return repo.findByTicketIdOrderByCreationDateTimeDesc(id);
    }
    
}
