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
package gwt.jelement.dom;

import gwt.jelement.dom.TouchInit;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Touch{
    
    @JsConstructor
    public Touch(TouchInit initDict){
    }
    
    @JsProperty(name="identifier")
    public native long getIdentifier();
    
    @JsProperty(name="target")
    public native EventTarget getTarget();
    
    @JsProperty(name="screenX")
    public native double getScreenX();
    
    @JsProperty(name="screenY")
    public native double getScreenY();
    
    @JsProperty(name="clientX")
    public native double getClientX();
    
    @JsProperty(name="clientY")
    public native double getClientY();
    
    @JsProperty(name="pageX")
    public native double getPageX();
    
    @JsProperty(name="pageY")
    public native double getPageY();
    
    @JsProperty(name="radiusX")
    public native float getRadiusX();
    
    @JsProperty(name="radiusY")
    public native float getRadiusY();
    
    @JsProperty(name="rotationAngle")
    public native float getRotationAngle();
    
    @JsProperty(name="force")
    public native float getForce();
    
    @JsProperty(name="region")
    public native String getRegion();
    
    
}