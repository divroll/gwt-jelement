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
package gwt.jelement.peerconnection;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.html.VoidCallback;
import gwt.jelement.mediastream.MediaStream;
import gwt.jelement.mediastream.MediaStreamTrack;
import gwt.jelement.peerconnection.RTCAnswerOptions;
import gwt.jelement.peerconnection.RTCCertificate;
import gwt.jelement.peerconnection.RTCConfiguration;
import gwt.jelement.peerconnection.RTCDTMFSender;
import gwt.jelement.peerconnection.RTCDataChannel;
import gwt.jelement.peerconnection.RTCDataChannelInit;
import gwt.jelement.peerconnection.RTCIceCandidate;
import gwt.jelement.peerconnection.RTCIceCandidateInit;
import gwt.jelement.peerconnection.RTCIceConnectionState;
import gwt.jelement.peerconnection.RTCIceGatheringState;
import gwt.jelement.peerconnection.RTCOfferOptions;
import gwt.jelement.peerconnection.RTCPeerConnectionErrorCallback;
import gwt.jelement.peerconnection.RTCRtpReceiver;
import gwt.jelement.peerconnection.RTCRtpSender;
import gwt.jelement.peerconnection.RTCSessionDescription;
import gwt.jelement.peerconnection.RTCSessionDescriptionCallback;
import gwt.jelement.peerconnection.RTCSessionDescriptionInit;
import gwt.jelement.peerconnection.RTCSignalingState;
import gwt.jelement.peerconnection.RTCStatsCallback;
import gwt.jelement.peerconnection.RTCStatsReport;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class RTCPeerConnection extends EventTarget{
    
    @JsConstructor
    public RTCPeerConnection(){
        super();
    }
    
    @JsProperty(name="onnegotiationneeded")
    public EventHandlerNonNull onnegotiationneeded;
    
    @JsProperty(name="onicecandidate")
    public EventHandlerNonNull onicecandidate;
    
    @JsProperty(name="onsignalingstatechange")
    public EventHandlerNonNull onsignalingstatechange;
    
    @JsProperty(name="oniceconnectionstatechange")
    public EventHandlerNonNull oniceconnectionstatechange;
    
    @JsProperty(name="onicegatheringstatechange")
    public EventHandlerNonNull onicegatheringstatechange;
    
    @JsProperty(name="ondatachannel")
    public EventHandlerNonNull ondatachannel;
    
    @JsProperty(name="onaddstream")
    public EventHandlerNonNull onaddstream;
    
    @JsProperty(name="onremovestream")
    public EventHandlerNonNull onremovestream;
    
    @JsProperty(name="localDescription")
    public native RTCSessionDescription getLocalDescription();
    
    @JsProperty(name="remoteDescription")
    public native RTCSessionDescription getRemoteDescription();
    
    @JsOverlay
    public  RTCSignalingState getSignalingStateAsRTCSignalingState(){
        return RTCSignalingState.of(getSignalingState());
    }
    
    @JsProperty(name="signalingState")
    public native String getSignalingState();
    
    @JsOverlay
    public  RTCIceGatheringState getIceGatheringStateAsRTCIceGatheringState(){
        return RTCIceGatheringState.of(getIceGatheringState());
    }
    
    @JsProperty(name="iceGatheringState")
    public native String getIceGatheringState();
    
    @JsOverlay
    public  RTCIceConnectionState getIceConnectionStateAsRTCIceConnectionState(){
        return RTCIceConnectionState.of(getIceConnectionState());
    }
    
    @JsProperty(name="iceConnectionState")
    public native String getIceConnectionState();
    
    @JsMethod(name = "addIceCandidate")
    public native Promise<Void> addIceCandidate(RTCIceCandidateInit candidate);
    
    @JsMethod(name = "addIceCandidate")
    public native Promise<Void> addIceCandidate(RTCIceCandidate candidate);
    
    @JsMethod(name = "addIceCandidate")
    public native Promise<Void> addIceCandidate(RTCIceCandidateInit candidate, VoidCallback successCallback, RTCPeerConnectionErrorCallback failureCallback);
    
    @JsMethod(name = "addIceCandidate")
    public native Promise<Void> addIceCandidate(RTCIceCandidate candidate, VoidCallback successCallback, RTCPeerConnectionErrorCallback failureCallback);
    
    @JsMethod(name = "addStream")
    public native void addStream(MediaStream stream);
    
    @JsMethod(name = "addStream")
    public native void addStream(MediaStream stream, Object mediaConstraints);
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "createAnswer")
    public native Promise<RTCSessionDescription> createAnswer();
    
    @JsMethod(name = "createAnswer")
    public native Promise<RTCSessionDescription> createAnswer(RTCAnswerOptions options);
    
    @JsMethod(name = "createAnswer")
    public native Promise<Void> createAnswer(RTCSessionDescriptionCallback successCallback, RTCPeerConnectionErrorCallback failureCallback);
    
    @JsMethod(name = "createAnswer")
    public native Promise<Void> createAnswer(RTCSessionDescriptionCallback successCallback, RTCPeerConnectionErrorCallback failureCallback, Object mediaConstraints);
    
    @JsMethod(name = "createDTMFSender")
    public native RTCDTMFSender createDTMFSender(MediaStreamTrack track);
    
    @JsMethod(name = "createDataChannel")
    public native RTCDataChannel createDataChannel(String label);
    
    @JsMethod(name = "createDataChannel")
    public native RTCDataChannel createDataChannel(String label, RTCDataChannelInit dataChannelDict);
    
    @JsMethod(name = "createOffer")
    public native Promise<RTCSessionDescription> createOffer();
    
    @JsMethod(name = "createOffer")
    public native Promise<RTCSessionDescription> createOffer(RTCOfferOptions options);
    
    @JsMethod(name = "createOffer")
    public native Promise<Void> createOffer(RTCSessionDescriptionCallback successCallback, RTCPeerConnectionErrorCallback failureCallback);
    
    @JsMethod(name = "createOffer")
    public native Promise<Void> createOffer(RTCSessionDescriptionCallback successCallback, RTCPeerConnectionErrorCallback failureCallback, Object rtcOfferOptions);
    
    @JsMethod(name = "generateCertificate")
    public native Promise<RTCCertificate> generateCertificate(Object keygenAlgorithm);
    
    @JsMethod(name = "generateCertificate")
    public native Promise<RTCCertificate> generateCertificate(String keygenAlgorithm);
    
    @JsMethod(name = "getLocalStreams")
    public native MediaStream[] getLocalStreams();
    
    @JsMethod(name = "getReceivers")
    public native RTCRtpReceiver[] getReceivers();
    
    @JsMethod(name = "getRemoteStreams")
    public native MediaStream[] getRemoteStreams();
    
    @JsMethod(name = "getSenders")
    public native RTCRtpSender[] getSenders();
    
    @JsMethod(name = "getStats")
    public native Promise<RTCStatsReport> getStats();
    
    @JsMethod(name = "getStats")
    public native Promise<Void> getStats(RTCStatsCallback successCallback);
    
    @JsMethod(name = "getStats")
    public native Promise<Void> getStats(RTCStatsCallback successCallback, MediaStreamTrack selector);
    
    @JsMethod(name = "getStreamById")
    public native MediaStream getStreamById(String streamId);
    
    @JsMethod(name = "removeStream")
    public native void removeStream(MediaStream stream);
    
    @JsMethod(name = "setConfiguration")
    public native void setConfiguration(RTCConfiguration configuration);
    
    @JsMethod(name = "setLocalDescription")
    public native Promise<Void> setLocalDescription(RTCSessionDescriptionInit description);
    
    @JsMethod(name = "setLocalDescription")
    public native Promise<Void> setLocalDescription(RTCSessionDescriptionInit description, VoidCallback successCallback);
    
    @JsMethod(name = "setLocalDescription")
    public native Promise<Void> setLocalDescription(RTCSessionDescriptionInit description, VoidCallback successCallback, RTCPeerConnectionErrorCallback failureCallback);
    
    @JsMethod(name = "setRemoteDescription")
    public native Promise<Void> setRemoteDescription(RTCSessionDescriptionInit description);
    
    @JsMethod(name = "setRemoteDescription")
    public native Promise<Void> setRemoteDescription(RTCSessionDescriptionInit description, VoidCallback successCallback);
    
    @JsMethod(name = "setRemoteDescription")
    public native Promise<Void> setRemoteDescription(RTCSessionDescriptionInit description, VoidCallback successCallback, RTCPeerConnectionErrorCallback failureCallback);
    
}