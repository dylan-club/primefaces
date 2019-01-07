/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.component.datepicker;

import java.util.List;
import org.primefaces.component.api.InputHolder;
import org.primefaces.component.api.MixedClientBehaviorHolder;
import org.primefaces.component.api.UICalendar;
import org.primefaces.component.api.Widget;
import org.primefaces.util.ComponentUtils;

abstract class DatePickerBase extends UICalendar implements Widget, InputHolder, MixedClientBehaviorHolder {

    public static final String COMPONENT_FAMILY = "org.primefaces.component";

    public static final String DEFAULT_RENDERER = "org.primefaces.component.DatePickerRenderer";

    public enum PropertyKeys {

        placeholder,
        widgetVar,
        timeOnly,
        inline,
        buttonTabindex,
        showIcon,
        beforeShow,
        focusOnSelect,
        yearRange,
        selectionMode,
        showOtherMonths,
        selectOtherMonths,
        showOnFocus,
        shortYearCutoff,
        monthNavigator,
        yearNavigator,
        showTime,
        hourFormat,
        showSeconds,
        stepHour,
        stepMinute,
        stepSecond,
        showButtonBar,
        panelStyleClass,
        panelStyle,
        keepInvalid,
        hideOnDateTimeSelect,
        maxDateCount,
        numberOfMonths,
        view,
        touchUI,
        dateTemplate,
        appendTo,
        triggerButtonIcon,
        disabledDates,
        disabledDays
    }

