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
package gwt.jelement.events;

import gwt.jelement.events.EventInit;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Event{
    public static final int NONE = 0;
    public static final int CAPTURING_PHASE = 1;
    public static final int AT_TARGET = 2;
    public static final int BUBBLING_PHASE = 3;
    
    
    @JsConstructor
    public Event(String type){
    }
    
    @JsConstructor
    public Event(String type, EventInit eventInitDict){
    }
    
    @JsProperty(name="returnValue")
    public boolean returnValue;
    
    @JsProperty(name="cancelBubble")
    public boolean cancelBubble;
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="target")
    public native EventTarget getTarget();
    
    @JsProperty(name="currentTarget")
    public native EventTarget getCurrentTarget();
    
    @JsProperty(name="eventPhase")
    public native short getEventPhase();
    
    @JsProperty(name="bubbles")
    public native boolean getBubbles();
    
    @JsProperty(name="cancelable")
    public native boolean getCancelable();
    
    @JsProperty(name="defaultPrevented")
    public native boolean getDefaultPrevented();
    
    @JsProperty(name="composed")
    public native boolean getComposed();
    
    @JsProperty(name="isTrusted")
    public native boolean getIsTrusted();
    
    @JsProperty(name="timeStamp")
    public native double getTimeStamp();
    
    @JsProperty(name="srcElement")
    public native EventTarget getSrcElement();
    
    @JsProperty(name="path")
    public native EventTarget[] getPath();
    
    @JsMethod(name = "composedPath")
    public native EventTarget[] composedPath();
    
    @JsMethod(name = "initEvent")
    public native void initEvent(String type);
    
    @JsMethod(name = "initEvent")
    public native void initEvent(String type, boolean bubbles);
    
    @JsMethod(name = "initEvent")
    public native void initEvent(String type, boolean bubbles, boolean cancelable);
    
    @JsMethod(name = "preventDefault")
    public native void preventDefault();
    
    @JsMethod(name = "stopImmediatePropagation")
    public native void stopImmediatePropagation();
    
    @JsMethod(name = "stopPropagation")
    public native void stopPropagation();
    
}