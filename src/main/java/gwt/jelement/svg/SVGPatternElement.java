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

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SVGPatternElement", isNative = true)
public class SVGPatternElement extends SVGElement {
    @JsProperty(name="patternUnits")
    public native SVGAnimatedEnumeration getPatternUnits();
    
    @JsProperty(name="patternContentUnits")
    public native SVGAnimatedEnumeration getPatternContentUnits();
    
    @JsProperty(name="patternTransform")
    public native SVGAnimatedTransformList getPatternTransform();
    
    @JsProperty(name="x")
    public native SVGAnimatedLength getX();
    
    @JsProperty(name="y")
    public native SVGAnimatedLength getY();
    
    @JsProperty(name="width")
    public native SVGAnimatedLength getWidth();
    
    @JsProperty(name="height")
    public native SVGAnimatedLength getHeight();
    
    @JsProperty(name="viewBox")
    public native SVGAnimatedRect getViewBox();
    
    @JsProperty(name="preserveAspectRatio")
    public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
    
    @JsProperty(name="href")
    public native SVGAnimatedString getHref();
    
    @JsProperty(name="requiredExtensions")
    public native SVGStringList getRequiredExtensions();
    
    @JsProperty(name="systemLanguage")
    public native SVGStringList getSystemLanguage();
    
}
