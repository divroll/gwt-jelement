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
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLMarqueeElement extends HTMLElement{
    
    @JsConstructor
    public HTMLMarqueeElement(){
        super();
    }
    
    @JsProperty(name="behavior")
    public String behavior;
    
    @JsProperty(name="bgColor")
    public String bgColor;
    
    @JsProperty(name="direction")
    public String direction;
    
    @JsProperty(name="height")
    public String height;
    
    @JsProperty(name="hspace")
    public long hspace;
    
    @JsProperty(name="loop")
    public long loop;
    
    @JsProperty(name="scrollAmount")
    public long scrollAmount;
    
    @JsProperty(name="scrollDelay")
    public long scrollDelay;
    
    @JsProperty(name="trueSpeed")
    public boolean trueSpeed;
    
    @JsProperty(name="vspace")
    public long vspace;
    
    @JsProperty(name="width")
    public String width;
    
    @JsMethod(name = "start")
    public native void start();
    
    @JsMethod(name = "stop")
    public native void stop();
    
}