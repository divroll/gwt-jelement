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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Event", isNative = true)
public class Event implements IsObject {
    public static short NONE; /* 0 */
    public static short CAPTURING_PHASE; /* 1 */
    public static short AT_TARGET; /* 2 */
    public static short BUBBLING_PHASE; /* 3 */
    
    @JsConstructor
    public Event(String type){
    }
    
    @JsConstructor
    public Event(String type, EventInit eventInitDict){
    }
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="target")
    public native EventTarget getTarget();
    
    @JsProperty(name="currentTarget")
    public native EventTarget getCurrentTarget();
    
    @JsProperty(name="eventPhase")
    public native short getEventPhase();
    
    @JsProperty(name="bubbles")
    public native boolean isBubbles();
    
    @JsProperty(name="cancelable")
    public native boolean isCancelable();
    
    @JsProperty(name="defaultPrevented")
    public native boolean isDefaultPrevented();
    
    @JsProperty(name="composed")
    public native boolean isComposed();
    
    @JsProperty(name="isTrusted")
    public native boolean isIsTrusted();
    
    @JsProperty(name="timeStamp")
    public native double getTimeStamp();
    
    @JsProperty(name="srcElement")
    public native EventTarget getSrcElement();
    
    @JsProperty(name="returnValue")
    public native boolean isReturnValue();
    
    @JsProperty(name="returnValue")
    public native void setReturnValue(boolean returnValue);
    
    @JsProperty(name="cancelBubble")
    public native boolean isCancelBubble();
    
    @JsProperty(name="cancelBubble")
    public native void setCancelBubble(boolean cancelBubble);
    
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
