package com.sun.action;


import com.sun.service.BothService;

public class BaseAction {
	private BothService bothService;
	public BothService getBothService() {
		return bothService;
	}
	public void setBothService(BothService bothService) {
		this.bothService = bothService;
	}
	public String save(){
		bothService.save();
		return "success";
	}
}
