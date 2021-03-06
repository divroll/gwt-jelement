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
package gwt.jelement.css;

import gwt.jelement.core.Promise;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class FontFaceSet extends EventTarget {
    @JsProperty(name="onloading")
    private EventHandlerNonNull onloading;
    
    @JsProperty(name="onloadingdone")
    private EventHandlerNonNull onloadingdone;
    
    @JsProperty(name="onloadingerror")
    private EventHandlerNonNull onloadingerror;
    
    @JsProperty(name="status")
    private String status;
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoading(){
        return this.onloading;
    }
    
    @JsOverlay
    public final void setOnLoading(EventHandlerNonNull onloading){
        this.onloading = onloading;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadingdone(){
        return this.onloadingdone;
    }
    
    @JsOverlay
    public final void setOnLoadingdone(EventHandlerNonNull onloadingdone){
        this.onloadingdone = onloadingdone;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadingerror(){
        return this.onloadingerror;
    }
    
    @JsOverlay
    public final void setOnLoadingerror(EventHandlerNonNull onloadingerror){
        this.onloadingerror = onloadingerror;
    }
    
    @JsProperty(name="ready")
    public native Promise<FontFaceSet> getReady();
    
    @JsOverlay
    public final FontFaceSetLoadStatus getStatus(){
       return FontFaceSetLoadStatus.of(status);
    }
    
    @JsMethod(name = "check")
    public native boolean check(String font);
    
    @JsMethod(name = "check")
    public native boolean check(String font, String text);
    
    @JsMethod(name = "load")
    public native Promise<FontFace[]> load(String font);
    
    @JsMethod(name = "load")
    public native Promise<FontFace[]> load(String font, String text);
    
}
