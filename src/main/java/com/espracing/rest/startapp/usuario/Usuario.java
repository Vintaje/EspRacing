package com.espracing.rest.startapp.usuario;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "alias", nullable = false)
    private String alias;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "steamid", nullable = false)
    private String steamid;

    @Column(name = "passwd", nullable = false)
    private String passwd;

    @Column(name = "foto", nullable = false)
    private String foto;

    @Column(name = "token", nullable = false)
    private String token;

    @Column(name = "categoria", nullable = false)
    private int categoria;

    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSteamid() {
        return steamid;
    }

    public void setSteamid(String steamid) {
        this.steamid = steamid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", correo='" + correo + '\'' +
                ", steamid='" + steamid + '\'' +
                ", passwd='" + passwd + '\'' +
                ", foto='" + foto + '\'' +
                ", token='" + token + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}