package template.widget;

import template.model.InsureCheckRequest;

/**
 * Created by jiajun on 2018/5/4.
 */
public class StartWidget extends AbstractParamDecoratorWidget {


    public StartWidget() {

    }

    @Override
    public InsureCheckRequest decoratorInsureParams() {
        this.insureParamDecorator = new InsureCheckParamDecorator();
        return insureParamDecorator.getInsureCheckRequest();
    }
}
