package com.fazeel.project.tram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fazeel.project.tram.modal.TramData;
import com.fazeel.project.tram.service.TramService;
import com.fazeel.project.tram.service.TramServiceI;

@RestController
@RequestMapping("/api")
@SuppressWarnings("rawtypes")
//add cross origins here
public class TramController {
	@Autowired
	TramServiceI tramservice;
		//Get Request
		@RequestMapping(value="/getAll",method=RequestMethod.GET)
		public ResponseEntity showData()
		{
			System.out.println("Entered GET");
			return new ResponseEntity<>(tramservice.getAllData(),HttpStatus.OK);
		
		}
		
		//Post Request
		@RequestMapping(value="/postTram",method=RequestMethod.POST)
		public ResponseEntity<TramData> addTramData(@RequestBody TramData tramdata)
		{
			System.out.println("Entered Post");
			TramData newtramdata=tramservice.addTramData(tramdata);
			return new ResponseEntity<TramData>(newtramdata,HttpStatus.OK);
		}
		
		//delete by id
		@RequestMapping(value="/getAll/{id}",method=RequestMethod.GET)
		public ResponseEntity showtrambyid(@PathVariable(value="id") int id,@RequestBody TramData tramdata)
		{
			System.out.println("Entered FINDBYID");
			return new ResponseEntity<>(tramservice.findTrambyId(id),HttpStatus.OK); 
		}
		
		//delete Request
		@RequestMapping(value="/deleteTram/{id}",method=RequestMethod.DELETE)
		public ResponseEntity<TramData> deleteTramData(@PathVariable(value="id") int id,@RequestBody TramData tramdata)
		{
			System.out.println("delete entered");
			TramData td=new TramData();
			td.setId(id);
			return new ResponseEntity<>(tramservice.deletetramById(id,td),HttpStatus.OK);
		}
}
