package com.fazeel.project.tram.repo;


import org.springframework.data.repository.CrudRepository;

import com.fazeel.project.tram.modal.TramData;

public interface TramRepoI extends CrudRepository<TramData,Integer> {
	

}
