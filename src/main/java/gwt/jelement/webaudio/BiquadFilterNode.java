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
package gwt.jelement.webaudio;

import gwt.jelement.dom.Float32Array;
import gwt.jelement.webaudio.AudioNode;
import gwt.jelement.webaudio.AudioParam;
import gwt.jelement.webaudio.BiquadFilterType;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class BiquadFilterNode extends AudioNode{
    
    @JsConstructor
    public BiquadFilterNode(){
        super();
    }
    
    @JsProperty(name="type")
    public BiquadFilterType type;
    
    @JsProperty(name="frequency")
    public native AudioParam getFrequency();
    
    @JsProperty(name="detune")
    public native AudioParam getDetune();
    
    @JsProperty(name="Q")
    public native AudioParam getQ();
    
    @JsProperty(name="gain")
    public native AudioParam getGain();
    
    @JsMethod(name = "getFrequencyResponse")
    public native void getFrequencyResponse(Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse);
    
}