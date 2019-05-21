package sg.edu.nus.lapslogin.model;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Role_ID")
    private int id;

    @Column(name = "Role")
    private String role;
}