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
package gwt.jelement.timing;

import gwt.jelement.timing.NavigationType;
import gwt.jelement.timing.PerformanceResourceTiming;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PerformanceNavigationTiming extends PerformanceResourceTiming{
    
    @JsConstructor
    public PerformanceNavigationTiming(){
        super();
    }
    
    @JsProperty(name="unloadEventStart")
    public native double getUnloadEventStart();
    
    @JsProperty(name="unloadEventEnd")
    public native double getUnloadEventEnd();
    
    @JsProperty(name="domInteractive")
    public native double getDomInteractive();
    
    @JsProperty(name="domContentLoadedEventStart")
    public native double getDomContentLoadedEventStart();
    
    @JsProperty(name="domContentLoadedEventEnd")
    public native double getDomContentLoadedEventEnd();
    
    @JsProperty(name="domComplete")
    public native double getDomComplete();
    
    @JsProperty(name="loadEventStart")
    public native double getLoadEventStart();
    
    @JsProperty(name="loadEventEnd")
    public native double getLoadEventEnd();
    
    @JsOverlay
    public  NavigationType getTypeAsNavigationType(){
        return NavigationType.of(getType());
    }
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="redirectCount")
    public native short getRedirectCount();
    
    @JsMethod(name = "toJSON")
    public native Any toJSON();
    
}