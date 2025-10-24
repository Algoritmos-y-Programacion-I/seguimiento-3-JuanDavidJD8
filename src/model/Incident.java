package model;
import java.time.LocaDate;

public class Incident {
    private LocalDate dateReporte;
    private String descripcion;
    private boolean resuelto;
    private int horaSolucion;

    public Incident(LocaDate dateReporte, String descripcion){
        this.dateReporte = dateReporte;
        this.descripcion = descripcion;
        this.resuelto = false;
        this.horaSolucion = 0,
    }
}
public LocalDate getDateReport(){
    return dateReporte;
}

public String getDescripcion(){
    return descripcion;
}

public boolean getResuelto(){
    return resuelto;
}

public int getHoraSolucion(){
    return horaSolucion;
}

