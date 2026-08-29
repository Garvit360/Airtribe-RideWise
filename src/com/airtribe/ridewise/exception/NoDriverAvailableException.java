package com.airtribe.ridewise.exception;

public class NoDriverAvailableException extends RuntimeException {

    public NoDriverAvailableException(String message) {
        super(message);
    }

    public NoDriverAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoDriverAvailableException(com.airtribe.ridewise.model.Location riderLocation, int driversChecked) {
        super(String.format("No drivers available at location %s (checked %d drivers)",
                riderLocation.toString(), driversChecked));
    }
}
