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
package gwt.jelement.bluetooth;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class BluetoothUUID{
    
    @JsMethod(name = "canonicalUUID")
    public native String canonicalUUID(long alias);
    
    @JsMethod(name = "getCharacteristic")
    public native String getCharacteristic(String name);
    
    @JsMethod(name = "getCharacteristic")
    public native String getCharacteristic(long name);
    
    @JsMethod(name = "getDescriptor")
    public native String getDescriptor(String name);
    
    @JsMethod(name = "getDescriptor")
    public native String getDescriptor(long name);
    
    @JsMethod(name = "getService")
    public native String getService(String name);
    
    @JsMethod(name = "getService")
    public native String getService(long name);
    
}