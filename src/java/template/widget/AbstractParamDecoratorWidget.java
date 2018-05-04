package template.widget;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import template.model.InsureCheckRequest;

/**
 * Created by jiajun on 2018/5/4.
 */
public abstract class AbstractParamDecoratorWidget extends AbstractInputWidget implements InsureParamDecorator {

    InsureCheckParamDecorator insureParamDecorator;

    AbstractParamDecoratorWidget paramDecoratorWidget;

    public void initCheckParamDecoratorChain(AbstractParamDecoratorWidget checkParamDecoratorWidget) {
        this.paramDecoratorWidget = checkParamDecoratorWidget;
    }

    @Override
    public InsureCheckRequest decoratorInsureParams() {
        throw new NotImplementedException();
    }
}
