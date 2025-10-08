package br.com.bibliotecajogos.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Jogo {
    public enum Dificuldade { FACIL, MEDIO, DIFICIL }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private String genero;
    @Column(length = 2000)
    private String descricao;
    private String plataforma;
    private Integer tempoEstimado; // horas
    private LocalDate dataLancamento;
    private Double nota; // 0..10
    @Enumerated(EnumType.STRING)
    private Dificuldade dificuldade = Dificuldade.MEDIO;
    private boolean multiplayer;
    private BigDecimal preco;
    private String lojaUrl;
    private String urlCapa;
    private boolean finalizado;
    private LocalDate dataAdicionado;
    private LocalDate dataFinalizacao;
    @ManyToOne
    private Categoria categoria;

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
    public String getTitulo(){ return titulo; }
    public void setTitulo(String t){ this.titulo = t; }
    public String getAutor(){ return autor; }
    public void setAutor(String a){ this.autor = a; }
    public Integer getAnoPublicacao(){ return anoPublicacao; }
    public void setAnoPublicacao(Integer a){ this.anoPublicacao = a; }
    public String getGenero(){ return genero; }
    public void setGenero(String g){ this.genero = g; }
    public String getDescricao(){ return descricao; }
    public void setDescricao(String d){ this.descricao = d; }
    public String getPlataforma(){ return plataforma; }
    public void setPlataforma(String p){ this.plataforma = p; }
    public Integer getTempoEstimado(){ return tempoEstimado; }
    public void setTempoEstimado(Integer t){ this.tempoEstimado = t; }
    public LocalDate getDataLancamento(){ return dataLancamento; }
    public void setDataLancamento(LocalDate d){ this.dataLancamento = d; }
    public Double getNota(){ return nota; }
    public void setNota(Double n){ this.nota = n; }
    public Dificuldade getDificuldade(){ return dificuldade; }
    public void setDificuldade(Dificuldade d){ this.dificuldade = d; }
    public boolean isMultiplayer(){ return multiplayer; }
    public void setMultiplayer(boolean m){ this.multiplayer = m; }
    public BigDecimal getPreco(){ return preco; }
    public void setPreco(BigDecimal p){ this.preco = p; }
    public String getLojaUrl(){ return lojaUrl; }
    public void setLojaUrl(String l){ this.lojaUrl = l; }
    public String getUrlCapa(){ return urlCapa; }
    public void setUrlCapa(String u){ this.urlCapa = u; }
    public boolean isFinalizado(){ return finalizado; }
    public void setFinalizado(boolean f){ this.finalizado = f; }
    public LocalDate getDataAdicionado(){ return dataAdicionado; }
    public void setDataAdicionado(LocalDate d){ this.dataAdicionado = d; }
    public LocalDate getDataFinalizacao(){ return dataFinalizacao; }
    public void setDataFinalizacao(LocalDate d){ this.dataFinalizacao = d; }
    public Categoria getCategoria(){ return categoria; }
    public void setCategoria(Categoria c){ this.categoria = c; }
}
