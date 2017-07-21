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
package gwt.jelement.indexeddb;

import gwt.jelement.indexeddb.IDBKeyRange;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class IDBKeyRange{
    
    @JsProperty(name="lower")
    public native Any getLower();
    
    @JsProperty(name="upper")
    public native Any getUpper();
    
    @JsProperty(name="lowerOpen")
    public native boolean getLowerOpen();
    
    @JsProperty(name="upperOpen")
    public native boolean getUpperOpen();
    
    @JsMethod(name = "bound")
    public native IDBKeyRange bound(Any lower, Any upper);
    
    @JsMethod(name = "bound")
    public native IDBKeyRange bound(Any lower, Any upper, boolean lowerOpen);
    
    @JsMethod(name = "bound")
    public native IDBKeyRange bound(Any lower, Any upper, boolean lowerOpen, boolean upperOpen);
    
    @JsMethod(name = "includes")
    public native boolean includes(Any key);
    
    @JsMethod(name = "lowerBound")
    public native IDBKeyRange lowerBound(Any bound);
    
    @JsMethod(name = "lowerBound")
    public native IDBKeyRange lowerBound(Any bound, boolean open);
    
    @JsMethod(name = "only")
    public native IDBKeyRange only(Any value);
    
    @JsMethod(name = "upperBound")
    public native IDBKeyRange upperBound(Any bound);
    
    @JsMethod(name = "upperBound")
    public native IDBKeyRange upperBound(Any bound, boolean open);
    
}
