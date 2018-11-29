package com.fazeel.project.tram.service;

import com.fazeel.project.tram.modal.TramData;

public interface TramServiceI {
	public Iterable<TramData> getAllData();
	public TramData addTramData(TramData tramdata);
	public TramData deleteTramData(TramData tramdata);
	public TramData findTrambyId(int id);
	public TramData deletetramById(int id, TramData td);

}
