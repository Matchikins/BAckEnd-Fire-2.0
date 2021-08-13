package com.br.cefops.Fire.domain.financesInternal;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class FinanceEntityAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	@OneToMany
	@JoinColumn(name='Fina')
	private List<FinanceInternal> finances;
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
	public List<FinanceInternal> getFinances() {
		return finances;
	}
	public void setFinances(List<FinanceInternal> finances) {
		this.finances = finances;
	}
	
	
	

}
