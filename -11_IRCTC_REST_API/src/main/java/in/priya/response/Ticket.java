package in.priya.response;

import lombok.Data;
@Entity
@Data
public class Ticket {

	@Id
	private Integer ticketNum ;
	private Double ticketcost;
	private String status;
	private String name ;
	private String from ;
	private String to ;
	private String doj;
	private String trainNum ;
}
