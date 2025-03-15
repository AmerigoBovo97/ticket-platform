package org.milestone4.ticket.platform.ticket_platform.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tickets")
public class Ticket {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Creation date can not be blank")
    @FutureOrPresent
    private LocalDate creationDate;

    @NotBlank(message = "Title can not be blank")
    @Size(max = 255, message = "Title can not be more then 255 characters long")
    private String title;

    @Lob
    private String text;

    @ManyToMany
    @JoinTable(
        name = "category_ticket",
        joinColumns = @JoinColumn(name = "ticket_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<TicketCategory> categories;

    public Set<TicketCategory> getCategories() {
        return this.categories;
    }

    public void setCategories(Set<TicketCategory> categories) {
        this.categories = categories;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Ticket id(Integer id) {
        setId(id);
        return this;
    }

    public Ticket creationDate(LocalDate creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    public Ticket title(String title) {
        setTitle(title);
        return this;
    }

    public Ticket text(String text) {
        setText(text);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", creationDate='" + getCreationDate() + "'" +
            ", title='" + getTitle() + "'" +
            ", text='" + getText() + "'" +
            "}";
    }
    
}
