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
package gwt.jelement.gamepad;

import gwt.jelement.dom.Float32Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class GamepadPose{
    
    @JsProperty(name="hasOrientation")
    public native boolean getHasOrientation();
    
    @JsProperty(name="hasPosition")
    public native boolean getHasPosition();
    
    @JsProperty(name="position")
    public native Float32Array getPosition();
    
    @JsProperty(name="linearVelocity")
    public native Float32Array getLinearVelocity();
    
    @JsProperty(name="linearAcceleration")
    public native Float32Array getLinearAcceleration();
    
    @JsProperty(name="orientation")
    public native Float32Array getOrientation();
    
    @JsProperty(name="angularVelocity")
    public native Float32Array getAngularVelocity();
    
    @JsProperty(name="angularAcceleration")
    public native Float32Array getAngularAcceleration();
    
    
}