package in.priya.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.priya.config.SwaggerConfig;
import in.priya.request.Passenger;
import in.priya.response.Ticket;

@Service
	public class Bookingserviceimpl implements BookingService {
	private final SwaggerConfig swaggerConfig;
	private Map<Integer, Ticket> ticketsMap = new HashMap<>();

	Bookingserviceimpl(SwaggerConfig swaggerConfig) {
		this.swaggerConfig = swaggerConfig;
	}
	
	@Override
	public Ticket bookTicket( Passenger passenger) {
		//logic
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger,t);swaggerConfigtcost(550.00);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);
		ticketNum++;
		
		ticketsMap.put(ticketNum, t);
		
		return t;
	}
	
	@Override
 public Ticket getTicket (Integer ticketNum) {
		
		if(ticketsMap.containsKey(ticketNum));{
		return ticketsMap.get(ticketNum);
		}	
		return null;
	}
}