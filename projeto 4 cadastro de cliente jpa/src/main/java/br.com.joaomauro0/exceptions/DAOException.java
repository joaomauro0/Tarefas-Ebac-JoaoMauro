/**
 * 
 */
package br.com.joaomauro0.exceptions;

/**
 * @author joaomauro0
 *
 */
public class DAOException extends Exception {

	private static final long serialVersionUID = 7054379063290825137L;

	public DAOException(String msg, Exception ex) {
		super(msg, ex);
    }
}