package vendingMachineDesign;

/**
 *
 */
public class PayResponse {

    private String status;
    private String errorMsg;

    PayResponse() {
    }

    PayResponse(String status, String errorMsg) {
        this.status = status;
        this.errorMsg = errorMsg;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * @param errorMsg the errorMsg to set
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
