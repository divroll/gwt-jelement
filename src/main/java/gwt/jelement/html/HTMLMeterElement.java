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

import gwt.jelement.dom.NodeList;
import gwt.jelement.html.HTMLElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLMeterElement extends HTMLElement{
    
    @JsConstructor
    public HTMLMeterElement(){
        super();
    }
    
    @JsProperty(name="value")
    public double value;
    
    @JsProperty(name="min")
    public double min;
    
    @JsProperty(name="max")
    public double max;
    
    @JsProperty(name="low")
    public double low;
    
    @JsProperty(name="high")
    public double high;
    
    @JsProperty(name="optimum")
    public double optimum;
    
    @JsProperty(name="labels")
    public native NodeList getLabels();
    
    
}