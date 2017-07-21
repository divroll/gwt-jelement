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
package gwt.jelement.workers;

import gwt.jelement.cachestorage.CacheStorage;
import gwt.jelement.crypto.Crypto;
import gwt.jelement.dom.AddressSpace;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fetch.Request;
import gwt.jelement.fetch.Response;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.imagebitmap.ImageBitmapOptions;
import gwt.jelement.indexeddb.IDBFactory;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.svg.SVGImageElement;
import gwt.jelement.timing.WorkerPerformance;
import gwt.jelement.workers.WorkerGlobalScope;
import gwt.jelement.workers.WorkerLocation;
import gwt.jelement.workers.WorkerNavigator;
import elemental2.core.Function;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WorkerGlobalScope extends EventTarget{
    
    @JsConstructor
    public WorkerGlobalScope(){
        super();
    }
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onrejectionhandled")
    public EventHandlerNonNull onrejectionhandled;
    
    @JsProperty(name="onunhandledrejection")
    public EventHandlerNonNull onunhandledrejection;
    
    @JsProperty(name="self")
    public native WorkerGlobalScope getSelf();
    
    @JsProperty(name="location")
    public native WorkerLocation getLocation();
    
    @JsProperty(name="navigator")
    public native WorkerNavigator getNavigator();
    
    @JsOverlay
    public  AddressSpace getAddressSpaceAsAddressSpace(){
        return AddressSpace.of(getAddressSpace());
    }
    
    @JsProperty(name="addressSpace")
    public native String getAddressSpace();
    
    @JsProperty(name="isSecureContext")
    public native boolean getIsSecureContext();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="caches")
    public native CacheStorage getCaches();
    
    @JsProperty(name="crypto")
    public native Crypto getCrypto();
    
    @JsProperty(name="indexedDB")
    public native IDBFactory getIndexedDB();
    
    @JsProperty(name="performance")
    public native WorkerPerformance getPerformance();
    
    @JsMethod(name = "atob")
    public native String atob(String atob);
    
    @JsMethod(name = "btoa")
    public native String btoa(String btoa);
    
    @JsMethod(name = "clearInterval")
    public native void clearInterval();
    
    @JsMethod(name = "clearInterval")
    public native void clearInterval(long handle);
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout();
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout(long handle);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, long sx, long sy, long sw, long sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, long sx, long sy, long sw, long sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, long sx, long sy, long sw, long sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, long sx, long sy, long sw, long sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, long sx, long sy, long sw, long sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, long sx, long sy, long sw, long sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, long sx, long sy, long sw, long sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, long sx, long sy, long sw, long sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, long sx, long sy, long sw, long sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, long sx, long sy, long sw, long sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, long sx, long sy, long sw, long sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, long sx, long sy, long sw, long sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, long sx, long sy, long sw, long sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, long sx, long sy, long sw, long sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, long sx, long sy, long sw, long sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, long sx, long sy, long sw, long sh, ImageBitmapOptions options);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input, Object init);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input, Object init);
    
    @JsMethod(name = "importScripts")
    public native void importScripts(String urls);
    
    @JsMethod(name = "setInterval")
    public native long setInterval(Function handler);
    
    @JsMethod(name = "setInterval")
    public native long setInterval(String handler);
    
    @JsMethod(name = "setInterval")
    public native long setInterval(Function handler, long timeout, Any arguments);
    
    @JsMethod(name = "setInterval")
    public native long setInterval(String handler, long timeout, Any arguments);
    
    @JsMethod(name = "setTimeout")
    public native long setTimeout(Function handler);
    
    @JsMethod(name = "setTimeout")
    public native long setTimeout(String handler);
    
    @JsMethod(name = "setTimeout")
    public native long setTimeout(Function handler, long timeout, Any arguments);
    
    @JsMethod(name = "setTimeout")
    public native long setTimeout(String handler, long timeout, Any arguments);
    
}