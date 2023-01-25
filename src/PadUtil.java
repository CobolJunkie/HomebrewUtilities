/** This class contains various utilities to extend the length of a given String by padding it with specified Characters
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.3
 **/
public class PadUtil {

    /** This method pads a string up to the length specified with zeroes added on the left.
     *
     * @param inputString               The String to be processed and padded.
     * @param length                    The desired length of the output String.
     * @return                          returns the padded String.
     * @throws IllegalArgumentException if parameter length is negative.
     * @since 0.1
     **/
    public static String padLeft(String inputString, int length) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder(inputString);
        if (length <= 0){
            throw new IllegalArgumentException("Negative values are not permitted for parameter length");
        }
        for (int i = 0; i < length; i++) {
            sb.insert(0,'0');
        }
        return sb.toString();
    }
    /** This method pads a string up to the length specified with a specified character added on the left.
     *
     * @param inputString               The String to be processed and padded.
     * @param length                    The desired length of the output String.
     * @param padChar                   The char to pad the String with.
     * @return                          returns the padded String.
     * @throws IllegalArgumentException if parameter length is negative.
     * @since 0.1
     **/
    public static String padLeft(String inputString,int length,char padChar) throws IllegalArgumentException{
        StringBuilder sb = new StringBuilder(inputString);
        if (length <= 0){
            throw new IllegalArgumentException("Negative values are not permitted for parameter length");
        }
        for (int i = 0; i < length; i++) {
            sb.insert(0,padChar);
        }
        return sb.toString();
    }
    /** This method pads a string up to the length specified with zeroes added on the right.
     *
     * @param inputString               The String to be processed and padded.
     * @param length                    The desired length of the output String.
     * @return                          returns the padded String.
     * @throws IllegalArgumentException if parameter length is negative.
     * @since 0.1
     **/
    public static String padRight(String inputString,int length)throws IllegalArgumentException{
        StringBuilder sb = new StringBuilder(inputString);
        if (length <= 0){
            throw new IllegalArgumentException("Negative values are not permitted for parameter length");
        }
        sb.append("0".repeat(length));
        return sb.toString();
    }
    /** This method pads a string up to the length specified with a specified character added on the right.
     *
     * @param inputString               The String to be processed and padded.
     * @param length                    The desired length of the output String.
     * @param padChar                   The char to pad the String with.
     * @return                          returns the padded String.
     * @throws IllegalArgumentException if parameter length is negative.
     * @since 0.1
     **/
    public static String padRight(String inputString,int length,char padChar)throws IllegalArgumentException{
        StringBuilder sb = new StringBuilder(inputString);
        if (length <= 0){
            throw new IllegalArgumentException("Negative values are not permitted for parameter length");
        }
        sb.append(String.valueOf(padChar).repeat(length));
        return  sb.toString();
    }
    /** This method pads a string up to the length specified with a specified character added at the specified index.
     *
     * @param inputString               The String to be processed and padded.
     * @param length                    The desired length of the output String.
     * @param index                     The index of the location to pad the String.
     * @return                          returns the padded String.
     * @throws IllegalArgumentException if parameter length is negative.
     * @throws StringIndexOutOfBoundsException if parameter index is negative.
     * @since 0.2
     **/
    public static String padInsert(String inputString,int length,int index)throws IllegalArgumentException{
        StringBuilder sb = new StringBuilder(inputString);
        if (length <= 0){
            throw new IllegalArgumentException("Negative values are not permitted for parameter length");
        }
        for (int i = 0; i < length; i++) {
            sb.insert(index,'0');
        }
        return  sb.toString();
    }
    /** This method pads a string up to the length specified with a specified character added at the specified index.
     *
     * @param inputString               The String to be processed and padded.
     * @param length                    The desired length of the output String.
     * @param index                     The index of the location to pad the String.
     * @param padChar                   The char to pad the string with.
     * @return                          returns the padded String.
     * @throws IllegalArgumentException if parameter length is negative.
     * @throws StringIndexOutOfBoundsException if parameter index is negative.
     * @since 0.2
     **/
    public static String padInsert(String inputString,int length,int index,char padChar)throws IllegalArgumentException,StringIndexOutOfBoundsException{
        StringBuilder sb = new StringBuilder(inputString);
        if (length <= 0){
            throw new IllegalArgumentException("Negative values are not permitted for parameter length");
        }
        for (int i = 0; i < length; i++) {
            sb.insert(index,padChar);
        }
        return  sb.toString();
    }

}
