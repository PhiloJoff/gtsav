package fr.philobox.gtsav.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="mop_maintenance_operation")
public class MaintenanceOperationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mop_id")
    private UUID id ;

    @Temporal(TemporalType.DATE)
    @Column(name = "mop_maintenance_date")
    private Date maintenanceDate;

    @NotNull
    @NotEmpty
    @Column(name = "mop_description")
    private String description;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tic_id")
    private TicketEntity ticket;




}
