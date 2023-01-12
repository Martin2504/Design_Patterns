package a_Creational_Patterns.c_Builder.Builders;
import a_Creational_Patterns.c_Builder.Cars.Car;
import a_Creational_Patterns.c_Builder.Cars.CarType;
import a_Creational_Patterns.c_Builder.Components.Engine;
import a_Creational_Patterns.c_Builder.Components.GPSNavigator;
import a_Creational_Patterns.c_Builder.Components.Transmission;
import a_Creational_Patterns.c_Builder.Components.TripComputer;

/*  The concrete builder classes follow the builder interface and
provide specific implementations of the building steps. A
program may have several variations of builders, each
implemented differently.
Concrete builders implement steps defined in the common interface.  */

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    // All production steps work with the same product instance.
    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    /*  Concrete builders are supposed to provide their own methods for retrieving results. That's because various
    types of builders may create entirely different products that don't all follow the same interface. Therefore such
    methods can't be declared in the builder interface (at least not in a statically-typed programming language).
    Usually, after returning the end result to the client, a builder instance is expected to be ready to start
    producing another product. That's why it's a usual practice to call the reset method at the end of the
    `getProduct` method body. However, this behavior isn't mandatory, and you can make your builder wait for an
    explicit reset call from the client code before disposing of the previous result.    */
    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
