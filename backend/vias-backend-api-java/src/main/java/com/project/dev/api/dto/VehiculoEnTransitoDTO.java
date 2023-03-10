/*
 * @fileoverview    {VehiculoEnTransitoDTO} se encarga de realizar tareas específicas.
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
package com.project.dev.api.dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code VehiculoEnTransitoDTO}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class VehiculoEnTransitoDTO {

    private String strPlaca;
    private String strCaso;
    private String strConductor;
    private Integer intCedula;
    private String strMateriaPrimaProducto;
    private String strClienteProveedor;
    private String strOrigenDestino;
    private String strFechaEntrada;
    private String strHoraEntrada;
    private String strFechaPesoVacio;
    private String strHoraPesoVacio;
    private String strFechaDespachoPlanta;
    private String strHoraDespachoPlanta;
    private String strFechaPesoLleno;
    private String strHoraPesoLleno;
    private String strFechaSalida;
    private String strHoraSalida;
    private Integer intBruto;
    private Integer intTara;
    private Integer intNeto;
    private Integer intNoTiquete;
    private String strNoShipment;
    private String strNoSello;
    private String strNoR;
    private String strNoContenedor;
    private String strOperario;
    private String strNickOperario;
    private String strObservaciones;
    private String strNoInterno;
    private String strTipoVehiculo;
    private String strEntregadoPor;
    private String strRecibidoPor;
    private String strDireccion;
    private String strTipoProducto;
    private String strUnidad;
    private String strVolumen;
    private String strCiv;
    private String strIdProducto;
    private String strIdVehiculo;
    private String strPlanta;
    private String strTransportadora;

}
