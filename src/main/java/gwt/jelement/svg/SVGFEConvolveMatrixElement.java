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

@JsType(namespace = JsPackage.GLOBAL, name="SVGFEConvolveMatrixElement", isNative = true)
public class SVGFEConvolveMatrixElement extends SVGElement {
    public static short SVG_EDGEMODE_UNKNOWN; /* 0 */
    public static short SVG_EDGEMODE_DUPLICATE; /* 1 */
    public static short SVG_EDGEMODE_WRAP; /* 2 */
    public static short SVG_EDGEMODE_NONE; /* 3 */
    
    @JsProperty(name="in1")
    public native SVGAnimatedString getIn1();
    
    @JsProperty(name="orderX")
    public native SVGAnimatedInteger getOrderX();
    
    @JsProperty(name="orderY")
    public native SVGAnimatedInteger getOrderY();
    
    @JsProperty(name="kernelMatrix")
    public native SVGAnimatedNumberList getKernelMatrix();
    
    @JsProperty(name="divisor")
    public native SVGAnimatedNumber getDivisor();
    
    @JsProperty(name="bias")
    public native SVGAnimatedNumber getBias();
    
    @JsProperty(name="targetX")
    public native SVGAnimatedInteger getTargetX();
    
    @JsProperty(name="targetY")
    public native SVGAnimatedInteger getTargetY();
    
    @JsProperty(name="edgeMode")
    public native SVGAnimatedEnumeration getEdgeMode();
    
    @JsProperty(name="kernelUnitLengthX")
    public native SVGAnimatedNumber getKernelUnitLengthX();
    
    @JsProperty(name="kernelUnitLengthY")
    public native SVGAnimatedNumber getKernelUnitLengthY();
    
    @JsProperty(name="preserveAlpha")
    public native SVGAnimatedBoolean getPreserveAlpha();
    
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
    
}
