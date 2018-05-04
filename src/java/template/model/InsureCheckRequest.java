package template.model;

/**
 * Created by jiajun on 2016/10/12.
 */
public class InsureCheckRequest extends InsureRequestBase {

    /**
     * 投保人类型
     */
    private Integer insureHolderType;
    /**
     * 被保人类型
     */
    private Integer insuredType;
    /**
     * 投保人信息 个人
     */
    private InsureReqApplicant applicantInfo;

    public Integer getInsureHolderType() {
        return insureHolderType;
    }

    public void setInsureHolderType(Integer insureHolderType) {
        this.insureHolderType = insureHolderType;
    }

    public Integer getInsuredType() {
        return insuredType;
    }

    public void setInsuredType(Integer insuredType) {
        this.insuredType = insuredType;
    }

    public InsureReqApplicant getApplicantInfo() {
        return applicantInfo;
    }

    public void setApplicantInfo(InsureReqApplicant applicantInfo) {
        this.applicantInfo = applicantInfo;
    }
}
