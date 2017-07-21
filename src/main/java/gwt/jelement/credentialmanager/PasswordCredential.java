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

import gwt.jelement.credentialmanager.Credential;
import gwt.jelement.dom.URLSearchParams;
import gwt.jelement.html.FormData;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PasswordCredential extends Credential{
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface CredentialBodyType {
        @JsOverlay
        default FormData asFormData(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default URLSearchParams asURLSearchParams(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isFormData(){
            return (Object) this instanceof FormData;
        }
    
        @JsOverlay
        default boolean isURLSearchParams(){
            return (Object) this instanceof URLSearchParams;
        }
    
    }
    
    @JsConstructor
    public PasswordCredential(){
        super();
    }
    
    @JsProperty(name="idName")
    public String idName;
    
    @JsProperty(name="passwordName")
    public String passwordName;
    
    @JsProperty(name="additionalData")
    public native PasswordCredential.CredentialBodyType getAdditionalData();
    
    @JsProperty(name="password")
    public native String getPassword();
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="iconURL")
    public native String getIconURL();
    
    @JsProperty(name="additionalData")
    public native void setAdditionalData(FormData additionalData);
    
    @JsProperty(name="additionalData")
    public native void setAdditionalData(URLSearchParams additionalData);
    
    
}