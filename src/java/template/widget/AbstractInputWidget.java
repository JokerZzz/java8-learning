package template.widget;

/**
 * Created by jiajun on 2018/5/4.
 */
public abstract class AbstractInputWidget implements WidgetConfigGenerator {

    private String widgetKey;
    private String widgetName;
    private String widgetDisplayName;
    private String widgetGroupKey;
    private Boolean widgetVisibility;
    private Integer widgetDisplayType;

    public String getWidgetKey() {
        return widgetKey;
    }

    public void setWidgetKey(String widgetKey) {
        this.widgetKey = widgetKey;
    }

    public String getWidgetName() {
        return widgetName;
    }

    public void setWidgetName(String widgetName) {
        this.widgetName = widgetName;
    }

    public String getWidgetGroupKey() {
        return widgetGroupKey;
    }

    public void setWidgetGroupKey(String widgetGroupKey) {
        this.widgetGroupKey = widgetGroupKey;
    }

    public Boolean getWidgetVisibility() {
        return widgetVisibility;
    }

    public void setWidgetVisibility(Boolean widgetVisibility) {
        this.widgetVisibility = widgetVisibility;
    }

    public Integer getWidgetDisplayType() {
        return widgetDisplayType;
    }

    public void setWidgetDisplayType(Integer widgetDisplayType) {
        this.widgetDisplayType = widgetDisplayType;
    }

    public String getWidgetDisplayName() {
        return widgetDisplayName;
    }

    public void setWidgetDisplayName(String widgetDisplayName) {
        this.widgetDisplayName = widgetDisplayName;
    }

    public final void generateBase(WidgetConfig widgetConfig) {
        widgetConfig.setWidgetKey(this.widgetKey);
        widgetConfig.setWidgetName(this.widgetName);
        widgetConfig.setWidgetDisplayName(this.widgetDisplayName);
        widgetConfig.setWidgetDisplayType(this.widgetDisplayType);
        widgetConfig.setWidgetGroupKey(this.widgetGroupKey);
    }

    @Override
    public WidgetConfig generateWidgetConfig() {
        WidgetConfig widgetConfig = new WidgetConfig();
        this.generateBase(widgetConfig);
        return widgetConfig;
    }
}
