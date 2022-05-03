package fr.philobox.gtsav.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cus_customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cus_id")
    private UUID id ;

    @NotNull
    @NotEmpty
    @Column(name = "cus_firstname")
    private String firstname;

    @NotNull
    @NotEmpty
    @Column(name = "cus_lastname")
    private String lastname;

    @NotNull
    @NotEmpty
    @Column(name = "cus_tel")
    private String tel;

    @NotNull
    @Email
    @Column(name = "cus_email")
    private String email;

    @NotNull
    @NotEmpty
    @Column(name = "cus_address")
    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<TicketEntity> tickets;

}
