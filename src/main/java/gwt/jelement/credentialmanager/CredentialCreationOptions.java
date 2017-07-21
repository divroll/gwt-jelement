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
package gwt.jelement.credentialmanager;

import gwt.jelement.credentialmanager.FederatedCredentialInit;
import gwt.jelement.credentialmanager.PasswordCredentialData;
import gwt.jelement.html.HTMLFormElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class CredentialCreationOptions{

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface PasswordCredentialInit {
        @JsOverlay
        default PasswordCredentialData asPasswordCredentialData(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default HTMLFormElement asHTMLFormElement(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isPasswordCredentialData(){
            return (Object) this instanceof PasswordCredentialData;
        }
    
        @JsOverlay
        default boolean isHTMLFormElement(){
            return (Object) this instanceof HTMLFormElement;
        }
    
    }
    
    @JsProperty(name="password")
    public CredentialCreationOptions.PasswordCredentialInit password;

    @JsProperty(name="federated")
    public FederatedCredentialInit federated;


}