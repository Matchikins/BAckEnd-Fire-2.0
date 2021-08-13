package com.br.cefops.Fire.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.cefops.Fire.domain.financesInternal.FinanceEntityAccount;
import com.br.cefops.Fire.domain.financesInternal.FinanceInternal;
import com.br.cefops.Fire.repository.financesInternal.AcountFinanceRepository;
import com.br.cefops.Fire.repository.financesInternal.FinancesInternalRepository;

@RestController
@CrossOrigin
public class allFinanceRescourse {
	@Autowired
	FinancesInternalRepository finances;

	@Autowired
	AcountFinanceRepository acRepo;
	
	
	@ResponseBody
	@RequestMapping(value = "/finances", method = RequestMethod.POST)
	public ResponseEntity<?> newFinance(@RequestBody FinanceInternal finan) {
		Optional<FinanceInternal> optFin = finances.findById(finan.getId());
		if (optFin.isPresent())
			return ResponseEntity.status(HttpStatus.CONFLICT).body("");
		finances.save(finan);
		return ResponseEntity.status(HttpStatus.CREATED).body(finan);
	}
	@ResponseBody
	@RequestMapping(value = "/enti", method = RequestMethod.POST)
	public ResponseEntity<?> newEnti(@RequestBody FinanceEntityAccount finan1) {
		Optional<FinanceEntityAccount> optFin = acRepo.findById(finan1.getId());
		if (optFin.isPresent())
			return ResponseEntity.status(HttpStatus.CONFLICT).body("");
		acRepo.save(finan1);
		return ResponseEntity.status(HttpStatus.CREATED).body(finan1);
	}
	@RequestMapping(value = "/enti", method = RequestMethod.GET)
	public ResponseEntity<?> obterFinan1() {
		List<FinanceEntityAccount> finans = acRepo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(finans);
	}

	@RequestMapping(value = "/finances", method = RequestMethod.GET)
	public ResponseEntity<?> obterFinan() {
		List<FinanceInternal> finans = finances.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(finans);
	}

}
