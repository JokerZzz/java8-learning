import com.alibaba.fastjson.JSON;
import template.model.InsureCheckRequest;
import template.widget.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jiajun on 2018/5/3.
 */
public class TestEntrance {


    public static void main(String[] args) {

        List<AbstractParamDecoratorWidget> widgetList = new ArrayList<>();
        widgetList.add(new ApplicantNameWidget("test"));
        widgetList.add(new ApplicantIdValidDateWidget(new Date(), new Date()));
        widgetList.add(new ApplicantIdWidget("330124199010121919", 1));


        //获取渲染参数
        List<WidgetConfig> widgetConfigs = new ArrayList<>();
        for (AbstractParamDecoratorWidget abstractParamDecoratorWidget : widgetList) {
            WidgetConfig config = abstractParamDecoratorWidget.generateWidgetConfig();
            widgetConfigs.add(config);
        }
        System.out.println(JSON.toJSONString(widgetConfigs));


        //转换投保参数


        List<AbstractParamDecoratorWidget> applicantWidgets = widgetList.stream().filter(w -> "applicant".equals(w.getWidgetGroupKey())).collect(Collectors.toList());

        for (int i = 0; i < applicantWidgets.size(); i++) {
            if (i == 0) {
                applicantWidgets.get(0).initCheckParamDecoratorChain(new StartWidget());
            } else {
                applicantWidgets.get(i).initCheckParamDecoratorChain(applicantWidgets.get(i - 1));
            }
        }

        AbstractParamDecoratorWidget executeWidget = applicantWidgets.stream().skip(applicantWidgets.size() - 1).findFirst().orElseThrow(NullPointerException::new);
        InsureCheckRequest request = executeWidget.decoratorInsureParams();


//        ApplicantNameWidget applicantNameWidget = new ApplicantNameWidget("test");
//        ApplicantIdValidDateWidget applicantIdValidDateWidget = new ApplicantIdValidDateWidget(new Date(), new Date());
//
//        applicantNameWidget.initCheckParamDecoratorChain(new StartWidget());
//        applicantIdValidDateWidget.initCheckParamDecoratorChain(applicantNameWidget);
//
//        InsureCheckRequest request = applicantIdValidDateWidget.decoratorInsureParams();

        System.out.println(JSON.toJSONString(request));


    }


}
