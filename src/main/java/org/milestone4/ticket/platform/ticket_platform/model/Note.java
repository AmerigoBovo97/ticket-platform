package org.milestone4.ticket.platform.ticket_platform.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "notes")
public class Note {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Text can not be blank")
    @Lob
    private String text;

    @NotBlank(message = "Creation date time can not be blank")
    private LocalDateTime creationDateTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Integer author;

    @ManyToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private Integer ticket;


    public Integer getAuthor() {
        return this.author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getTicket() {
        return this.ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreationDateTime() {
        return this.creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
}
