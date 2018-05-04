package template.widget;

import template.model.InsureCheckRequest;
import template.model.InsureRequestBase;

/**
 * Created by jiajun on 2018/5/4.
 */
public class InsureCheckParamDecorator implements InsureParamDecorator {


    private InsureCheckRequest insureCheckRequest;

    public InsureCheckParamDecorator() {
        this.insureCheckRequest = new InsureCheckRequest();
    }


    public InsureCheckRequest getInsureCheckRequest() {
        return insureCheckRequest;
    }

    public void setInsureCheckRequest(InsureCheckRequest insureCheckRequest) {
        this.insureCheckRequest = insureCheckRequest;
    }

    @Override
    public InsureRequestBase decoratorInsureParams() {
        return null;
    }
}
