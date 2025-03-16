package org.milestone4.ticket.platform.ticket_platform.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

    
@Entity
@Table(name = "sates")
public class TicketState {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Name can not be blank")
    private String name;

    @OneToMany(mappedBy = "state")
    private Set<Ticket> tickets;


    public Set<Ticket> getTicket() {
        return this.tickets;
    }

    public void setTicket(Set<Ticket> ticket) {
        this.tickets = ticket;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String email) {
        this.name = email;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}
