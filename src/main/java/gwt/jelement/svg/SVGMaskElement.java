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

@JsType(namespace = JsPackage.GLOBAL, name="SVGMaskElement", isNative = true)
public class SVGMaskElement extends SVGElement {
    @JsProperty(name="maskUnits")
    public native SVGAnimatedEnumeration getMaskUnits();
    
    @JsProperty(name="maskContentUnits")
    public native SVGAnimatedEnumeration getMaskContentUnits();
    
    @JsProperty(name="x")
    public native SVGAnimatedLength getX();
    
    @JsProperty(name="y")
    public native SVGAnimatedLength getY();
    
    @JsProperty(name="width")
    public native SVGAnimatedLength getWidth();
    
    @JsProperty(name="height")
    public native SVGAnimatedLength getHeight();
    
    @JsProperty(name="requiredExtensions")
    public native SVGStringList getRequiredExtensions();
    
    @JsProperty(name="systemLanguage")
    public native SVGStringList getSystemLanguage();
    
}
