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
package gwt.jelement.svg;

import gwt.jelement.svg.SVGAnimatedEnumeration;
import gwt.jelement.svg.SVGAnimatedLength;
import gwt.jelement.svg.SVGGraphicsElement;
import gwt.jelement.svg.SVGPoint;
import gwt.jelement.svg.SVGRect;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGTextContentElement extends SVGGraphicsElement{
    public static final int LENGTHADJUST_UNKNOWN = 0;
    public static final int LENGTHADJUST_SPACING = 1;
    public static final int LENGTHADJUST_SPACINGANDGLYPHS = 2;
    
    
    @JsConstructor
    public SVGTextContentElement(){
        super();
    }
    
    @JsProperty(name="textLength")
    public native SVGAnimatedLength getTextLength();
    
    @JsProperty(name="lengthAdjust")
    public native SVGAnimatedEnumeration getLengthAdjust();
    
    @JsMethod(name = "getCharNumAtPosition")
    public native long getCharNumAtPosition(SVGPoint point);
    
    @JsMethod(name = "getComputedTextLength")
    public native float getComputedTextLength();
    
    @JsMethod(name = "getEndPositionOfChar")
    public native SVGPoint getEndPositionOfChar(long charnum);
    
    @JsMethod(name = "getExtentOfChar")
    public native SVGRect getExtentOfChar(long charnum);
    
    @JsMethod(name = "getNumberOfChars")
    public native long getNumberOfChars();
    
    @JsMethod(name = "getRotationOfChar")
    public native float getRotationOfChar(long charnum);
    
    @JsMethod(name = "getStartPositionOfChar")
    public native SVGPoint getStartPositionOfChar(long charnum);
    
    @JsMethod(name = "getSubStringLength")
    public native float getSubStringLength(long charnum, long nchars);
    
    @JsMethod(name = "selectSubString")
    public native void selectSubString(long charnum, long nchars);
    
}