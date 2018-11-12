/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author luizg
 */
@Entity
public class Empresa implements Serializable {

    public Empresa(String cnpj, String usuario, String senha, String nome, String telefone) {
        this.cnpj = cnpj;
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Empresa() {
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo")
    private Long id;
    
    @Column(length=20, name = "CNPJ")
    private String cnpj;
    @Column(length=255, name = "usuario")
    private String usuario;
    @Column(length=255, name = "senha")
    private String senha;
    @Column(length=100, name = "nome")
    private String nome;
    @Column(length=20, name = "telefone") // não precisa de length ja q é bigint / acho melhor ser String
    private String telefone;
    
    private List prestadors = new ArrayList(0);;
    private List solicitacaos = new ArrayList(0);;
    private List agendas = new ArrayList(0);;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List getPrestadors() {
        return prestadors;
    }

    public void setPrestadors(List prestadors) {
        this.prestadors = prestadors;
    }

    public List getSolicitacaos() {
        return solicitacaos;
    }

    public void setSolicitacaos(List solicitacaos) {
        this.solicitacaos = solicitacaos;
    }

    public List getAgendas() {
        return agendas;
    }

    public void setAgendas(List agendas) {
        this.agendas = agendas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.cnpj);
        hash = 67 * hash + Objects.hashCode(this.usuario);
        hash = 67 * hash + Objects.hashCode(this.senha);
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.telefone);
        hash = 67 * hash + Objects.hashCode(this.prestadors);
        hash = 67 * hash + Objects.hashCode(this.solicitacaos);
        hash = 67 * hash + Objects.hashCode(this.agendas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.prestadors, other.prestadors)) {
            return false;
        }
        if (!Objects.equals(this.solicitacaos, other.solicitacaos)) {
            return false;
        }
        if (!Objects.equals(this.agendas, other.agendas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", cnpj=" + cnpj + ", usuario=" + usuario + ", senha=" + senha + ", nome=" + nome + ", telefone=" + telefone + ", prestadors=" + prestadors + ", solicitacaos=" + solicitacaos + ", agendas=" + agendas + '}';
    }

}
