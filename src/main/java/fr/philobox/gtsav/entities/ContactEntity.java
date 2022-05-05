package fr.philobox.gtsav.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CON_CONTACT")
public class ContactEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CON_ID")
    private UUID id ;

    @NotNull
    @NotEmpty
    @Column(name = "CON_NAME", length = 30)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contact")
    private List<TicketEntity> tickets;
}
