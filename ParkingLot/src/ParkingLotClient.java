import controller.TicketController;
import dto.IssueTicketRequest;
import dto.IssueTicketResponse;
import models.Ticket;
import models.VehicleType;
import repository.GateRepository;
import repository.ParkingLotRepo;
import repository.TIcketRepo;
import repository.VehicleRepo;
import service.TicketService;

public class ParkingLotClient {
    public static void main(String[] args) {

         GateRepository gateRepository = new GateRepository();
         ParkingLotRepo parkingLotRepo = new ParkingLotRepo();
         VehicleRepo vehicleRepo = new VehicleRepo();
         TIcketRepo tIcketRepo = new TIcketRepo();

        TicketService ticketService = new TicketService(gateRepository,
                parkingLotRepo,
                vehicleRepo,
                tIcketRepo);
        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequest issueTicketRequest = new IssueTicketRequest(
                1,
                "DLI123",
                VehicleType.LIGHT_FOUR_WHEELER,
                "Salman Khan",
                10
        );
        IssueTicketResponse response =
                ticketController.issueTicket(issueTicketRequest);

        System.out.println(response.getTicketId());
        System.out.println(response.getSlotNumber());
    }
}
