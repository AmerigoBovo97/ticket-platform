package org.milestone4.ticket.platform.ticket_platform.service;

import java.util.List;
import java.util.Optional;

import org.milestone4.ticket.platform.ticket_platform.model.User;
import org.milestone4.ticket.platform.ticket_platform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public Optional<User> findById(Integer id){
        return repo.findById(id);
    }

    public Optional<User> findByUsername(String username){
        return repo.findByUsername(username);
    }

    public List<User> findByState(boolean state){
        return repo.findByState(state);
    }
}
