package br.gov.ma.seap.models;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "lembrete")
public class Lembrete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "local")
    private String local;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "data")
    private Calendar data = Calendar.getInstance();

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "titulo")
    private String titulo;


    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo;  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
