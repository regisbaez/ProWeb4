package clases;

import javax.persistence.*;

@Entity

public class Reacc {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rea_generator")
    @SequenceGenerator(name="rea_generator", sequenceName = "rea_seq", allocationSize=1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Art_ID")
    private Art Art;

    @ManyToOne
    @JoinColumn(name = "User_ID")
    private Usua Usua;

    @Column(name="Reacc")
    boolean Reacc;

    public Reacc(Art Art, Usua Usua, boolean Reacc) {
        this.Art = Art;
        this.Usua = Usua;
        this.Reacc = Reacc;
    }

    public Reacc() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isReacc() {
        return Reacc;
    }

    public void setReacc(boolean Reacc) {
        this.Reacc = Reacc;
    }
}
