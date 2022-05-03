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
@Table(name="tit_type_item")
public class TypeItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tit_id")
    private UUID id ;

    @NotNull
    @NotEmpty
    @Column(name = "tit_name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "typeItem")
    private List<TicketEntity> tickets;




}
