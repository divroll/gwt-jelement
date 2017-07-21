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

import gwt.jelement.dom.MessagePort;
import gwt.jelement.events.EventInit;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MessageEventInit extends EventInit{

    @JsProperty(name="data")
    public Any data;

    @JsProperty(name="origin")
    public String origin;

    @JsProperty(name="lastEventId")
    public String lastEventId;

    @JsProperty(name="source")
    public EventTarget source;

    @JsProperty(name="ports")
    public MessagePort[] ports;


}
