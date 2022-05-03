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
    @Column(name = "sup_id")
    private UUID id ;

    @NotNull
    @NotEmpty
    @Column(name = "sup_name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
    private List<ModelEntity> models;

}
