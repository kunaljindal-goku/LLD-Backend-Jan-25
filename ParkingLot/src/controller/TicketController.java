package controller;

import dto.IssueTicketRequest;
import dto.IssueTicketResponse;
import dto.ResponseStatus;
import models.Ticket;
import service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest request) {
        IssueTicketResponse response = new IssueTicketResponse();
        try {
            Ticket ticket = ticketService.issueTicket(request.getGateId(),
                    request.getNumberPlate(),
                    request.getVehicleType(),
                    request.getOwnerName(),
                    request.getParkingLotId());

            response.setTicketId(ticket.getId());
            response.setSlotNumber(ticket.getParkingSlot().getSlotNumber());
            response.setStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            response.setFailureMessage("Failed to issue ticket "+e.getMessage());
            response.setStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
