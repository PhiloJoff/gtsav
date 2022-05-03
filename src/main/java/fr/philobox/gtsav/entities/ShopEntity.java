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
@Table(name="sho_shop")
public class ShopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sho_name")
    private UUID id ;

    @NotNull
    @NotEmpty
    @Column(name = "sho_name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shop")
    private List<TicketEntity> tickets;





}
