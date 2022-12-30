package jlillov.arqSoft1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "bonificacion_tiempo_servicio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BonificacionTiempoServicioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String signo;
    private Integer anios;
    private Integer bonificacion;


}
