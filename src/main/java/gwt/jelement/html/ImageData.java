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
package gwt.jelement.html;

import gwt.jelement.dom.Float32Array;
import gwt.jelement.dom.Uint16Array;
import gwt.jelement.dom.Uint8ClampedArray;
import gwt.jelement.html.ImageDataColorSettings;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ImageData{
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ImageDataArray {
        @JsOverlay
        default Uint8ClampedArray asUint8ClampedArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default Uint16Array asUint16Array(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default Float32Array asFloat32Array(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isUint8ClampedArray(){
            return (Object) this instanceof Uint8ClampedArray;
        }
    
        @JsOverlay
        default boolean isUint16Array(){
            return (Object) this instanceof Uint16Array;
        }
    
        @JsOverlay
        default boolean isFloat32Array(){
            return (Object) this instanceof Float32Array;
        }
    
    }
    
    @JsProperty(name="width")
    public native long getWidth();
    
    @JsProperty(name="height")
    public native long getHeight();
    
    @JsProperty(name="data")
    public native Uint8ClampedArray getData();
    
    @JsProperty(name="dataUnion")
    public native ImageData.ImageDataArray getDataUnion();
    
    @JsMethod(name = "getColorSettings")
    public native ImageDataColorSettings getColorSettings();
    
}