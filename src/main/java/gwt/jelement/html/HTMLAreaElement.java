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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLAreaElement extends HTMLElement{
    
    @JsConstructor
    public HTMLAreaElement(){
        super();
    }
    
    @JsProperty(name="alt")
    public String alt;
    
    @JsProperty(name="coords")
    public String coords;
    
    @JsProperty(name="download")
    public String download;
    
    @JsProperty(name="shape")
    public String shape;
    
    @JsProperty(name="target")
    public String target;
    
    @JsProperty(name="ping")
    public String ping;
    
    @JsProperty(name="rel")
    public String rel;
    
    @JsProperty(name="referrerPolicy")
    public String referrerPolicy;
    
    @JsProperty(name="noHref")
    public boolean noHref;
    
    @JsProperty(name="protocol")
    public String protocol;
    
    @JsProperty(name="username")
    public String username;
    
    @JsProperty(name="password")
    public String password;
    
    @JsProperty(name="host")
    public String host;
    
    @JsProperty(name="hostname")
    public String hostname;
    
    @JsProperty(name="port")
    public String port;
    
    @JsProperty(name="pathname")
    public String pathname;
    
    @JsProperty(name="search")
    public String search;
    
    @JsProperty(name="hash")
    public String hash;
    
    @JsProperty(name="href")
    public native String getHref();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    
}