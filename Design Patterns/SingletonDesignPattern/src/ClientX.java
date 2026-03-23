import enumConcept.HTTP_STATUS;

public class ClientX {

    public static void main(String[] args) {
        Day day1 = Day.MON;

        Day day2 = Day.MON;


        System.out.println();
        System.out.println(day1.hashCode());
        System.out.println(day2.hashCode());

        HTTP_STATUS httpStatus = HTTP_STATUS.OK;
        System.out.println(httpStatus.getCode());
    }
}
