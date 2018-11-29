package com.fazeel.project.tram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazeel.project.tram.modal.TramData;
import com.fazeel.project.tram.repo.TramRepoI;

@Service
public class TramService implements TramServiceI {
	TramRepoI tramrepoi;
	
	@Autowired
	public TramService(TramRepoI tramrepoi)
	{
		super();
		this.tramrepoi=tramrepoi;
	}
	@Override
	public Iterable<TramData> getAllData()
	{
		Iterable<TramData> tramDataList=tramrepoi.findAll();
		return tramDataList;
	}
	@Override
	public TramData addTramData(TramData tramdata) {
	try {
		tramrepoi.save(tramdata);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return tramdata;
	}
	@Override
	public TramData deleteTramData(TramData tramdata) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TramData findTrambyId(int id) {
		// TODO Auto-generated method stub
		System.out.println("In Service:"+tramrepoi.existsById(id));
		TramData newtramrecord=tramrepoi.findById(id).orElse(null);
		return newtramrecord;
	}
	@Override
	public TramData deletetramById(int id, TramData td) {
		System.out.println("Inside delete Service");
		tramrepoi.deleteById(id);
		return null;
		
	}

}
