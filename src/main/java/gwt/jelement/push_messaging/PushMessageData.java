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
import gwt.jelement.core.IsObject;
import gwt.jelement.fileapi.Blob;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="PushMessageData", isNative = true)
public class PushMessageData implements IsObject {
    @JsMethod(name = "arrayBuffer")
    public native ArrayBuffer arrayBuffer();
    
    @JsMethod(name = "blob")
    public native Blob blob();
    
    @JsMethod(name = "json")
    public native Object json();
    
    @JsMethod(name = "text")
    public native String text();
    
}
