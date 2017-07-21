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
package gwt.jelement.serviceworkers;

import gwt.jelement.dom.VisibilityState;
import gwt.jelement.serviceworkers.Client;
import gwt.jelement.serviceworkers.WindowClient;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WindowClient extends Client{
    
    @JsConstructor
    public WindowClient(){
        super();
    }
    
    @JsOverlay
    public  VisibilityState getVisibilityStateAsVisibilityState(){
        return VisibilityState.of(getVisibilityState());
    }
    
    @JsProperty(name="visibilityState")
    public native String getVisibilityState();
    
    @JsProperty(name="focused")
    public native boolean getFocused();
    
    @JsMethod(name = "focus")
    public native Promise<WindowClient> focus();
    
    @JsMethod(name = "navigate")
    public native Promise<WindowClient> navigate(String url);
    
}