package in.priya.rest;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.condition.ConsumesRequestCondition;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import in.priya.request.Passenger;
import in.priya.response.Ticket;
import in.priya.service.BookingService;

@RestController
public class BookingRestController {
	
@Autowired
private BookingService service;
	
@PostMapping(value="/ticket",consumes = "application/json",produces = "application/json")
public ResponseEntity<Ticket> tickeEntity{
	@RequestBody Passenger passenger{
		Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<T>(ticket,HttpsStatus.CREATED);
	}
	}
}
