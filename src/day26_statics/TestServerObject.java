package day26_statics;

import java.time.LocalDate;

public class TestServerObject {

    public static void main(String[] args) {


        Server server = new Server("khashayar", 643, 18, true,
                LocalDate.of(2021, 02, 11));

        System.out.println(server);
        server.cleanTable();
        server.takeOrder();
    }



    }



