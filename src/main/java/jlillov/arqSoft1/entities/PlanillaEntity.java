package jlillov.arqSoft1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "jornada")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlanillaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private Integer mes;
    private Integer anio;
    private String rut;
    private String apellidos;
    private String nombres;
    private Integer bonos_horas_extras;
    private Integer bonos_puntualidad;
    private Integer descuento_ingreso;
    private Integer descuento_salida;
    private Integer sueldo_bruto;
    private Integer contizacion_previsional;
    private Integer contizacion_salud;
    private Integer sueldo_liquido;

}
