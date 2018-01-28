package data;

/**
 * The Class Request.
 * @author vsun
 */
public class Request {

    /** The person name. */
    private String personName;
    
    /** The non tickets. */
    private int nonTickets;
    
    /** The is ok. */
    private boolean isOk;
    
    /** The row number. */
    private int rowNumber;
    
    /** The section number. */
    private int sectionNumber;

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return personName;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.personName = name;
    }

    /**
     * Gets the no of tickets.
     *
     * @return the no of tickets
     */
    public int getNoOfTickets() {
        return nonTickets;
    }

    /**
     * Sets the no of tickets.
     *
     * @param noOfTickets the new no of tickets
     */
    public void setNoOfTickets(int noOfTickets) {
        this.nonTickets = noOfTickets;
    }

    /**
     * Checks if is completed.
     *
     * @return true, if is completed
     */
    public boolean isCompleted() {
        return isOk;
    }

    /**
     * Sets the completed.
     *
     * @param isCompleted the new completed
     */
    public void setCompleted(boolean isCompleted) {
        this.isOk = isCompleted;
    }
    
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
     * Gets the status.
     *
     * @return the status
     */
    public String getStatus(){
        
        String status = null;
        
        if(isOk){
            
            status = personName + " " + "Row " + rowNumber + " " + "Section " + sectionNumber;
            
        }else{
            
            if(rowNumber == -1 && sectionNumber == -1){
                
                status = personName + " " + "Call to split party.";
                
            }else{
                
                status = personName + " " + "Sorry, we can't handle your party.";
                
            }
            
        }
        
        return status;
    }

}
