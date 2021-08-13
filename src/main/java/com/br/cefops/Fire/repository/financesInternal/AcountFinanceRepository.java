package com.br.cefops.Fire.repository.financesInternal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cefops.Fire.domain.financesInternal.FinanceEntityAccount;

public interface AcountFinanceRepository extends JpaRepository<FinanceEntityAccount, Long>{

}
