package vendingMachineDesign;

/**
 *
 */
enum PaymentTypeEnum {
    CREDIT_CARD("00", "credit card"),
    CASH("01", "cash"),
    MOCK_CREDIT_CARD("02", "mock credit card");

    private final String code;
    private final String description;

    private PaymentTypeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

}
