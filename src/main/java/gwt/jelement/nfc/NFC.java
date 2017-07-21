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
package gwt.jelement.nfc;

import gwt.jelement.dom.ArrayBuffer;
import gwt.jelement.nfc.MessageCallback;
import gwt.jelement.nfc.NFCMessage;
import gwt.jelement.nfc.NFCPushOptions;
import gwt.jelement.nfc.NFCPushTarget;
import gwt.jelement.nfc.NFCWatchOptions;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class NFC{
    
    @JsMethod(name = "cancelPush")
    public native Promise<Void> cancelPush();
    
    @JsOverlay
    public Promise<Void> cancelPush(NFCPushTarget target){
        return cancelPush(target.getInternalValue());
    }
    
    @JsMethod(name = "cancelPush")
    public native Promise<Void> cancelPush(String target);
    
    @JsMethod(name = "cancelWatch")
    public native Promise<Void> cancelWatch();
    
    @JsMethod(name = "cancelWatch")
    public native Promise<Void> cancelWatch(long id);
    
    @JsMethod(name = "push")
    public native Promise<Void> push(String message);
    
    @JsMethod(name = "push")
    public native Promise<Void> push(ArrayBuffer message);
    
    @JsMethod(name = "push")
    public native Promise<Void> push(NFCMessage message);
    
    @JsMethod(name = "push")
    public native Promise<Void> push(String message, NFCPushOptions options);
    
    @JsMethod(name = "push")
    public native Promise<Void> push(ArrayBuffer message, NFCPushOptions options);
    
    @JsMethod(name = "push")
    public native Promise<Void> push(NFCMessage message, NFCPushOptions options);
    
    @JsMethod(name = "watch")
    public native Promise<Long> watch(MessageCallback callback);
    
    @JsMethod(name = "watch")
    public native Promise<Long> watch(MessageCallback callback, NFCWatchOptions options);
    
}