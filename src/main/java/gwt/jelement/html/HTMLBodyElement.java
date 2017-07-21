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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.html.HTMLElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLBodyElement extends HTMLElement{
    
    @JsConstructor
    public HTMLBodyElement(){
        super();
    }
    
    @JsProperty(name="text")
    public String text;
    
    @JsProperty(name="link")
    public String link;
    
    @JsProperty(name="vLink")
    public String vLink;
    
    @JsProperty(name="aLink")
    public String aLink;
    
    @JsProperty(name="bgColor")
    public String bgColor;
    
    @JsProperty(name="background")
    public String background;
    
    @JsProperty(name="onorientationchange")
    public EventHandlerNonNull onorientationchange;
    
    @JsProperty(name="onbeforeunload")
    public EventHandlerNonNull onbeforeunload;
    
    @JsProperty(name="onhashchange")
    public EventHandlerNonNull onhashchange;
    
    @JsProperty(name="onlanguagechange")
    public EventHandlerNonNull onlanguagechange;
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsProperty(name="onmessageerror")
    public EventHandlerNonNull onmessageerror;
    
    @JsProperty(name="onoffline")
    public EventHandlerNonNull onoffline;
    
    @JsProperty(name="ononline")
    public EventHandlerNonNull ononline;
    
    @JsProperty(name="onpagehide")
    public EventHandlerNonNull onpagehide;
    
    @JsProperty(name="onpageshow")
    public EventHandlerNonNull onpageshow;
    
    @JsProperty(name="onpopstate")
    public EventHandlerNonNull onpopstate;
    
    @JsProperty(name="onrejectionhandled")
    public EventHandlerNonNull onrejectionhandled;
    
    @JsProperty(name="onstorage")
    public EventHandlerNonNull onstorage;
    
    @JsProperty(name="onunhandledrejection")
    public EventHandlerNonNull onunhandledrejection;
    
    @JsProperty(name="onunload")
    public EventHandlerNonNull onunload;
    
    
}