    public DatePickerBase() {
        setRendererType(DEFAULT_RENDERER);
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getPlaceholder() {
        return (String) getStateHelper().eval(PropertyKeys.placeholder, null);
    }

    public void setPlaceholder(String placeholder) {
        getStateHelper().put(PropertyKeys.placeholder, placeholder);
    }

    public String getWidgetVar() {
        return (String) getStateHelper().eval(PropertyKeys.widgetVar, null);
    }

    public void setWidgetVar(String widgetVar) {
        getStateHelper().put(PropertyKeys.widgetVar, widgetVar);
    }

    public boolean isInline() {
        return (Boolean) getStateHelper().eval(PropertyKeys.inline, false);
    }

    public void setInline(boolean inline) {
        getStateHelper().put(PropertyKeys.inline, inline);
    }

    public String getButtonTabindex() {
        return (String) getStateHelper().eval(PropertyKeys.buttonTabindex, null);
    }

    public void setButtonTabindex(String buttonTabindex) {
        getStateHelper().put(PropertyKeys.buttonTabindex, buttonTabindex);
    }

    public boolean isShowIcon() {
        return (Boolean) getStateHelper().eval(PropertyKeys.showIcon, false);
    }

    public void setShowIcon(boolean showIcon) {
        getStateHelper().put(PropertyKeys.showIcon, showIcon);
    }

    public String getBeforeShow() {
        return (String) getStateHelper().eval(PropertyKeys.beforeShow, null);
    }

    public void setBeforeShow(String beforeShow) {
        getStateHelper().put(PropertyKeys.beforeShow, beforeShow);
    }

    public boolean isFocusOnSelect() {
        return (Boolean) getStateHelper().eval(PropertyKeys.focusOnSelect, false);
    }

    public void setFocusOnSelect(boolean focusOnSelect) {
        getStateHelper().put(PropertyKeys.focusOnSelect, focusOnSelect);
    }

    public String getYearRange() {
        return (String) getStateHelper().eval(PropertyKeys.yearRange, null);
    }

    public void setYearRange(String yearRange) {
        getStateHelper().put(PropertyKeys.yearRange, yearRange);
    }

    public String getSelectionMode() {
        return (String) getStateHelper().eval(PropertyKeys.selectionMode, "single");
    }

    public void setSelectionMode(String selectionMode) {
        getStateHelper().put(PropertyKeys.selectionMode, selectionMode);
    }

    public boolean isShowOtherMonths() {
        return (Boolean) getStateHelper().eval(PropertyKeys.showOtherMonths, false);
    }

    public void setShowOtherMonths(boolean showOtherMonths) {
        getStateHelper().put(PropertyKeys.showOtherMonths, showOtherMonths);
    }

    public boolean isSelectOtherMonths() {
        return (Boolean) getStateHelper().eval(PropertyKeys.selectOtherMonths, false);
    }

    public void setSelectOtherMonths(boolean selectOtherMonths) {
        getStateHelper().put(PropertyKeys.selectOtherMonths, selectOtherMonths);
    }

    public boolean isShowOnFocus() {
        return (Boolean) getStateHelper().eval(PropertyKeys.showOnFocus, true);
    }

    public void setShowOnFocus(boolean showOnFocus) {
        getStateHelper().put(PropertyKeys.showOnFocus, showOnFocus);
    }

    public String getShortYearCutoff() {
        return (String) getStateHelper().eval(PropertyKeys.shortYearCutoff, null);
    }

    public void setShortYearCutoff(String shortYearCutoff) {
        getStateHelper().put(PropertyKeys.shortYearCutoff, shortYearCutoff);
    }

    public boolean isMonthNavigator() {
        return (Boolean) getStateHelper().eval(PropertyKeys.monthNavigator, false);
    }

    public void setMonthNavigator(boolean monthNavigator) {
        getStateHelper().put(PropertyKeys.monthNavigator, monthNavigator);
    }

    public boolean isYearNavigator() {
        return (Boolean) getStateHelper().eval(PropertyKeys.yearNavigator, false);
    }

    public void setYearNavigator(boolean yearNavigator) {
        getStateHelper().put(PropertyKeys.yearNavigator, yearNavigator);
    }

    public boolean isShowTime() {
        return (Boolean) getStateHelper().eval(PropertyKeys.showTime, false);
    }

    public void setShowTime(boolean showTime) {
        getStateHelper().put(PropertyKeys.showTime, showTime);
    }

    public String getHourFormat() {
        return (String) getStateHelper().eval(PropertyKeys.hourFormat, null);
    }

    public void setHourFormat(String hourFormat) {
        getStateHelper().put(PropertyKeys.hourFormat, hourFormat);
    }

    public boolean isShowSeconds() {
        return (Boolean) getStateHelper().eval(PropertyKeys.showSeconds, false);
    }

    public void setShowSeconds(boolean showSeconds) {
        getStateHelper().put(PropertyKeys.showSeconds, showSeconds);
    }

    public int getStepHour() {
        return (Integer) getStateHelper().eval(PropertyKeys.stepHour, 1);
    }

    public void setStepHour(int stepHour) {
        getStateHelper().put(PropertyKeys.stepHour, stepHour);
    }

    public int getStepMinute() {
        return (Integer) getStateHelper().eval(PropertyKeys.stepMinute, 1);
    }

    public void setStepMinute(int stepMinute) {
        getStateHelper().put(PropertyKeys.stepMinute, stepMinute);
    }

    public int getStepSecond() {
        return (Integer) getStateHelper().eval(PropertyKeys.stepSecond, 1);
    }

    public void setStepSecond(int stepSecond) {
        getStateHelper().put(PropertyKeys.stepSecond, stepSecond);
    }

    public boolean isShowButtonBar() {
        return (Boolean) getStateHelper().eval(PropertyKeys.showButtonBar, false);
    }

    public void setShowButtonBar(boolean showButtonBar) {
        getStateHelper().put(PropertyKeys.showButtonBar, showButtonBar);
    }

    public String getPanelStyleClass() {
        return (String) getStateHelper().eval(PropertyKeys.panelStyleClass, null);
    }

    public void setPanelStyleClass(String panelStyleClass) {
        getStateHelper().put(PropertyKeys.panelStyleClass, panelStyleClass);
    }

    public String getPanelStyle() {
        return (String) getStateHelper().eval(PropertyKeys.panelStyle, null);
    }

    public void setPanelStyle(String panelStyle) {
        getStateHelper().put(PropertyKeys.panelStyle, panelStyle);
    }

    public boolean isKeepInvalid() {
        return (Boolean) getStateHelper().eval(PropertyKeys.keepInvalid, false);
    }

    public void setKeepInvalid(boolean keepInvalid) {
        getStateHelper().put(PropertyKeys.keepInvalid, keepInvalid);
    }

    public boolean isHideOnDateTimeSelect() {
        return (Boolean) getStateHelper().eval(PropertyKeys.hideOnDateTimeSelect, false);
    }

    public void setHideOnDateTimeSelect(boolean hideOnDateTimeSelect) {
        getStateHelper().put(PropertyKeys.hideOnDateTimeSelect, hideOnDateTimeSelect);
    }

    public int getMaxDateCount() {
        return (Integer) getStateHelper().eval(PropertyKeys.maxDateCount, Integer.MAX_VALUE);
    }

    public void setMaxDateCount(int maxDateCount) {
        getStateHelper().put(PropertyKeys.maxDateCount, maxDateCount);
    }

    public int getNumberOfMonths() {
        return (Integer) getStateHelper().eval(PropertyKeys.numberOfMonths, 1);
    }

    public void setNumberOfMonths(int numberOfMonths) {
        getStateHelper().put(PropertyKeys.numberOfMonths, numberOfMonths);
    }

    public String getView() {
        return (String) getStateHelper().eval(PropertyKeys.view, null);
    }

    public void setView(String view) {
        getStateHelper().put(PropertyKeys.view, view);
    }

    public boolean isTouchUI() {
        return (Boolean) getStateHelper().eval(PropertyKeys.touchUI, false);
    }

    public void setTouchUI(boolean touchUI) {
        getStateHelper().put(PropertyKeys.touchUI, touchUI);
    }

    public String getDateTemplate() {
        return (String) getStateHelper().eval(PropertyKeys.dateTemplate, null);
    }

    public void setDateTemplate(String dateTemplate) {
        getStateHelper().put(PropertyKeys.dateTemplate, dateTemplate);
    }

    public String getAppendTo() {
        return (String) getStateHelper().eval(PropertyKeys.appendTo, null);
    }

    public void setAppendTo(String appendTo) {
        getStateHelper().put(PropertyKeys.appendTo, appendTo);
    }

    public String getTriggerButtonIcon() {
        return (String) getStateHelper().eval(PropertyKeys.triggerButtonIcon, null);
    }

    public void setTriggerButtonIcon(String triggerButtonIcon) {
        getStateHelper().put(PropertyKeys.triggerButtonIcon, triggerButtonIcon);
    }

    public List getDisabledDates() {
        return (List) getStateHelper().eval(PropertyKeys.disabledDates, null);
    }

    public void setDisabledDates(List disabledDates) {
        getStateHelper().put(PropertyKeys.disabledDates, disabledDates);
    }

    public List getDisabledDays() {
        return (List) getStateHelper().eval(PropertyKeys.disabledDays, null);
    }

    public void setDisabledDays(List disabledDays) {
        getStateHelper().put(PropertyKeys.disabledDays, disabledDays);
    }

    @Override
    public String resolveWidgetVar() {
        return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
    }
}