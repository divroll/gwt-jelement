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
package gwt.jelement.geolocation;

import gwt.jelement.geolocation.PositionCallback;
import gwt.jelement.geolocation.PositionErrorCallback;
import gwt.jelement.geolocation.PositionOptions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Geolocation{
    
    @JsMethod(name = "clearWatch")
    public native void clearWatch(long watchID);
    
    @JsMethod(name = "getCurrentPosition")
    public native void getCurrentPosition(PositionCallback successCallback);
    
    @JsMethod(name = "getCurrentPosition")
    public native void getCurrentPosition(PositionCallback successCallback, PositionErrorCallback errorCallback);
    
    @JsMethod(name = "getCurrentPosition")
    public native void getCurrentPosition(PositionCallback successCallback, PositionErrorCallback errorCallback, PositionOptions options);
    
    @JsMethod(name = "watchPosition")
    public native long watchPosition(PositionCallback successCallback);
    
    @JsMethod(name = "watchPosition")
    public native long watchPosition(PositionCallback successCallback, PositionErrorCallback errorCallback);
    
    @JsMethod(name = "watchPosition")
    public native long watchPosition(PositionCallback successCallback, PositionErrorCallback errorCallback, PositionOptions options);
    
}