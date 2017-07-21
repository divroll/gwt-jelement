/*
 * Copyright 2017 Abed Tony BenBrahim <tony.benrahim@10xdev.com>
 *     and Gwt-JElement project contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwt.jelement.page;

import gwt.jelement.dom.Document;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PagePopupController{
    
    @JsMethod(name = "closePopup")
    public native void closePopup();
    
    @JsMethod(name = "formatMonth")
    public native String formatMonth(long year, long zeroBaseMonth);
    
    @JsMethod(name = "formatShortMonth")
    public native String formatShortMonth(long year, long zeroBaseMonth);
    
    @JsMethod(name = "formatWeek")
    public native String formatWeek(long year, long weekNumber, String localizedStartDate);
    
    @JsMethod(name = "localizeNumberString")
    public native String localizeNumberString(String numberString);
    
    @JsMethod(name = "selectFontsFromOwnerDocument")
    public native void selectFontsFromOwnerDocument(Document targetDocument);
    
    @JsMethod(name = "setValue")
    public native void setValue(String value);
    
    @JsMethod(name = "setValueAndClosePopup")
    public native void setValueAndClosePopup(long numberValue, String stringValue);
    
    @JsMethod(name = "setWindowRect")
    public native void setWindowRect(long x, long y, long width, long height);
    
}