package com.example.gerenciadordecarros.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chaves")
public class Chave implements Serializable {

    private static final long serialVersionUID = 1734132513458272458L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String codigo;

    public int getId() {
        return id;
    }
    
    @OneToOne(mappedBy = "chave")
    private Carro carro;
    
    

    public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setId(int id) {
        this.id = id;
    }
}
