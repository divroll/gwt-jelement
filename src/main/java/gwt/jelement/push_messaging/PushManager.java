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
package gwt.jelement.push_messaging;

import gwt.jelement.push_messaging.PushSubscription;
import gwt.jelement.push_messaging.PushSubscriptionOptionsInit;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PushManager{
    
    @JsProperty(name="supportedContentEncodings")
    public static native String[] getSupportedContentEncodings();
    
    @JsMethod(name = "getSubscription")
    public native Promise<PushSubscription> getSubscription();
    
    @JsMethod(name = "permissionState")
    public native Promise permissionState();
    
    @JsMethod(name = "permissionState")
    public native Promise permissionState(PushSubscriptionOptionsInit options);
    
    @JsMethod(name = "subscribe")
    public native Promise<PushSubscription> subscribe();
    
    @JsMethod(name = "subscribe")
    public native Promise<PushSubscription> subscribe(PushSubscriptionOptionsInit options);
    
}