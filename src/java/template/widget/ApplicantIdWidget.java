package template.widget;

import template.model.InsureCheckRequest;
import template.model.InsureReqApplicant;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jiajun on 2018/5/4.
 */
public class ApplicantIdWidget extends AbstractApplicantWidget {

    private List<Integer> optionalValuesIdType;

    private String inputIdNo;
    private Integer inputIdType;

    public ApplicantIdWidget(String idNo, Integer idType) {
        this.inputIdNo = idNo;
        this.inputIdType = idType;
    }

    public List<Integer> getOptionalValuesIdType() {
        return optionalValuesIdType;
    }

    public void setOptionalValuesIdType(List<Integer> optionalValuesIdType) {
        this.optionalValuesIdType = optionalValuesIdType;
    }

    public String getInputIdNo() {
        return inputIdNo;
    }

    public void setInputIdNo(String inputIdNo) {
        this.inputIdNo = inputIdNo;
    }

    public void setInputIdType(Integer inputIdType) {
        this.inputIdType = inputIdType;
    }

    @Override
    public WidgetConfig<Integer, String> generateWidgetConfig() {

        WidgetConfig<Integer, String> widgetConfig = new WidgetConfig<>();
        super.generateBase(widgetConfig);
        widgetConfig.setWidgetOptionValues(Arrays.asList(1, 2, 3));
        widgetConfig.setWidgetOptionDescValues(Arrays.asList("身份证", "护照", "驾驶证"));
        return widgetConfig;
    }

    @Override
    public InsureCheckRequest decoratorInsureParams() {
        InsureCheckRequest checkRequest = paramDecoratorWidget.decoratorInsureParams();
        System.out.println("ApplicantIdWidget decorate");
        if (checkRequest.getApplicantInfo() == null) {
            checkRequest.setApplicantInfo(new InsureReqApplicant());
        }
        checkRequest.getApplicantInfo().setApplicantIdNo(this.inputIdNo);
        checkRequest.getApplicantInfo().setApplicantIdType(this.inputIdType);
        return checkRequest;
    }
}
