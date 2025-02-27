package melody.audio;

/**
 * ITSC 2214 ArrayCircularQueue
 * Instructor-provided code.  You should not modify this file!
 * Represents a musical pitch. R represents a rest, no pitch.
 */
public enum Pitch {
    A, B, C, D, E, F, G, R;
    /**
     * Returns the Pitch that is equivalent to the given string,
     * such as Pitch.D for "D", or null if the string does not
     * match any Pitch value.
     */
    public static Pitch getValueOf(String s) {
        s = s.intern();
        if (s == "A") {
            return Pitch.A;
        }
        if (s == "B") {
            return Pitch.B;
        }
        if (s == "C") {
            return Pitch.C;
        }
        if (s == "D") {
            return Pitch.D;
        }
        if (s == "E") {
            return Pitch.E;
        }
        if (s == "F") {
            return Pitch.F;
        }
        if (s == "G") {
            return Pitch.G;
        }
        if (s == "R") {
            return Pitch.R;
        }
        return null;
    }
}