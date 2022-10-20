package com.example.gerenciadordecarros.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "carros")
public class Carro implements Serializable {

    private static final long serialVersionUID = 1848135320742265025L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String modelo;

    //Relacionamento das classes com o banco
    @OneToOne
    @JoinColumn(name="Chave_id")
    private Chave chave;
    
    
    @OneToOne
    @JoinColumn(name="Documento_id")
    private Documento documento;
    
    @ManyToOne
    @JoinColumn(name="fabricante_id")
    private Fabricante fabricante;
    
    @ManyToMany
    @JoinTable(name="CARRO_ACESSORIO", joinColumns = @JoinColumn (name = "carro_id"), inverseJoinColumns = @JoinColumn (name="acessorio_id"))
    private List<Acessorio> acessorios;

    
    
    public Chave getChave() {
		return chave;
	}

	public void setChave(Chave chave) {
		this.chave = chave;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
}
