package data;

import java.util.List;

/**
 * The Class Layout.
 * @author vsun
 */

public class Layout {

    /** The total seats. */
    private int totalSeats;
    
    /** The usable seats. */
    private int usableSeats;
    
    /** The sections. */
    private List<Section> sections;

    /**
     * Gets the total capacity.
     *
     * @return the total capacity
     */
    public int getTotalCapacity() {
        return totalSeats;
    }

    /**
     * Sets the total capacity.
     *
     * @param totalCapacity the new total capacity
     */
    public void setTotalCapacity(int totalCapacity) {
        this.totalSeats = totalCapacity;
    }

    /**
     * Gets the available seats.
     *
     * @return the available seats
     */
    public int getAvailableSeats() {
        return usableSeats;
    }

    /**
     * Sets the available seats.
     *
     * @param availableSeats the new available seats
     */
    public void setAvailableSeats(int availableSeats) {
        this.usableSeats = availableSeats;
    }

    /**
     * Gets the sections.
     *
     * @return the sections
     */
    public List<Section> getSections() {
        return sections;
    }

    /**
     * Sets the sections.
     *
     * @param sections the new sections
     */
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
    
}
