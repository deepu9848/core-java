package laboratory;

import java.util.concurrent.Callable;

public class LaboratoryApp {
    public static void main(String[] args) {

        Paramedics deepak = new Paramedics();
        deepak.setId(1);
        deepak.setName("Deepak");
        deepak.setContactNumber("987654321");
        deepak.setAddress("NewJersey");
        deepak.setSalary(2000);
        deepak.setQualification(Qualification.graduate.name());

        Drivers bryan = new Drivers();
        bryan.setId(2);
        bryan.setName("Bryan");
        bryan.setContactNumber("123445678");
        bryan.setAddress("NewYork");
        bryan.setLicenseNumber("A4352");
        bryan.setSalary(1500);

        Clients hary = new Clients();
        hary.setId(3);
        hary.setName("Hary");
        hary.setContactNumber("234567891");
        hary.setAddress("Boston");
        hary.setFaxNumber("344848992");


    }
        };


