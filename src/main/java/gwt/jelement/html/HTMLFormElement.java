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

import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLFormControlsCollection;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLFormElement extends HTMLElement{
    
    @JsConstructor
    public HTMLFormElement(){
        super();
    }
    
    @JsProperty(name="acceptCharset")
    public String acceptCharset;
    
    @JsProperty(name="action")
    public String action;
    
    @JsProperty(name="autocomplete")
    public String autocomplete;
    
    @JsProperty(name="enctype")
    public String enctype;
    
    @JsProperty(name="encoding")
    public String encoding;
    
    @JsProperty(name="method")
    public String method;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="noValidate")
    public boolean noValidate;
    
    @JsProperty(name="target")
    public String target;
    
    @JsProperty(name="elements")
    public native HTMLFormControlsCollection getElements();
    
    @JsProperty(name="length")
    public native long getLength();
    
    @JsMethod(name = "checkValidity")
    public native boolean checkValidity();
    
    @JsMethod(name = "reportValidity")
    public native boolean reportValidity();
    
    @JsMethod(name = "reset")
    public native void reset();
    
    @JsMethod(name = "submit")
    public native void submit();
    
}