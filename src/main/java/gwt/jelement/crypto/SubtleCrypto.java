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
package gwt.jelement.crypto;

import gwt.jelement.core.Array;
import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.JsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SubtleCrypto", isNative = true)
public class SubtleCrypto implements IsObject {
    @JsMethod(name = "decrypt")
    public native Promise decrypt(JsObject algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "decrypt")
    public native Promise decrypt(JsObject algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "decrypt")
    public native Promise decrypt(String algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "decrypt")
    public native Promise decrypt(String algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "deriveBits")
    public native Promise deriveBits(JsObject algorithm, CryptoKey baseKey, double length);
    
    @JsMethod(name = "deriveBits")
    public native Promise deriveBits(String algorithm, CryptoKey baseKey, double length);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(JsObject algorithm, CryptoKey baseKey, JsObject derivedKeyType, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(JsObject algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(String algorithm, CryptoKey baseKey, JsObject derivedKeyType, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(String algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(JsObject algorithm, CryptoKey baseKey, JsObject derivedKeyType, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(JsObject algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(String algorithm, CryptoKey baseKey, JsObject derivedKeyType, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(String algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "digest")
    public native Promise digest(JsObject algorithm, ArrayBuffer data);
    
    @JsMethod(name = "digest")
    public native Promise digest(JsObject algorithm, ArrayBufferView data);
    
    @JsMethod(name = "digest")
    public native Promise digest(String algorithm, ArrayBuffer data);
    
    @JsMethod(name = "digest")
    public native Promise digest(String algorithm, ArrayBufferView data);
    
    @JsMethod(name = "encrypt")
    public native Promise encrypt(JsObject algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "encrypt")
    public native Promise encrypt(JsObject algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "encrypt")
    public native Promise encrypt(String algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "encrypt")
    public native Promise encrypt(String algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "exportKey")
    public native Promise exportKey(String format, CryptoKey key);
    
    @JsMethod(name = "generateKey")
    public native Promise generateKey(JsObject algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "generateKey")
    public native Promise generateKey(String algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "generateKey")
    public native Promise generateKey(JsObject algorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "generateKey")
    public native Promise generateKey(String algorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBuffer keyData, JsObject algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBuffer keyData, String algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBufferView keyData, JsObject algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBufferView keyData, String algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, JsObject keyData, JsObject algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, JsObject keyData, String algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBuffer keyData, JsObject algorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBuffer keyData, String algorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBufferView keyData, JsObject algorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBufferView keyData, String algorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, JsObject keyData, JsObject algorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, JsObject keyData, String algorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "sign")
    public native Promise sign(JsObject algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "sign")
    public native Promise sign(JsObject algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "sign")
    public native Promise sign(String algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "sign")
    public native Promise sign(String algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, JsObject unwrapAlgorithm, JsObject unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, JsObject unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, JsObject unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, JsObject unwrapAlgorithm, JsObject unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, JsObject unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, JsObject unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, JsObject unwrapAlgorithm, JsObject unwrappedKeyAlgorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, JsObject unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, JsObject unwrappedKeyAlgorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, JsObject unwrapAlgorithm, JsObject unwrappedKeyAlgorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, JsObject unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, JsObject unwrappedKeyAlgorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, Array keyUsages);
    
    @JsMethod(name = "verify")
    public native Promise verify(JsObject algorithm, CryptoKey key, ArrayBuffer signature, ArrayBuffer data);
    
    @JsMethod(name = "verify")
    public native Promise verify(JsObject algorithm, CryptoKey key, ArrayBuffer signature, ArrayBufferView data);
    
    @JsMethod(name = "verify")
    public native Promise verify(JsObject algorithm, CryptoKey key, ArrayBufferView signature, ArrayBuffer data);
    
    @JsMethod(name = "verify")
    public native Promise verify(JsObject algorithm, CryptoKey key, ArrayBufferView signature, ArrayBufferView data);
    
    @JsMethod(name = "verify")
    public native Promise verify(String algorithm, CryptoKey key, ArrayBuffer signature, ArrayBuffer data);
    
    @JsMethod(name = "verify")
    public native Promise verify(String algorithm, CryptoKey key, ArrayBuffer signature, ArrayBufferView data);
    
    @JsMethod(name = "verify")
    public native Promise verify(String algorithm, CryptoKey key, ArrayBufferView signature, ArrayBuffer data);
    
    @JsMethod(name = "verify")
    public native Promise verify(String algorithm, CryptoKey key, ArrayBufferView signature, ArrayBufferView data);
    
    @JsMethod(name = "wrapKey")
    public native Promise wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, JsObject wrapAlgorithm);
    
    @JsMethod(name = "wrapKey")
    public native Promise wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, String wrapAlgorithm);
    
}
