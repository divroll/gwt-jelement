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

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.Js;
import gwt.jelement.serviceworkers.ExtendableEventInit;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PushEventInit extends ExtendableEventInit{

    @JsProperty(name="data")
    private PushMessageDataInit data;

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface PushMessageDataInit {
        @JsOverlay
        static PushMessageDataInit of(ArrayBuffer value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static PushMessageDataInit of(ArrayBufferView value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static PushMessageDataInit of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default ArrayBuffer asArrayBuffer(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ArrayBufferView asArrayBufferView(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isArrayBuffer(){
            return (Object) this instanceof ArrayBuffer;
        }
    
        @JsOverlay
        default boolean isArrayBufferView(){
            return (Object) this instanceof ArrayBufferView;
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
    }
    
    public PushEventInit(){
    }

    @JsOverlay
    public final PushEventInit.PushMessageDataInit getData(){
        return this.data;
    }

    @JsOverlay
    public final void setData(ArrayBuffer data){
        this.data = PushEventInit.PushMessageDataInit.of(data);
    }

    @JsOverlay
    public final void setData(ArrayBufferView data){
        this.data = PushEventInit.PushMessageDataInit.of(data);
    }

    @JsOverlay
    public final void setData(String data){
        this.data = PushEventInit.PushMessageDataInit.of(data);
    }


}
