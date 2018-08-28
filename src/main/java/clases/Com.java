package clases;

import javax.persistence.*;

@Entity
public class Com {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "com_generator")
    @SequenceGenerator(name="com_generator", sequenceName = "com_seq", allocationSize=1)
    private long id_Com;

    @Column(name = "Com", columnDefinition = "TEXT")
    private String Com;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usua autor;

    @ManyToOne(fetch = FetchType.EAGER)
    private Art Art;

    public Com(String Com, Usua autor, Art Art) {
        this.Com = Com;
        this.autor = autor;
        this.Art = Art;
    }

    public Com() {
    }

    public long getId() {

        return id_Com;
    }

    public void setId(long id) {
        this.id_Com = id;
    }

    public String getCom() {
        return Com;
    }

    public void setCom(String Com) {
        this.Com = Com;
    }

    public Usua getAutor() {
        return autor;
    }

    public void setAutor(Usua autor) {
        this.autor = autor;
    }

}
