package br.com.ebac.memelandia.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Meme {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome;
	    private String descricao;
	    private Date dataCadastro = new Date();
	    
	    @ManyToOne
	    private CategoriaMeme categoriaMeme;
	    
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }
	    public String getNome() { return nome; }
	    public void setNome(String nome) { this.nome = nome; }
	    public String getDescricao() { return descricao; }
	    public void setDescricao(String descricao) { this.descricao = descricao; }
	    public Date getDataCadastro() { return dataCadastro; }
	    public void setDataCadastro(Date dataCadastro) { this.dataCadastro = dataCadastro; }
	    public CategoriaMeme getCategoriaMeme() { return categoriaMeme; }
	    public void setCategoriaMeme(CategoriaMeme categoriaMeme) { this.categoriaMeme = categoriaMeme; }
	}

