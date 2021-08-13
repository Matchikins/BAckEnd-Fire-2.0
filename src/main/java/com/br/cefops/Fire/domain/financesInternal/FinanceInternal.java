package com.br.cefops.Fire.domain.financesInternal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FinanceInternal  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String name;
	private Date dateInit;
	private Date dateVenci;
	private String desc;
	private Double valor;
	private Boolean pay;
	@ManyToOne
	private FinanceEntityAccount account;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateInit() {
		return dateInit;
	}
	public void setDateInit(Date dateInit) {
		this.dateInit = dateInit;
	}
	public Date getDateVenci() {
		return dateVenci;
	}
	public void setDateVenci(Date dateVenci) {
		this.dateVenci = dateVenci;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Boolean getPay() {
		return pay;
	}
	public void setPay(Boolean pay) {
		this.pay = pay;
	}
	
	
	

}
