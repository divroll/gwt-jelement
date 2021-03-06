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
package gwt.jelement.webgl;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class OESVertexArrayObject implements IsObject {
    public static double VERTEX_ARRAY_BINDING_OES; /* 0x85B5 */
    
    @JsMethod(name = "bindVertexArrayOES")
    public native void bindVertexArrayOES();
    
    @JsMethod(name = "bindVertexArrayOES")
    public native void bindVertexArrayOES(WebGLVertexArrayObjectOES arrayObject);
    
    @JsMethod(name = "createVertexArrayOES")
    public native WebGLVertexArrayObjectOES createVertexArrayOES();
    
    @JsMethod(name = "deleteVertexArrayOES")
    public native void deleteVertexArrayOES();
    
    @JsMethod(name = "deleteVertexArrayOES")
    public native void deleteVertexArrayOES(WebGLVertexArrayObjectOES arrayObject);
    
    @JsMethod(name = "isVertexArrayOES")
    public native boolean isVertexArrayOES();
    
    @JsMethod(name = "isVertexArrayOES")
    public native boolean isVertexArrayOES(WebGLVertexArrayObjectOES arrayObject);
    
}
