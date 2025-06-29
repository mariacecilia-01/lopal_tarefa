package br.dev.cecilia.tarefas.model;

import java.time.LocalDate;

public class Tarefa {

	private String codigo;
	private String titulo;
	private String descricao;
	private LocalDate dataInicial;
	private int prazo;
	private LocalDate dataConclusao;
	private Status status;
	private Funcionario responsavel;

	

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDataConclusao(LocalDate dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}

	public String getCodigo() {
		return codigo;
	}

	public LocalDate getDataConclusao() {
		return dataConclusao;
	}

	@Override
		public String toString() {
			return this.codigo + "," + this.titulo + "," + this.descricao + "," + this.dataInicial + "," + this.prazo + "," + this.dataConclusao + "," + this.status + "," + this.responsavel + "/n";
		}

}
