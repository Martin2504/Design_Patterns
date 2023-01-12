package a_Creational_Patterns.c_Builder.Builders;
import a_Creational_Patterns.c_Builder.Cars.CarType;
import a_Creational_Patterns.c_Builder.Components.Engine;
import a_Creational_Patterns.c_Builder.Components.GPSNavigator;
import a_Creational_Patterns.c_Builder.Components.Transmission;
import a_Creational_Patterns.c_Builder.Components.TripComputer;

/*  The builder interface specifies methods for creating the
different parts of the product objects.
Builder interface defines all possible ways to configure a product.     */

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator );
}
