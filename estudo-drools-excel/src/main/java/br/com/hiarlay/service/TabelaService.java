package br.com.hiarlay.service;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hiarlay.model.Customer;
import br.com.hiarlay.model.Customer.CustomerType;

@Service
public class TabelaService {
	
	@Autowired
    private KieSession kieSession;
 
    public void verificarTabela() {
    	Customer customer = new Customer();
    	customer.setType(CustomerType.INDIVIDUAL);
    	customer.setYears(3);
    	kieSession.insert(customer);
    	 
    	kieSession.fireAllRules();
    	System.out.println(customer.getDiscount());
    }
    

}
