package com.zweicom.spring;

@org.springframework.context.annotation.Configuration
@org.springframework.context.annotation.Import({
	com.zweicom.proyectos.ws.soaint.pe.gestioncontrato.spring.GestionContratoConfig.class,
	com.zweicom.proyectos.ws.soaint.pe.gestioncuenta.spring.GestionCuentaConfig.class,
	com.zweicom.proyectos.ws.soaint.pe.gestioncliente.spring.GestionClienteConfig.class,
	com.zweicom.proyectos.ws.soaint.pe.gestionorder.spring.GestionOrderConfig.class,
	com.zweicom.proyectos.ws.soaint.pe.gestionreniec.spring.GestionReniecConfig.class,
	com.zweicom.proyectos.ws.soaint.pe.utformateador.spring.UtFormateadorWorkitemConfig.class
	})
@org.springframework.context.annotation.PropertySource({ "classpath:autoactivacionsim.properties" })
public class ZwervicioConfig {

}
