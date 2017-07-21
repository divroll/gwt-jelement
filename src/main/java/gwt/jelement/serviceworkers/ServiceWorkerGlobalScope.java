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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.fetch.Request;
import gwt.jelement.fetch.Response;
import gwt.jelement.serviceworkers.Clients;
import gwt.jelement.serviceworkers.ServiceWorkerRegistration;
import gwt.jelement.workers.WorkerGlobalScope;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ServiceWorkerGlobalScope extends WorkerGlobalScope{
    
    @JsConstructor
    public ServiceWorkerGlobalScope(){
        super();
    }
    
    @JsProperty(name="onactivate")
    public EventHandlerNonNull onactivate;
    
    @JsProperty(name="onfetch")
    public EventHandlerNonNull onfetch;
    
    @JsProperty(name="oninstall")
    public EventHandlerNonNull oninstall;
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsProperty(name="onforeignfetch")
    public EventHandlerNonNull onforeignfetch;
    
    @JsProperty(name="onbackgroundfetched")
    public EventHandlerNonNull onbackgroundfetched;
    
    @JsProperty(name="onbackgroundfetchfail")
    public EventHandlerNonNull onbackgroundfetchfail;
    
    @JsProperty(name="onbackgroundfetchabort")
    public EventHandlerNonNull onbackgroundfetchabort;
    
    @JsProperty(name="onbackgroundfetchclick")
    public EventHandlerNonNull onbackgroundfetchclick;
    
    @JsProperty(name="onsync")
    public EventHandlerNonNull onsync;
    
    @JsProperty(name="onnotificationclick")
    public EventHandlerNonNull onnotificationclick;
    
    @JsProperty(name="onnotificationclose")
    public EventHandlerNonNull onnotificationclose;
    
    @JsProperty(name="onpush")
    public EventHandlerNonNull onpush;
    
    @JsProperty(name="clients")
    public native Clients getClients();
    
    @JsProperty(name="registration")
    public native ServiceWorkerRegistration getRegistration();
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input, Object init);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input, Object init);
    
    @JsMethod(name = "skipWaiting")
    public native Promise<Void> skipWaiting();
    
}
