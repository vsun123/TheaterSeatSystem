package data;

/**
 * The Class Section.
 * @author vsun
 */

public class Section implements Comparable<Section>{

    /** The row number. */
    private int rowNumber;
    
    /** The section number. */
    private int sectionNumber;
    
    /** The seats. */
    private int seats;
    
    /** The available seats. */
    private int availableSeats;

    /**
     * Gets the row number.
     *
     * @return the row number
     */
    public int getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the row number.
     *
     * @param rowNumber the new row number
     */
    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
     * Gets the section number.
     *
     * @return the section number
     */
    public int getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Sets the section number.
     *
     * @param sectionNumber the new section number
     */
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    /**
     * Gets the capacity.
     *
     * @return the capacity
     */
    public int getCapacity() {
        return seats;
    }

    /**
     * Sets the capacity.
     *
     * @param capacity the new capacity
     */
    public void setCapacity(int capacity) {
        this.seats = capacity;
    }

    /**
     * Gets the available seats.
     *
     * @return the available seats
     */
    public int getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Sets the available seats.
     *
     * @param availableSeats the new available seats
     */
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Section o) {
        
        int result = 0;
        
        if((this.availableSeats - o.availableSeats) == 0){
            
            if((this.rowNumber - o.rowNumber) == 0){
                
                result = this.sectionNumber - o.sectionNumber;
                
            }else{
                
                result = this.rowNumber - o.rowNumber;
                
            }
            
        }else{
            
            result = this.availableSeats - o.availableSeats;
            
        }
        
        return result;
        
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        return "Row #: " + rowNumber + " " + "Section #: " + sectionNumber + " Capacity: " + seats + " availableSeats: " + availableSeats;

    }

}
