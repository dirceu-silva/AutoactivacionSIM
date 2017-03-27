package com.zweicom.autoactivacionsim;

/**
 * This class was automatically generated by the data modeler tool.
 */
import java.util.Map;
import org.slf4j.Logger;

public class Cliente implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long idCliente;
   private java.lang.String tipoPersona;
   private java.lang.String tipoDocumento;
   private java.lang.String numeroDocumento;
   private java.lang.String razonSocial;
   private java.lang.String nombres;
   private java.lang.String primerApellido;
   private java.lang.String segundoApellido;
   private java.util.Date fechaNacimiento;
   private java.lang.String codArea;
   private java.lang.String numeroTelefono;
   private java.lang.String correo;
   private java.lang.String direccionCompleta;
   private java.lang.Long codigoDepartamento;
   private java.lang.Long codigoProvincia;
   private java.lang.Long codigoDistrito;
   private java.lang.String tipoCliente;

   private java.lang.Long idClienteBSCS;

   private java.lang.String codigoBSCS;

   public Cliente()
   {
   }

   private Logger PLOGGER;

   public Cliente(PersonaReniec persona)
   {
      if (persona.getFechaNacimiento().parse("") != 0)
      {
         this.setFechaNacimiento(persona.getFechaNacimiento());
      }

      if (persona.getNombres().compareTo("") != 0)
      {
         this.setNombres(persona.getNombres());
      }

      if (persona.getNumeroDocumento().compareTo("") != 0)
      {
         this.setNumeroDocumento(persona.getNumeroDocumento());
      }

      if (persona.getPrimerApellido().compareTo("") != 0)
      {
         this.setPrimerApellido(persona.getPrimerApellido());
      }

      if (persona.getSegundoApellido().compareTo("") != 0)
      {
         this.setSegundoApellido(persona.getSegundoApellido());
      }

      if (persona.getTipoDocumento().compareTo("") != 0)
      {
         this.setTipoDocumento(persona.getTipoDocumento());
      }
   }

   public void setPersona(PersonaReniec persona)
   {
      System.out.println("ENTRTANDO AL METODO");
      /*
      if( persona.getFechaNacimiento().parse("") !=0 ){
         this.setFechaNacimiento(persona.getFechaNacimiento());
       }*/
      System.out.println("parte1");
      if (persona.getNombres().compareTo("") != 0)
      {
         this.setNombres(persona.getNombres());
      }
      System.out.println("parte2");
      if (persona.getNumeroDocumento().compareTo("") != 0)
      {
         this.setNumeroDocumento(persona.getNumeroDocumento());
      }
      System.out.println("parte3");
      if (persona.getPrimerApellido().compareTo("") != 0)
      {
         this.setPrimerApellido(persona.getPrimerApellido());
      }
      System.out.println("parte4");
      if (persona.getSegundoApellido().compareTo("") != 0)
      {
         this.setSegundoApellido(persona.getSegundoApellido());
      }
      System.out.println("parte5");
      if (persona.getTipoDocumento().compareTo("") != 0)
      {
         this.setTipoDocumento(persona.getTipoDocumento());
      }
      System.out.println("SALIENDO DEL METODO");
   }

   public void setDatos(Map<String, Object> resultados)
   {
      PersonaReniec persona = (PersonaReniec) resultados.get("personaReniec");

      if (persona.getFechaNacimiento().parse("") != 0)
      {
         this.setFechaNacimiento(persona.getFechaNacimiento());
      }

      if (persona.getNombres().compareTo("") != 0)
      {
         this.setNombres(persona.getNombres());
      }

      if (persona.getNumeroDocumento().compareTo("") != 0)
      {
         this.setNumeroDocumento(persona.getNumeroDocumento());
      }

      if (persona.getPrimerApellido().compareTo("") != 0)
      {
         this.setPrimerApellido(persona.getPrimerApellido());
      }

      if (persona.getSegundoApellido().compareTo("") != 0)
      {
         this.setSegundoApellido(persona.getSegundoApellido());
      }

      if (persona.getTipoDocumento().compareTo("") != 0)
      {
         this.setTipoDocumento(persona.getTipoDocumento());
      }
   }

   public java.lang.Long getIdCliente()
   {
      return this.idCliente;
   }

   public void setIdCliente(java.lang.Long idCliente)
   {
      this.idCliente = idCliente;
   }

   public java.lang.String getTipoPersona()
   {
      return this.tipoPersona;
   }

   public void setTipoPersona(java.lang.String tipoPersona)
   {
      this.tipoPersona = tipoPersona;
   }

   public java.lang.String getTipoDocumento()
   {
      return this.tipoDocumento;
   }

   public void setTipoDocumento(java.lang.String tipoDocumento)
   {
      this.tipoDocumento = tipoDocumento;
   }

   public java.lang.String getNumeroDocumento()
   {
      return this.numeroDocumento;
   }

   public void setNumeroDocumento(java.lang.String numeroDocumento)
   {
      this.numeroDocumento = numeroDocumento;
   }

   public java.lang.String getRazonSocial()
   {
      return this.razonSocial;
   }

   public void setRazonSocial(java.lang.String razonSocial)
   {
      this.razonSocial = razonSocial;
   }

   public java.lang.String getNombres()
   {
      return this.nombres;
   }

   public void setNombres(java.lang.String nombres)
   {
      this.nombres = nombres;
   }

   public java.lang.String getPrimerApellido()
   {
      return this.primerApellido;
   }

   public void setPrimerApellido(java.lang.String primerApellido)
   {
      this.primerApellido = primerApellido;
   }

   public java.lang.String getSegundoApellido()
   {
      return this.segundoApellido;
   }

   public void setSegundoApellido(java.lang.String segundoApellido)
   {
      this.segundoApellido = segundoApellido;
   }

   public java.util.Date getFechaNacimiento()
   {
      return this.fechaNacimiento;
   }

   public void setFechaNacimiento(java.util.Date fechaNacimiento)
   {
      this.fechaNacimiento = fechaNacimiento;
   }

   public java.lang.String getCodArea()
   {
      return this.codArea;
   }

   public void setCodArea(java.lang.String codArea)
   {
      this.codArea = codArea;
   }

   public java.lang.String getNumeroTelefono()
   {
      return this.numeroTelefono;
   }

   public void setNumeroTelefono(java.lang.String numeroTelefono)
   {
      this.numeroTelefono = numeroTelefono;
   }

   public java.lang.String getCorreo()
   {
      return this.correo;
   }

   public void setCorreo(java.lang.String correo)
   {
      this.correo = correo;
   }

   public java.lang.String getDireccionCompleta()
   {
      return this.direccionCompleta;
   }

   public void setDireccionCompleta(java.lang.String direccionCompleta)
   {
      this.direccionCompleta = direccionCompleta;
   }

   public java.lang.Long getCodigoDepartamento()
   {
      return this.codigoDepartamento;
   }

   public void setCodigoDepartamento(java.lang.Long codigoDepartamento)
   {
      this.codigoDepartamento = codigoDepartamento;
   }

   public java.lang.Long getCodigoProvincia()
   {
      return this.codigoProvincia;
   }

   public void setCodigoProvincia(java.lang.Long codigoProvincia)
   {
      this.codigoProvincia = codigoProvincia;
   }

   public java.lang.Long getCodigoDistrito()
   {
      return this.codigoDistrito;
   }

   public void setCodigoDistrito(java.lang.Long codigoDistrito)
   {
      this.codigoDistrito = codigoDistrito;
   }

   public java.lang.String getTipoCliente()
   {
      return this.tipoCliente;
   }

   public void setTipoCliente(java.lang.String tipoCliente)
   {
      this.tipoCliente = tipoCliente;
   }

   public Cliente(java.lang.Long idCliente, java.lang.String tipoPersona,
         java.lang.String tipoDocumento, java.lang.String numeroDocumento,
         java.lang.String razonSocial, java.lang.String nombres,
         java.lang.String primerApellido, java.lang.String segundoApellido,
         java.util.Date fechaNacimiento, java.lang.String codArea,
         java.lang.String numeroTelefono, java.lang.String correo,
         java.lang.String direccionCompleta,
         java.lang.Long codigoDepartamento, java.lang.Long codigoProvincia,
         java.lang.Long codigoDistrito, java.lang.String tipoCliente)
   {
      this.idCliente = idCliente;
      this.tipoPersona = tipoPersona;
      this.tipoDocumento = tipoDocumento;
      this.numeroDocumento = numeroDocumento;
      this.razonSocial = razonSocial;
      this.nombres = nombres;
      this.primerApellido = primerApellido;
      this.segundoApellido = segundoApellido;
      this.fechaNacimiento = fechaNacimiento;
      this.codArea = codArea;
      this.numeroTelefono = numeroTelefono;
      this.correo = correo;
      this.direccionCompleta = direccionCompleta;
      this.codigoDepartamento = codigoDepartamento;
      this.codigoProvincia = codigoProvincia;
      this.codigoDistrito = codigoDistrito;
      this.tipoCliente = tipoCliente;
   }

   public java.lang.Long getIdClienteBSCS()
   {
      return this.idClienteBSCS;
   }

   public void setIdClienteBSCS(java.lang.Long idClienteBSCS)
   {
      this.idClienteBSCS = idClienteBSCS;
   }

   public java.lang.String getCodigoBSCS()
   {
      return this.codigoBSCS;
   }

   public void setCodigoBSCS(java.lang.String codigoBSCS)
   {
      this.codigoBSCS = codigoBSCS;
   }

   public Cliente(java.lang.Long idCliente, java.lang.String tipoPersona,
         java.lang.String tipoDocumento, java.lang.String numeroDocumento,
         java.lang.String razonSocial, java.lang.String nombres,
         java.lang.String primerApellido, java.lang.String segundoApellido,
         java.util.Date fechaNacimiento, java.lang.String codArea,
         java.lang.String numeroTelefono, java.lang.String correo,
         java.lang.String direccionCompleta, java.lang.Long codigoDepartamento,
         java.lang.Long codigoProvincia, java.lang.Long codigoDistrito,
         java.lang.String tipoCliente, java.lang.Long idClienteBSCS,
         java.lang.String codigoBSCS, org.slf4j.Logger PLOGGER)
   {
      this.idCliente = idCliente;
      this.tipoPersona = tipoPersona;
      this.tipoDocumento = tipoDocumento;
      this.numeroDocumento = numeroDocumento;
      this.razonSocial = razonSocial;
      this.nombres = nombres;
      this.primerApellido = primerApellido;
      this.segundoApellido = segundoApellido;
      this.fechaNacimiento = fechaNacimiento;
      this.codArea = codArea;
      this.numeroTelefono = numeroTelefono;
      this.correo = correo;
      this.direccionCompleta = direccionCompleta;
      this.codigoDepartamento = codigoDepartamento;
      this.codigoProvincia = codigoProvincia;
      this.codigoDistrito = codigoDistrito;
      this.tipoCliente = tipoCliente;
      this.idClienteBSCS = idClienteBSCS;
      this.codigoBSCS = codigoBSCS;
      this.PLOGGER = PLOGGER;
   }

}