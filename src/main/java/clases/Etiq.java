package clases;

import javax.persistence.*;

@Entity

public class Etiq {
    public Etiq() {
    }

    public Long getId_Etiq() {
        return id_Etiq;
    }

    public void setId_Etiq(Long id_Etiq) {
        this.id_Etiq = id_Etiq;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "et_generator")
    @SequenceGenerator(name="et_generator", sequenceName = "et_seq", allocationSize=1)
    private Long id_Etiq;
    private String Etiq;



    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    private boolean activo;

    public Etiq(String Etiq) {
        this.Etiq = Etiq;
    }

    public String getEtiq() {
        return Etiq;
    }

    public void setEtiq(String Etiq) {
        this.Etiq = Etiq;
    }
}
