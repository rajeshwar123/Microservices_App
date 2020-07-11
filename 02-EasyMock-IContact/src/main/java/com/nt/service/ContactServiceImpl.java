package com.nt.service;

import com.nt.dao.IContactDao;

public class ContactServiceImpl implements ContactService {

	IContactDao dao;
	public ContactServiceImpl() {
		System.out.println("ContactServiceImpl.ContactServiceImpl()");
	}
	
	public void setDao(IContactDao dao) {
		this.dao = dao;
	}

	@Override
	public String fetchNameById(Integer id) {
		
		//web service call
		String name=dao.findName(id);
		return name;
	}
}
