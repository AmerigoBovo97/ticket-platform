package org.milestone4.ticket.platform.ticket_platform.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tickets")
public class Ticket {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Creation date can not be null")
    @FutureOrPresent
    private LocalDate creationDate;

    @NotBlank(message = "Title can not be blank")
    @Size(max = 255, message = "Title can not be more then 255 characters long")
    private String title;

    @Lob
    private String text;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private TicketCategory category;
    
    @ManyToOne
    @JoinColumn(name = "state_id", nullable = false)
    private TicketState state;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User operator;

    @OneToMany(mappedBy = "ticket")
    private Set<Note> notes;

    
    public Set<Note> getNotes() {
        return this.notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    public User getOperator() {
        return this.operator;
    }

    public void setOperator(User operator) {
        this.operator = operator;
    }


    public TicketState getState() {
        return this.state;
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public TicketCategory getCategory() {
        return this.category;
    }

    public void setCategories(TicketCategory category) {
        this.category = category;
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
