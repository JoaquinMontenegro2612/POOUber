import java.sql.Driver;

public class Car {
    Integer Id;
    String license;
    String driver;
    Integer passenger;

    void printDatacar() {
        System.out.println("Matricula: " + license + " Piloto: " + driver);
    }
}
