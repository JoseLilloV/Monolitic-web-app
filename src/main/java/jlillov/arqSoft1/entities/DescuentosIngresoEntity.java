package jlillov.arqSoft1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "descuento_x_ingreso_tarde")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DescuentosIngresoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private Integer tiempo_mayor_que;
    private Integer descuento;
    private Boolean justificativo;

}
