/*
 * @fileoverview    {Vehiculo} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code Vehiculo}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Entity
@Table(name = "\"Vehiculo\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Vehiculo implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String strCodigo;
    @Column(length = 50)
    private String strPlacaVehiculo;
    @Column(length = 50)
    private String strNumeroInterno;
    @Column(length = 50)
    private String strTara;
    @Column(length = 50)
    private String strEjes;
    @Column(length = 50)
    private String strVolumenVehiculo;
    @Column(length = 50)
    private String strInterno;
    @Column(length = 50)
    private String strPatronado;
    @Column(length = 200)
    private String strObservacion;
    @JoinColumn(name = "strIdTransportador", referencedColumnName = "strNombre")
    private String strIdTransportador;

}
