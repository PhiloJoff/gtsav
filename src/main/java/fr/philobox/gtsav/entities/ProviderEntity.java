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
@Table(name="pro_provider")
public class ProviderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pro_id")
    private UUID id ;

    @NotNull
    @NotEmpty
    @Column(name = "pro_name")
    private String name;




}
