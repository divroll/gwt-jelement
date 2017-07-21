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
package gwt.jelement.presentation;

import gwt.jelement.dom.ArrayBuffer;
import gwt.jelement.dom.ArrayBufferView;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.presentation.PresentationConnectionState;
import gwt.jelement.websockets.BinaryType;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PresentationConnection extends EventTarget{
    
    @JsConstructor
    public PresentationConnection(){
        super();
    }
    
    @JsProperty(name="onconnect")
    public EventHandlerNonNull onconnect;
    
    @JsProperty(name="onclose")
    public EventHandlerNonNull onclose;
    
    @JsProperty(name="onterminate")
    public EventHandlerNonNull onterminate;
    
    @JsProperty(name="binaryType")
    public BinaryType binaryType;
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsOverlay
    public  PresentationConnectionState getStateAsPresentationConnectionState(){
        return PresentationConnectionState.of(getState());
    }
    
    @JsProperty(name="state")
    public native String getState();
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "send")
    public native void send(String message);
    
    @JsMethod(name = "send")
    public native void send(Blob data);
    
    @JsMethod(name = "send")
    public native void send(ArrayBuffer data);
    
    @JsMethod(name = "send")
    public native void send(ArrayBufferView data);
    
    @JsMethod(name = "terminate")
    public native void terminate();
    
}
