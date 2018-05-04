package template.widget;

import template.model.InsureCheckRequest;
import template.model.InsureReqApplicant;

/**
 * Created by jiajun on 2018/5/4.
 */
public class ApplicantNameWidget extends AbstractApplicantWidget {


    public ApplicantNameWidget(String applicantName) {
        this.applicantName = applicantName;
    }

    private String applicantName;

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    @Override
    public InsureCheckRequest decoratorInsureParams() {

        InsureCheckRequest checkRequest = paramDecoratorWidget.decoratorInsureParams();
        System.out.println("ApplicantNameWidget decorate");
        if (checkRequest.getApplicantInfo() == null) {
            checkRequest.setApplicantInfo(new InsureReqApplicant());
        }
        checkRequest.getApplicantInfo().setApplicantName(this.applicantName);
        return checkRequest;
    }


}
