package template.widget;

import template.model.InsureCheckRequest;
import template.model.InsureReqApplicant;

import java.util.Date;

/**
 * Created by jiajun on 2018/5/4.
 */
public class ApplicantIdValidDateWidget extends AbstractApplicantWidget {

    private Date validDateStartTime;
    private Date validDateEndTime;

    public ApplicantIdValidDateWidget(Date validDateStartTime, Date validDateEndTime) {
        this.validDateStartTime = validDateStartTime;
        this.validDateEndTime = validDateEndTime;
    }

    public Date getValidDateStartTime() {
        return validDateStartTime;
    }

    public void setValidDateStartTime(Date validDateStartTime) {
        this.validDateStartTime = validDateStartTime;
    }

    public Date getValidDateEndTime() {
        return validDateEndTime;
    }

    public void setValidDateEndTime(Date validDateEndTime) {
        this.validDateEndTime = validDateEndTime;
    }

    @Override
    public InsureCheckRequest decoratorInsureParams() {

        InsureCheckRequest checkRequest = paramDecoratorWidget.decoratorInsureParams();
        System.out.println("ApplicantIdValidDateWidget decorate");
        if (checkRequest.getApplicantInfo() == null) {
            checkRequest.setApplicantInfo(new InsureReqApplicant());
        }
        checkRequest.getApplicantInfo().setApplicantIdVaildStartDate(validDateStartTime.getTime());
        checkRequest.getApplicantInfo().setApplicantIdVaildEndDate(validDateEndTime.getTime());
        return checkRequest;
    }
}
