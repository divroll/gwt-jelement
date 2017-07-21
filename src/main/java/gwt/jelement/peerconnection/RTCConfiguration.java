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

import gwt.jelement.peerconnection.RTCBundlePolicy;
import gwt.jelement.peerconnection.RTCCertificate;
import gwt.jelement.peerconnection.RTCIceServer;
import gwt.jelement.peerconnection.RTCIceTransportPolicy;
import gwt.jelement.peerconnection.RTCRtcpMuxPolicy;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class RTCConfiguration{

    @JsProperty(name="iceServers")
    public RTCIceServer[] iceServers;

    @JsProperty(name="iceTransportPolicy")
    public RTCIceTransportPolicy iceTransportPolicy;

    @JsProperty(name="iceTransports")
    public RTCIceTransportPolicy iceTransports;

    @JsProperty(name="bundlePolicy")
    public RTCBundlePolicy bundlePolicy = RTCBundlePolicy.of("balanced");

    @JsProperty(name="rtcpMuxPolicy")
    public RTCRtcpMuxPolicy rtcpMuxPolicy = RTCRtcpMuxPolicy.of("require");

    @JsProperty(name="certificates")
    public RTCCertificate[] certificates;

    @JsProperty(name="iceCandidatePoolSize")
    public byte iceCandidatePoolSize = 0;


}