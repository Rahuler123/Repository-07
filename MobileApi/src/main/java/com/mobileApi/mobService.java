package com.mobileApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class mobService {
	
	private final mobRep mobrepo;
	
	
	@Autowired
	public mobService (mobRep mobrepo ) {
		this.mobrepo = mobrepo;
		
	}
	public List<mobile> findAll(){
		return mobrepo.findAll();
	}
	
	public Optional <mobile> findById(Long id){
		return mobrepo.findById(id);
		
	}
	 
	public mobile save (mobile mobi) {
		return mobrepo.save(mobi);
	}
	public void deleteById(Long id) {
		mobrepo.deleteById(id);
		
	}

}
