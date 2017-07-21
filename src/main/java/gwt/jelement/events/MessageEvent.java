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

import gwt.jelement.dom.MessagePort;
import gwt.jelement.events.Event;
import gwt.jelement.events.EventTarget;
import gwt.jelement.events.MessageEventInit;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MessageEvent extends Event{
    
    @JsConstructor
    public MessageEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public MessageEvent(String type, MessageEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="data")
    public native Any getData();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="lastEventId")
    public native String getLastEventId();
    
    @JsProperty(name="source")
    public native EventTarget getSource();
    
    @JsProperty(name="ports")
    public native MessagePort[] getPorts();
    
    @JsProperty(name="suborigin")
    public native String getSuborigin();
    
    @JsMethod(name = "initMessageEvent")
    public native void initMessageEvent();
    
    @JsMethod(name = "initMessageEvent")
    public native void initMessageEvent(String typeArg);
    
    @JsMethod(name = "initMessageEvent")
    public native void initMessageEvent(String typeArg, boolean canBubbleArg);
    
    @JsMethod(name = "initMessageEvent")
    public native void initMessageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg);
    
    @JsMethod(name = "initMessageEvent")
    public native void initMessageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Any dataArg);
    
    @JsMethod(name = "initMessageEvent")
    public native void initMessageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Any dataArg, String originArg);
    
    @JsMethod(name = "initMessageEvent")
    public native void initMessageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Any dataArg, String originArg, String lastEventIdArg);
    
    @JsMethod(name = "initMessageEvent")
    public native void initMessageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Any dataArg, String originArg, String lastEventIdArg, EventTarget sourceArg);
    
    @JsMethod(name = "initMessageEvent")
    public native void initMessageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Any dataArg, String originArg, String lastEventIdArg, EventTarget sourceArg, MessagePort[] portsArg);
    
}