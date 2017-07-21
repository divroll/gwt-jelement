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

import gwt.jelement.serviceworkers.Client;
import gwt.jelement.serviceworkers.ClientQueryOptions;
import gwt.jelement.serviceworkers.WindowClient;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Clients{
    
    @JsMethod(name = "claim")
    public native Promise<Void> claim();
    
    @JsMethod(name = "get")
    public native Promise<Any> get(String id);
    
    @JsMethod(name = "matchAll")
    public native Promise<Client[]> matchAll();
    
    @JsMethod(name = "matchAll")
    public native Promise<Client[]> matchAll(ClientQueryOptions options);
    
    @JsMethod(name = "openWindow")
    public native Promise<WindowClient> openWindow(String url);
    
}