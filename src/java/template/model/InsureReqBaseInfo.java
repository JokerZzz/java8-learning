package template.model;


/**
 * Created by jiajun on 2016/10/12.
 */
public class InsureReqBaseInfo {

    /**
     * 操作代码
     */
    private Integer operationCode;

    private String prodCode;

    private Integer planCode;

    private Long sendTime;

    private String partnerCode;

    private String transId;

    public InsureReqBaseInfo(){}

    public InsureReqBaseInfo(String prodCode, String partnerCode, Integer operationCode, Integer planCode, String transId) {
        this.operationCode = operationCode;
        this.partnerCode = partnerCode;
        this.prodCode = prodCode;
        this.transId = transId;
        this.planCode = planCode;
        this.sendTime = System.currentTimeMillis();
    }

    public InsureReqBaseInfo(String prodCode, String partnerCode, Integer operationCode, String transId) {
        this.operationCode = operationCode;
        this.partnerCode = partnerCode;
        this.prodCode = prodCode;
        this.transId = transId;
        this.planCode = 1;
        this.sendTime = System.currentTimeMillis();
    }
    public Integer getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(Integer operationCode) {
        this.operationCode = operationCode;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public Integer getPlanCode() {
        return planCode;
    }

    public void setPlanCode(Integer planCode) {
        this.planCode = planCode;
    }

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }
}
