package fr.philobox.gtsav.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sup_supplier")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id ;

    @NotNull(message = "Name is mandatory")
    @NotEmpty(message = "Name can't be empty")
    private String name;

    @OneToMany(mappedBy = "supplier")
    private List<ModelEntity> models;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Temporal(TemporalType.DATE)
    private Date dateModification;
}
