package proyecto1_programacionii;

import javafx.scene.control.DatePicker;

public class Obras {
    
    private String titulo;
    private DatePicker fechaIngreso;
    private String autor;

    @Override
    public String toString() {
        return "Obras{" + "titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + ", autor=" + autor + '}';
    }

    public Obras(String titulo, DatePicker fechaIngreso, String autor) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
        this.autor = autor;
    }

    public Obras() {
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the fechaIngreso
     */
    public DatePicker getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(DatePicker fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
