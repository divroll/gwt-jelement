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

import gwt.jelement.bluetooth.BluetoothRemoteGATTCharacteristic;
import gwt.jelement.dom.DataView;
import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class BluetoothRemoteGATTDescriptor{
    
    @JsProperty(name="characteristic")
    public native BluetoothRemoteGATTCharacteristic getCharacteristic();
    
    @JsProperty(name="uuid")
    public native String getUuid();
    
    @JsProperty(name="value")
    public native DataView getValue();
    
    @JsMethod(name = "readValue")
    public native Promise<DataView> readValue();
    
    @JsMethod(name = "writeValue")
    public native Promise<Void> writeValue(ArrayBuffer value);
    
    @JsMethod(name = "writeValue")
    public native Promise<Void> writeValue(ArrayBufferView value);
    
}
