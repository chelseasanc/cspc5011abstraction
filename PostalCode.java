package postalcode;

/**
* This class is the superclass which defines the basics of any
* postal code. Some methods are abstract and must be
* overriden.
*/
public abstract class PostalCode{

  // INSTANCE VARIABLES ************************************************
  private String code;  //The postal code to be analysed.

  //Three variables set during validation

  private boolean hasBeenValidated = false; // Whether the code has been validated.

  private boolean isValid = true; //Once validated, whether the code is valid or not.

  private String destination = "that cannot be determined."; //The destination location of the postal code.

  // CONSTRUCTOR *******************************************************
  /**
  * Constructs a postal code object using information passed by
  * the subclass constructors.
  *
  * @param code The postal code to be analysed.
  */
  public PostalCode(String code) throws PostalCodeException  {
    this.code = code;
    this.isValid = isValid();
  }

  // INSTANCE METHODS **************************************************
  /**
  * General information about this object.
  *
  * @return A string representation of a postal code object.
  */
  public String toString()  {
      return code + " is a" + ((isValid) ? (" valid " + getCountry()) : "n invalid")+" postal code with a destination "+ destination;
    }

  // ACCESSOR METHODS ***************************************************
  /**
  * Retrieves the postal code.
  *
  * @return A String containing the postal code.
  */

  public String getCode()  {
      return code;
  }
  /**
  * Retrieves the postal code's destination.
  *
  * @return A String containing the postal code's destination.
  */

  public String getDestination()  {
    return destination;
  }

  /**
  * Sets the postal code's destination.
  *
  * @param destination The postal code's destination.
  */
  public void setDestination(String destination)  {
    this.destination = destination;
  }

  /**
  * Verifies if the postal is valid.  If it has not
  * been validated, it calls the validation method.
  *
  * @return TRUE if the code is valid, FALSE if it is not.
  * @throws PostalCodeException If the code is found to be invalid
  *         during the call to the validation method.
  */
  public boolean isValid() throws PostalCodeException  {
      if(!hasBeenValidated) {
        hasBeenValidated = true;
        validate();  //Validate the code if not done before.
      }
      return isValid;
  }

  // UTILITY METHOD FOR SUBCLASSES **************************************
  /**
  * This method will cause an exception to be thrown.  Called when
  * a postal code is found to be invalid.
  *
  * @param message The detailed message about the cause of the
  *        exception.
  * @throws PostalCodeException If the code is found to be invalid.
  */
  void throwException(String message)    throws PostalCodeException  {
      isValid = false;
      PostalCodeException e = new PostalCodeException("Exception: " + message);
      throw e;
  }

  // METHODS DESIGNED TO BE OVERRIDDEN BY CONCRETE SUBCLASSES ***********
  /**
  * This method is used to verify the validity of a postal code.
  *
  * @throws PostalCodeException If the code is found to be invalid.
  */

  protected abstract void validate() throws PostalCodeException;

  /**
  * This method returns the country of origin of the postal code.
  *
  * @return A String containing the country of origin of the code.
  */
  public abstract String getCountry();
}


