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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="IDBObserver", isNative = true)
public class IDBObserver implements IsObject {
    @JsConstructor
    public IDBObserver(IDBObserverCallback callback){
    }
    
    @JsMethod(name = "observe")
    public native void observe(IDBDatabase db, IDBTransaction tx, IDBObserverInit options);
    
    @JsMethod(name = "unobserve")
    public native void unobserve(IDBDatabase db);
    
}
