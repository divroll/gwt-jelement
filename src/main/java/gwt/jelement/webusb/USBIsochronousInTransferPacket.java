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
package gwt.jelement.webusb;

import gwt.jelement.dom.DataView;
import gwt.jelement.webusb.USBTransferStatus;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class USBIsochronousInTransferPacket{
    
    @JsConstructor
    public USBIsochronousInTransferPacket(USBTransferStatus status){
    }
    
    @JsConstructor
    public USBIsochronousInTransferPacket(USBTransferStatus status, DataView data){
    }
    
    @JsOverlay
    public  USBTransferStatus getStatusAsUSBTransferStatus(){
        return USBTransferStatus.of(getStatus());
    }
    
    @JsProperty(name="status")
    public native String getStatus();
    
    @JsProperty(name="data")
    public native DataView getData();
    
    
}