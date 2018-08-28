package clases;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "ART")

public class Art {
    public Art() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "art_generator")
    @SequenceGenerator(name="art_generator", sequenceName = "art_seq", allocationSize=1)
    private Long id;
    private String titulo;
    @Column(name = "cuerpo",columnDefinition = "TEXT")
    private String cuerpo;

    @OneToOne
    private Usua autor;

    private Date fecha;
    @OneToMany(mappedBy = "Art",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Com> listaComs;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ART_Etiq", joinColumns = { @JoinColumn(name = "ART_ID") }, inverseJoinColumns = { @JoinColumn(name = "LISTAEtiq_ID_Etiq") })
    private List<Etiq> listaEtiq;

    @Column(nullable = true)
    private int likes;

    @Column(nullable = true)
    private int dislikes;

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    private boolean activo;


    public Art(String titulo, String cuerpo, Usua autor, Date fecha, List<Com> listaComs, List<Etiq> listaEtiq) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.autor = autor;
        this.fecha = fecha;
        this.listaComs = listaComs;
        this.listaEtiq = listaEtiq;
    }

    public List<Com> getListaComs() {

        return listaComs;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public void setListaComs(List<Com> listaComs) {
        this.listaComs = listaComs;
    }

    public List<Etiq> getListaEtiq() {
        return listaEtiq;
    }

    public void setListaEtiq(List<Etiq> listaEtiq) {
        this.listaEtiq = listaEtiq;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Usua getAutor() {
        return autor;
    }

    public void setAutor(Usua autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
