package com.springcore.SpringWithout;


public class School {
	
	
	private Principal principal;
	//setter
	/*
	 * public void setPrincipal(Principal principal) {
	 *  this.principal=principal;
	 *   }
	 */
	
	//constuctor
	public School(Principal principal) {
		this.principal=principal;
	}
	
	void call() {
		principal.principalDetail();
	}
	
	
	}
	
	





