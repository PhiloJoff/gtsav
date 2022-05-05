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
@Table(name="TIC_TICKET")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TIC_ID")
    private UUID id ;

    @Temporal(TemporalType.DATE)
    @Column(name = "TIC_OPEN_DATE")
    private Date openDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "TIC_CLOSE_DATE")
    private Date closeDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "TIC_CONTACT_DATE")
    private Date contactDate;

    @NotNull
    @NotEmpty
    @Column(name = "TIC_DESCRIPTION")
    private String description;

    @NotNull
    @NotEmpty
    @Column(name = "TIC_EXTRA_INFORMATION")
    private String extraInformation;

    @NotNull
    @NotEmpty
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CON_ID")
    private ContactEntity contact;

    @NotNull
    @NotEmpty
    @Column(name = "TIC_STATE")
    private char state;

    @NotNull
    @NotEmpty
    @Column(name = "TIC_WARRANTY")
    private char warranty;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MOD_ID")
    private ModelEntity model;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUS_ID")
    private CustomerEntity customer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHO_ID")
    private ShopEntity shop;




}
