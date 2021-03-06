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

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="PannerNode", isNative = true)
public class PannerNode extends AudioNode {
    @JsProperty(name="panningModel")
    private String panningModel;
    
    @JsProperty(name="distanceModel")
    private String distanceModel;
    
    @JsConstructor
    public PannerNode(BaseAudioContext context){
        super();
    }
    
    @JsConstructor
    public PannerNode(BaseAudioContext context, PannerOptions options){
        super();
    }
    
    @JsProperty(name="positionX")
    public native AudioParam getPositionX();
    
    @JsProperty(name="positionY")
    public native AudioParam getPositionY();
    
    @JsProperty(name="positionZ")
    public native AudioParam getPositionZ();
    
    @JsProperty(name="orientationX")
    public native AudioParam getOrientationX();
    
    @JsProperty(name="orientationY")
    public native AudioParam getOrientationY();
    
    @JsProperty(name="orientationZ")
    public native AudioParam getOrientationZ();
    
    @JsProperty(name="refDistance")
    public native double getRefDistance();
    
    @JsProperty(name="refDistance")
    public native void setRefDistance(double refDistance);
    
    @JsProperty(name="maxDistance")
    public native double getMaxDistance();
    
    @JsProperty(name="maxDistance")
    public native void setMaxDistance(double maxDistance);
    
    @JsProperty(name="rolloffFactor")
    public native double getRolloffFactor();
    
    @JsProperty(name="rolloffFactor")
    public native void setRolloffFactor(double rolloffFactor);
    
    @JsProperty(name="coneInnerAngle")
    public native double getConeInnerAngle();
    
    @JsProperty(name="coneInnerAngle")
    public native void setConeInnerAngle(double coneInnerAngle);
    
    @JsProperty(name="coneOuterAngle")
    public native double getConeOuterAngle();
    
    @JsProperty(name="coneOuterAngle")
    public native void setConeOuterAngle(double coneOuterAngle);
    
    @JsProperty(name="coneOuterGain")
    public native double getConeOuterGain();
    
    @JsProperty(name="coneOuterGain")
    public native void setConeOuterGain(double coneOuterGain);
    
    @JsOverlay
    public final PanningModelType getPanningModel(){
       return PanningModelType.of(panningModel);
    }
    
    @JsOverlay
    public final void setPanningModel(PanningModelType panningModel){
       this.panningModel = panningModel.getInternalValue();
    }
    
    @JsOverlay
    public final DistanceModelType getDistanceModel(){
       return DistanceModelType.of(distanceModel);
    }
    
    @JsOverlay
    public final void setDistanceModel(DistanceModelType distanceModel){
       this.distanceModel = distanceModel.getInternalValue();
    }
    
    @JsMethod(name = "setOrientation")
    public native void setOrientation(double x, double y, double z);
    
    @JsMethod(name = "setPosition")
    public native void setPosition(double x, double y, double z);
    
}
