package in.priya.service;

import in.priya.request.Passenger;
import in.priya.response.Ticket;

public interface BookingService {

	Ticket bookTicket(Passenger passenger);

	Ticket getTicket(Integer ticketNum);
	
}
