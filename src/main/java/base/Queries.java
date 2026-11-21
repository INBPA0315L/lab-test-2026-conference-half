package base;

import lombok.NonNull;

import java.util.List;
import java.util.Map;

/**
 * Defines queries for your {@link Repository} implementation.
 *
 * @param <T> the type of your top-level class
 * @param <U> the type of your static nested class
 * @param <V> the type of your enumerated class
 */
public interface Queries<T, U, V extends Enum<V>> {

    /**
     * Returns the sum of the age of the attendees (counting each occurrence) that have the given e-mail address.
     *
     * @param email the e-mail address of the attendee
     * @return the result
     */
    int query1(
            @NonNull String email);

    /**
     * Returns the sorted copy of the talks using the {@link Comparable} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the speaker of the <i>talk</i> (descending)
     *     <li> the duration in minutes of the <i>talk</i> (descending)
     *     <li> the title of the <i>talk</i> (descending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>This task includes the implementation of the {@link Comparable} interface in your model class due to its nature.
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query2();

    /**
     * Returns the sorted copy of the talks using the {@link java.util.Comparator} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the speaker of the <i>talk</i> (ascending)
     *     <li> the average rating of the <i>talk</i> (ascending)
     *     <li> the title of the <i>talk</i> (descending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>The {@link java.util.Comparator} interface must be implemented as a public top-level class in its own source file.
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query3();

    /**
     * Returns the first talk that has the given title.
     * Returns <code>null</code> if no <i>talk</i> matches the condition.
     *
     * @param title the title of the talk
     * @return the result
     */
    T query4(
            @NonNull String title);

    /**
     * Returns all the talks that have the given track but do not contain the given attendee.
     *
     * @param track the track
     * @param attendee the attendee
     * @return the result
     */
    List<T> query5(
            @NonNull V track,
            @NonNull U attendee);

    /**
     * Returns a dictionary that maps each track to the first corresponding talk.
     * The tracks without talks are not included.
     *
     * @return the result
     */
    Map<V, T> query6();
}
