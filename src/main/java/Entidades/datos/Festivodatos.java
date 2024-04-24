package Entidades.datos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Festivodatos {

    private String festivo;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fecha;

    public Festivodatos() {
    }

    public Festivodatos(String festivo, Date fecha) {
        this.festivo = festivo;
        this.fecha = fecha;
    }

    public String getFestivo() {
        return festivo;
    }

    public void setFestivo(String festivo) {
        this.festivo = festivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}