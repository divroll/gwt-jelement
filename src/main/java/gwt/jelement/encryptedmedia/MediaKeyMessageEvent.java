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
package gwt.jelement.encryptedmedia;

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.encryptedmedia.MediaKeyMessageType;
import gwt.jelement.events.Event;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="MediaKeyMessageEvent", isNative = true)
public class MediaKeyMessageEvent extends Event{
    @JsProperty(name="messageType")
    private String messageType;
    
    @JsConstructor
    public MediaKeyMessageEvent(){
        super((String) null);
    }
    
    @JsProperty(name="message")
    public native ArrayBuffer getMessage();
    
    @JsOverlay
    public final MediaKeyMessageType getMessageType(){
       return MediaKeyMessageType.of(messageType);
    }
    
}
