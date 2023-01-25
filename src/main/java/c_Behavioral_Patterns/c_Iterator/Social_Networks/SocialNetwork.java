package c_Behavioral_Patterns.c_Iterator.Social_Networks;
import c_Behavioral_Patterns.c_Iterator.Iterators.ProfileIterator;

// The collection interface must declare a factory method for
// producing iterators. You can declare several methods if there
// are different kinds of iteration available in your program.

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
