package com.orm.permits.app;

import com.orm.permits.dao.AgencyDAO;
import com.orm.permits.domain.Agency;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AgencyDAO dao = new AgencyDAO();
        List<Agency> getAgencies = dao.getAll();
        System.out.println("---------------------------------------------------------");
        System.out.println("Listing Agency Details... "+getAgencies.size());
        //System.out.println("***"+getAgencies);

            getAgencies.forEach((n)-> System.out.println(n));

        System.out.println("---------------------------------------------------------");

        /*Agency nAgency = new Agency("Comisión Federal de Electricidad","Relampago Veloz",12,34,"L-V","8-2","Sin anotaciones","P-123");
        System.out.println("Insert: "+nAgency);

        dao.saveRecord(nAgency);
        System.out.println("Done: "+nAgency);
        */

    }
}
