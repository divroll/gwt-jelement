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

import gwt.jelement.dom.Document;
import gwt.jelement.frame.Window;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLFrameElement", isNative = true)
public class HTMLFrameElement extends HTMLElement {
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="scrolling")
    public native String getScrolling();
    
    @JsProperty(name="scrolling")
    public native void setScrolling(String scrolling);
    
    @JsProperty(name="src")
    public native String getSrc();
    
    @JsProperty(name="src")
    public native void setSrc(String src);
    
    @JsProperty(name="frameBorder")
    public native String getFrameBorder();
    
    @JsProperty(name="frameBorder")
    public native void setFrameBorder(String frameBorder);
    
    @JsProperty(name="longDesc")
    public native String getLongDesc();
    
    @JsProperty(name="longDesc")
    public native void setLongDesc(String longDesc);
    
    @JsProperty(name="noResize")
    public native boolean isNoResize();
    
    @JsProperty(name="noResize")
    public native void setNoResize(boolean noResize);
    
    @JsProperty(name="contentDocument")
    public native Document getContentDocument();
    
    @JsProperty(name="contentWindow")
    public native Window getContentWindow();
    
    @JsProperty(name="marginHeight")
    public native String getMarginHeight();
    
    @JsProperty(name="marginHeight")
    public native void setMarginHeight(String marginHeight);
    
    @JsProperty(name="marginWidth")
    public native String getMarginWidth();
    
    @JsProperty(name="marginWidth")
    public native void setMarginWidth(String marginWidth);
    
}
