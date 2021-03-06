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
package gwt.jelement.events;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class EventInit extends JsObject{

    @JsProperty(name="bubbles")
    private boolean bubbles;

    @JsProperty(name="cancelable")
    private boolean cancelable;

    @JsProperty(name="composed")
    private boolean composed;

    public EventInit(){
    }

    @JsOverlay
    public final boolean isBubbles(){
        return this.bubbles;
    }

    @JsOverlay
    public final void setBubbles(boolean bubbles){
        this.bubbles = bubbles;
    }

    @JsOverlay
    public final boolean isCancelable(){
        return this.cancelable;
    }

    @JsOverlay
    public final void setCancelable(boolean cancelable){
        this.cancelable = cancelable;
    }

    @JsOverlay
    public final boolean isComposed(){
        return this.composed;
    }

    @JsOverlay
    public final void setComposed(boolean composed){
        this.composed = composed;
    }


}
