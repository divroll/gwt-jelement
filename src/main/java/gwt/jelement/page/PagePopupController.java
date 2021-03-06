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

import gwt.jelement.core.IsObject;
import gwt.jelement.dom.Document;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class PagePopupController implements IsObject {
    @JsMethod(name = "closePopup")
    public native void closePopup();
    
    @JsMethod(name = "formatMonth")
    public native String formatMonth(double year, double zeroBaseMonth);
    
    @JsMethod(name = "formatShortMonth")
    public native String formatShortMonth(double year, double zeroBaseMonth);
    
    @JsMethod(name = "formatWeek")
    public native String formatWeek(double year, double weekNumber, String localizedStartDate);
    
    @JsMethod(name = "localizeNumberString")
    public native String localizeNumberString(String numberString);
    
    @JsMethod(name = "selectFontsFromOwnerDocument")
    public native void selectFontsFromOwnerDocument(Document targetDocument);
    
    @JsMethod(name = "setValue")
    public native void setValue(String value);
    
    @JsMethod(name = "setValueAndClosePopup")
    public native void setValueAndClosePopup(double numberValue, String stringValue);
    
    @JsMethod(name = "setWindowRect")
    public native void setWindowRect(double x, double y, double width, double height);
    
}
