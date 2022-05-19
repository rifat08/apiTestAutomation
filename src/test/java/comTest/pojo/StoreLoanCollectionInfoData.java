package comTest.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StoreLoanCollectionInfoData {
    @JsonProperty("utilityref")
    private String utilityref;

    @JsonProperty("msisdn")
    private String msisdn;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("transid")
    private String transid;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("operator")
    private String operator;

    /**
     * No args constructor for use in serialization
     */
    public StoreLoanCollectionInfoData() {
    }

    /**
     * @param utilityref
     * @param reference
     * @param amount
     * @param transid
     * @param msisdn
     * @param operator
     */
    public StoreLoanCollectionInfoData(String utilityref, String msisdn, String amount, String transid, String reference, String operator) {
        super();
        this.utilityref = utilityref;
        this.msisdn = msisdn;
        this.amount = amount;
        this.transid = transid;
        this.reference = reference;
        this.operator = operator;
    }

    public String getUtilityref() {
        return utilityref;
    }

    public void setUtilityref(String utilityref) {
        this.utilityref = utilityref;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}

