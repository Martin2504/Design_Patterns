package b_Structural_Patterns.g_Proxy.Some_cool_media_library;
import java.util.HashMap;

// The interface of a remote service.

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
