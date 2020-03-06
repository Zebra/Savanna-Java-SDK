package com.zebra.savanna.Models.Errors;

import java.net.URL;

/**
 * StringError --- Thrown when a Savanna API call does not succeed.
 * 
 * @author SLippert@zebra.com
 * 
 */
public class StringError extends Error {
	private static final long serialVersionUID = -2870533593873495653L;
	private String developerMessage;
	private String code;
	private String errorDetail;
	private URL info;

	/**
	 * Initializes a new instance of the Error class.
	 */
	public StringError() {
	}

	/**
	 * Initializes a new instance of the StringError class with a specified error
	 * message.
	 * 
	 * @param message The message that describes the error.
	 */
	public StringError(String message) {
		super(message);
	}

	/**
	 * Initializes a new instance of the StringError class with a specified error
	 * message and a reference to the inner exception that is the cause of this
	 * exception.
	 * 
	 * @param cause The exception that is the cause of the current exception, or a
	 *              null reference if no inner exception is specified.
	 */
	public StringError(Throwable cause) {
		super(cause);
	}

	/**
	 * @return Information about the result of the API call.
	 */
	public String getDeveloperMessage() {
		return developerMessage;
	}

	/**
	 * @param developerMessage Information about the result of the API call.
	 */
	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	/**
	 * @return The formatted error message.
	 */
	@Override
	public String getMessageFormatted() {
		String detail = getErrorDetail();
		if (detail == null) {
			detail = developerMessage;
		}
		String message = getMessage();
		return detail == null || detail == message ? message : message + ": " + detail;
	}

	/**
	 * @return The status code returned by the API.
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code The status code returned by the API.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return Link to a web page providing more information about result of the API
	 *         call.
	 */
	public URL getInfo() {
		return info;
	}

	/**
	 * @param info Link to a web page providing more information about result of the
	 *             API call.
	 */
	public void setInfo(URL info) {
		this.info = info;
	}

	/**
	 * @return Details about the error encountered while making the API call.
	 */
	public String getErrorDetail() {
		return errorDetail;
	}

	/**
	 * @param errorDetail Details about the error encountered while making the API
	 *                    call.
	 */
	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
}