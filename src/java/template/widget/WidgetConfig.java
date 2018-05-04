package template.widget;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiajun on 2018/5/4.
 */
public class WidgetConfig<T, S> {

    private String widgetKey;
    private String widgetName;
    private String widgetDisplayName;
    private String widgetGroupKey;
    private Boolean widgetVisibility;
    private Integer widgetDisplayType;
    private List<T> widgetOptionValues;
    private List<S> widgetOptionDescValues;

    public WidgetConfig() {
        widgetOptionValues = new ArrayList<>();
        widgetOptionDescValues = new ArrayList<>();
    }

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

    public List<T> getWidgetOptionValues() {
        return widgetOptionValues;
    }

    public void setWidgetOptionValues(List<T> widgetOptionValues) {
        this.widgetOptionValues = widgetOptionValues;
    }

    public List<S> getWidgetOptionDescValues() {
        return widgetOptionDescValues;
    }

    public void setWidgetOptionDescValues(List<S> widgetOptionDescValues) {
        this.widgetOptionDescValues = widgetOptionDescValues;
    }

    public String getWidgetDisplayName() {
        return widgetDisplayName;
    }

    public void setWidgetDisplayName(String widgetDisplayName) {
        this.widgetDisplayName = widgetDisplayName;
    }
}
