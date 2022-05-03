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
    @Column(name = "tic_id")
    private UUID id ;

    @Temporal(TemporalType.DATE)
    @Column(name = "tic_open_date")
    private Date openDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "tic_close_date")
    private Date closeDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "tic_contact_date")
    private Date contactDate;

    @NotNull
    @NotEmpty
    @Column(name = "tic_description")
    private String description;

    @NotNull
    @NotEmpty
    @Column(name = "tic_extra_information")
    private String extraInformation;

    @NotNull
    @NotEmpty
    @Column(name = "tic_contact_type")
    private String contactType;

    @NotNull
    @NotEmpty
    @Column(name = "tic_state")
    private char state;

    @NotNull
    @NotEmpty
    @Column(name = "tic_warranty")
    private char warranty;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mod_id")
    private ModelEntity model;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cus_id")
    private CustomerEntity customer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sho_id")
    private ShopEntity shop;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tit_id")
    private TypeItemEntity typeItem;




}
