PostalCodeException Class


package postalcode;

public class PostalCodeException extends Exception
{
  //Constructors ******************************************************

  /**
   * Default constructor.  Does not provide details.
   */
  public PostalCodeException() {}

  /**
   * Constructor that provides more details as to what caused the
   * exception to be thrown.
   *
   * @param message The message giving details about the cause of
   *                the exception.
   */
  public PostalCodeException(String message)
  {
    super(message);
  }
}
