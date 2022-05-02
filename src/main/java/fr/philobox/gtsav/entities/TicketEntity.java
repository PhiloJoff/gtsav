package fr.philobox.gtsav.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tic_ticket")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id ;

    @Temporal(TemporalType.DATE)
    private Date dateOpen;

    @Temporal(TemporalType.DATE)
    private Date dateClose;

    @Temporal(TemporalType.DATE)
    private Date dateContact;

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    @NotEmpty
    private String extraInformation;

    @NotNull
    @NotEmpty
    private String contactType;

    @NotNull
    @NotEmpty
    private char state;

    @NotNull
    @NotEmpty
    private char warranty;






}
