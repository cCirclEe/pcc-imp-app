package de.pcc.privacycrashcam.data.serverconnection;

/**
 * Authentication state enum to determine if a server request for authenticating a user was
 * successful.
 *
 * @author Giorgio Gross
 */
public enum AuthenticationState {

    /**
     * The authentication was successful
     */
    SUCCESS,

    /**
     * Network not reachable
     */
    FAILURE_NETWORK,

    /**
     * Account does not exist or mail and password do not match
     */
    FAILURE_MISMATCH,

    /**
     * Account does not exist or mail and password do not match
     */
    FAILURE_MISSING,

    /**
     * Account is not verified
     */
    NOT_VERIFIED,

    /**
     * Something unexpected went wrong
     */
    FAILURE_OTHER
}
