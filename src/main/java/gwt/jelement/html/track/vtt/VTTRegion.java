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
package gwt.jelement.html.track.vtt;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="VTTRegion", isNative = true)
public class VTTRegion implements IsObject {
    @JsProperty(name="scroll")
    private String scroll;
    
    @JsConstructor
    public VTTRegion(){
    }
    
    @JsProperty(name="width")
    public native double getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(double width);
    
    @JsProperty(name="lines")
    public native double getLines();
    
    @JsProperty(name="lines")
    public native void setLines(double lines);
    
    @JsProperty(name="regionAnchorX")
    public native double getRegionAnchorX();
    
    @JsProperty(name="regionAnchorX")
    public native void setRegionAnchorX(double regionAnchorX);
    
    @JsProperty(name="regionAnchorY")
    public native double getRegionAnchorY();
    
    @JsProperty(name="regionAnchorY")
    public native void setRegionAnchorY(double regionAnchorY);
    
    @JsProperty(name="viewportAnchorX")
    public native double getViewportAnchorX();
    
    @JsProperty(name="viewportAnchorX")
    public native void setViewportAnchorX(double viewportAnchorX);
    
    @JsProperty(name="viewportAnchorY")
    public native double getViewportAnchorY();
    
    @JsProperty(name="viewportAnchorY")
    public native void setViewportAnchorY(double viewportAnchorY);
    
    @JsOverlay
    public final ScrollSetting getScroll(){
       return ScrollSetting.of(scroll);
    }
    
    @JsOverlay
    public final void setScroll(ScrollSetting scroll){
       this.scroll = scroll.getInternalValue();
    }
    
}
