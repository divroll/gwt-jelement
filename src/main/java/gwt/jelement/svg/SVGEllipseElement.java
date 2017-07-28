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
import gwt.jelement.svg.SVGGeometryElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SVGEllipseElement", isNative = true)
public class SVGEllipseElement extends SVGGeometryElement{
    @JsConstructor
    public SVGEllipseElement(){
        super();
    }
    
    @JsProperty(name="cx")
    public native SVGAnimatedLength getCx();
    
    @JsProperty(name="cy")
    public native SVGAnimatedLength getCy();
    
    @JsProperty(name="rx")
    public native SVGAnimatedLength getRx();
    
    @JsProperty(name="ry")
    public native SVGAnimatedLength getRy();
    
}
