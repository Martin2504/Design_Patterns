package b_Structural_Patterns.e_Facade.App;
import b_Structural_Patterns.e_Facade.Facade.VideoConversionFacade;
import java.io.File;

// Application classes don't depend on a billion classes
// provided by the complex framework. Also, if you decide to
// switch frameworks, you only need to rewrite the facade class.

public class Application {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
