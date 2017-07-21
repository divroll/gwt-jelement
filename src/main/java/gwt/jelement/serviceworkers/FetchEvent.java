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

import gwt.jelement.fetch.Request;
import gwt.jelement.fetch.Response;
import gwt.jelement.serviceworkers.ExtendableEvent;
import gwt.jelement.serviceworkers.FetchEventInit;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class FetchEvent extends ExtendableEvent{
    
    @JsConstructor
    public FetchEvent(String type, FetchEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="request")
    public native Request getRequest();
    
    @JsProperty(name="clientId")
    public native String getClientId();
    
    @JsProperty(name="isReload")
    public native boolean getIsReload();
    
    @JsProperty(name="preloadResponse")
    public native Promise<Any> getPreloadResponse();
    
    @JsMethod(name = "respondWith")
    public native void respondWith(Promise<Response> r);
    
}