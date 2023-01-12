package a_Creational_Patterns.c_Builder.App;
import a_Creational_Patterns.c_Builder.Builders.Builder;
import a_Creational_Patterns.c_Builder.Cars.CarType;
import a_Creational_Patterns.c_Builder.Components.Engine;
import a_Creational_Patterns.c_Builder.Components.GPSNavigator;
import a_Creational_Patterns.c_Builder.Components.Transmission;
import a_Creational_Patterns.c_Builder.Components.TripComputer;

/*  The director is only responsible for executing the building
steps in a particular sequence. It's helpful when producing
products according to a specific order or configuration.
Strictly speaking, the director class is optional, since the
client can control builders directly.
Director defines the order of building steps. It works with a builder object
through common Builder interface. Therefore it may not know what product is
being built.    */

public class Director {
    /*  The director works with any builder instance that the client code passes to it. This way, the client code may
    alter the final type of the newly assembled product. The director can construct several product variations
    using the same building steps.  */
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
