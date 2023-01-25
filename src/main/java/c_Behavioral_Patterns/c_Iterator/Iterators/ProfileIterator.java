package c_Behavioral_Patterns.c_Iterator.Iterators;

import c_Behavioral_Patterns.c_Iterator.Profile.Profile;

// The common interface for all iterators.
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
