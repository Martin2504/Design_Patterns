package a_Creational_Patterns.c_Builder.App;
import a_Creational_Patterns.c_Builder.Builders.CarBuilder;
import a_Creational_Patterns.c_Builder.Builders.CarManualBuilder;
import a_Creational_Patterns.c_Builder.Cars.Car;
import a_Creational_Patterns.c_Builder.Cars.Manual;
import java.util.Scanner;

/*  The client code creates a builder object, passes it to the
director and then initiates the construction process. The end
result is retrieved from the builder object.
Everything comes together here.     */

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        /* Director gets the concrete builder object from the client
        (application code). That's because application knows better which
        builder to use to get a specific product.    */
        CarBuilder builder = new CarBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which car do you want?\n\t(1) Sports Car\n\t(2) City Car\n\t(3) SUV");
        int answer = scanner.nextInt();
        if (answer == 1) {
            director.constructSportsCar(builder);
        } else if (answer == 2) {
            director.constructCityCar(builder);
        } else if (answer == 3) {
            director.constructSUV(builder);
        } else {
            System.out.printf("Invalid car type entered");
        }


        /* The final product is often retrieved from a builder object, since
        Director is not aware and not dependent on concrete builders and
        products.    */
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        if (answer == 1) {
            director.constructSportsCar(manualBuilder);
        } else if (answer == 2) {
            director.constructCityCar(manualBuilder);
        } else if (answer == 3) {
            director.constructSUV(manualBuilder);
        }
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
