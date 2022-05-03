package fr.philobox.gtsav.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="mod_model")
public class ModelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mod_id")
    private UUID id ;

    @NotNull
    @NotEmpty
    @Column(name = "mod_name")
    private String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sup_id")
    private SupplierEntity supplier;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "model")
    private List<TicketEntity> tickets;


}
