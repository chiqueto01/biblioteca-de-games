package br.com.bibliotecajogos.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Categoria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(length = 1000)
    private String descricao;
    private String iconeUrl;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;
    private boolean ativo = true;

    @PrePersist
    void onCreate(){ this.dataCriacao = LocalDateTime.now(); this.dataAtualizacao = LocalDateTime.now(); }
    @PreUpdate
    void onUpdate(){ this.dataAtualizacao = LocalDateTime.now(); }

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    public String getDescricao(){ return descricao; }
    public void setDescricao(String descricao){ this.descricao = descricao; }
    public String getIconeUrl(){ return iconeUrl; }
    public void setIconeUrl(String iconeUrl){ this.iconeUrl = iconeUrl; }
    public LocalDateTime getDataCriacao(){ return dataCriacao; }
    public void setDataCriacao(LocalDateTime t){ this.dataCriacao = t; }
    public LocalDateTime getDataAtualizacao(){ return dataAtualizacao; }
    public void setDataAtualizacao(LocalDateTime t){ this.dataAtualizacao = t; }
    public boolean isAtivo(){ return ativo; }
    public void setAtivo(boolean ativo){ this.ativo = ativo; }
}
