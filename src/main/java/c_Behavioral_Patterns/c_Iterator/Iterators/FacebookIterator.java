package c_Behavioral_Patterns.c_Iterator.Iterators;
import c_Behavioral_Patterns.c_Iterator.Profile.Profile;
import c_Behavioral_Patterns.c_Iterator.Social_Networks.Facebook;
import java.util.ArrayList;
import java.util.List;

// A concrete iterator class.

public class FacebookIterator implements ProfileIterator {
    // The iterator needs a reference to the collection (social network) that it traverses.
    private Facebook facebook;
    private String type;
    private String email;

    // An iterator object traverses the collection independently
    // from other iterators. Therefore it has to store the iteration state.
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();


    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    // Each concrete iterator class has its own implementation
    // of the common iterator interface.
    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
