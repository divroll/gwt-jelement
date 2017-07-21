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
package gwt.jelement.mediasource;

import gwt.jelement.dom.ArrayBuffer;
import gwt.jelement.dom.ArrayBufferView;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.html.TimeRanges;
import gwt.jelement.html.track.AudioTrackList;
import gwt.jelement.html.track.VideoTrackList;
import gwt.jelement.mediasource.AppendMode;
import gwt.jelement.mediasource.TrackDefaultList;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SourceBuffer extends EventTarget{
    
    @JsConstructor
    public SourceBuffer(){
        super();
    }
    
    @JsProperty(name="mode")
    public AppendMode mode;
    
    @JsProperty(name="timestampOffset")
    public double timestampOffset;
    
    @JsProperty(name="appendWindowStart")
    public double appendWindowStart;
    
    @JsProperty(name="appendWindowEnd")
    public double appendWindowEnd;
    
    @JsProperty(name="onupdatestart")
    public EventHandlerNonNull onupdatestart;
    
    @JsProperty(name="onupdate")
    public EventHandlerNonNull onupdate;
    
    @JsProperty(name="onupdateend")
    public EventHandlerNonNull onupdateend;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onabort")
    public EventHandlerNonNull onabort;
    
    @JsProperty(name="trackDefaults")
    public TrackDefaultList trackDefaults;
    
    @JsProperty(name="updating")
    public native boolean getUpdating();
    
    @JsProperty(name="buffered")
    public native TimeRanges getBuffered();
    
    @JsProperty(name="audioTracks")
    public native AudioTrackList getAudioTracks();
    
    @JsProperty(name="videoTracks")
    public native VideoTrackList getVideoTracks();
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "appendBuffer")
    public native void appendBuffer(ArrayBuffer data);
    
    @JsMethod(name = "appendBuffer")
    public native void appendBuffer(ArrayBufferView data);
    
    @JsMethod(name = "remove")
    public native void remove(double start, double end);
    
}