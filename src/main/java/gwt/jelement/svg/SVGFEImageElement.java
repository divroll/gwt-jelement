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

import gwt.jelement.svg.SVGAnimatedLength;
import gwt.jelement.svg.SVGAnimatedPreserveAspectRatio;
import gwt.jelement.svg.SVGAnimatedString;
import gwt.jelement.svg.SVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SVGFEImageElement", isNative = true)
public class SVGFEImageElement extends SVGElement{
    @JsConstructor
    public SVGFEImageElement(){
        super();
    }
    
    @JsProperty(name="preserveAspectRatio")
    public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
    
    @JsProperty(name="x")
    public native SVGAnimatedLength getX();
    
    @JsProperty(name="y")
    public native SVGAnimatedLength getY();
    
    @JsProperty(name="width")
    public native SVGAnimatedLength getWidth();
    
    @JsProperty(name="height")
    public native SVGAnimatedLength getHeight();
    
    @JsProperty(name="result")
    public native SVGAnimatedString getResult();
    
    @JsProperty(name="href")
    public native SVGAnimatedString getHref();
    
}
