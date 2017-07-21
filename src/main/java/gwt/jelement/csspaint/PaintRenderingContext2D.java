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
package gwt.jelement.csspaint;

import gwt.jelement.canvas2d.CanvasFillRule;
import gwt.jelement.canvas2d.CanvasGradient;
import gwt.jelement.canvas2d.CanvasPattern;
import gwt.jelement.canvas2d.ImageSmoothingQuality;
import gwt.jelement.canvas2d.Path2D;
import gwt.jelement.css.cssom.CSSImageValue;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.svg.SVGImageElement;
import gwt.jelement.svg.SVGMatrix;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PaintRenderingContext2D{
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface StringOrCanvasGradientOrCanvasPatternUnionType {
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default CanvasGradient asCanvasGradient(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default CanvasPattern asCanvasPattern(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isCanvasGradient(){
            return (Object) this instanceof CanvasGradient;
        }
    
        @JsOverlay
        default boolean isCanvasPattern(){
            return (Object) this instanceof CanvasPattern;
        }
    
    }
    
    @JsProperty(name="currentTransform")
    public SVGMatrix currentTransform;
    
    @JsProperty(name="globalAlpha")
    public double globalAlpha;
    
    @JsProperty(name="globalCompositeOperation")
    public String globalCompositeOperation;
    
    @JsProperty(name="filter")
    public String filter;
    
    @JsProperty(name="imageSmoothingEnabled")
    public boolean imageSmoothingEnabled;
    
    @JsProperty(name="imageSmoothingQuality")
    public ImageSmoothingQuality imageSmoothingQuality;
    
    @JsProperty(name="shadowOffsetX")
    public double shadowOffsetX;
    
    @JsProperty(name="shadowOffsetY")
    public double shadowOffsetY;
    
    @JsProperty(name="shadowBlur")
    public double shadowBlur;
    
    @JsProperty(name="shadowColor")
    public String shadowColor;
    
    @JsProperty(name="lineWidth")
    public double lineWidth;
    
    @JsProperty(name="lineCap")
    public String lineCap;
    
    @JsProperty(name="lineJoin")
    public String lineJoin;
    
    @JsProperty(name="miterLimit")
    public double miterLimit;
    
    @JsProperty(name="lineDashOffset")
    public double lineDashOffset;
    
    @JsProperty(name="strokeStyle")
    public native PaintRenderingContext2D.StringOrCanvasGradientOrCanvasPatternUnionType getStrokeStyle();
    
    @JsProperty(name="fillStyle")
    public native PaintRenderingContext2D.StringOrCanvasGradientOrCanvasPatternUnionType getFillStyle();
    
    @JsProperty(name="strokeStyle")
    public native void setStrokeStyle(String strokeStyle);
    
    @JsProperty(name="strokeStyle")
    public native void setStrokeStyle(CanvasGradient strokeStyle);
    
    @JsProperty(name="strokeStyle")
    public native void setStrokeStyle(CanvasPattern strokeStyle);
    
    @JsProperty(name="fillStyle")
    public native void setFillStyle(String fillStyle);
    
    @JsProperty(name="fillStyle")
    public native void setFillStyle(CanvasGradient fillStyle);
    
    @JsProperty(name="fillStyle")
    public native void setFillStyle(CanvasPattern fillStyle);
    
    @JsMethod(name = "arc")
    public native void arc(float x, float y, float radius, float startAngle, float endAngle);
    
    @JsMethod(name = "arc")
    public native void arc(float x, float y, float radius, float startAngle, float endAngle, boolean anticlockwise);
    
    @JsMethod(name = "arcTo")
    public native void arcTo(float x1, float y1, float x2, float y2, float radius);
    
    @JsMethod(name = "beginPath")
    public native void beginPath();
    
    @JsMethod(name = "bezierCurveTo")
    public native void bezierCurveTo(float cp1x, float cp1y, float cp2x, float cp2y, float x, float y);
    
    @JsMethod(name = "clearRect")
    public native void clearRect(double x, double y, double width, double height);
    
    @JsMethod(name = "clip")
    public native void clip();
    
    @JsOverlay
    public void clip(CanvasFillRule winding){
        clip(winding.getInternalValue());
    }
    
    @JsMethod(name = "clip")
    public native void clip(Path2D path);
    
    @JsMethod(name = "clip")
    public native void clip(String winding);
    
    @JsOverlay
    public void clip(Path2D path, CanvasFillRule winding){
        clip(path, winding.getInternalValue());
    }
    
    @JsMethod(name = "clip")
    public native void clip(Path2D path, String winding);
    
    @JsMethod(name = "closePath")
    public native void closePath();
    
    @JsMethod(name = "createLinearGradient")
    public native CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(CSSImageValue image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(HTMLImageElement image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(SVGImageElement image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(HTMLVideoElement image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(HTMLCanvasElement image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(ImageBitmap image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(OffscreenCanvas image, String repetitionType);
    
    @JsMethod(name = "createRadialGradient")
    public native CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1, double y1, double r1);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(CSSImageValue image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLImageElement image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(SVGImageElement image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLVideoElement image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLCanvasElement image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(ImageBitmap image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(OffscreenCanvas image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(CSSImageValue image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLImageElement image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(SVGImageElement image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLVideoElement image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLCanvasElement image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(ImageBitmap image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(OffscreenCanvas image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(CSSImageValue image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLImageElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(SVGImageElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLVideoElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLCanvasElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(ImageBitmap image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(OffscreenCanvas image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "ellipse")
    public native void ellipse(float x, float y, float radiusX, float radiusY, float rotation, float startAngle, float endAngle);
    
    @JsMethod(name = "ellipse")
    public native void ellipse(float x, float y, float radiusX, float radiusY, float rotation, float startAngle, float endAngle, boolean anticlockwise);
    
    @JsMethod(name = "fill")
    public native void fill();
    
    @JsOverlay
    public void fill(CanvasFillRule winding){
        fill(winding.getInternalValue());
    }
    
    @JsMethod(name = "fill")
    public native void fill(Path2D path);
    
    @JsMethod(name = "fill")
    public native void fill(String winding);
    
    @JsOverlay
    public void fill(Path2D path, CanvasFillRule winding){
        fill(path, winding.getInternalValue());
    }
    
    @JsMethod(name = "fill")
    public native void fill(Path2D path, String winding);
    
    @JsMethod(name = "fillRect")
    public native void fillRect(double x, double y, double width, double height);
    
    @JsMethod(name = "getLineDash")
    public native double[] getLineDash();
    
    @JsMethod(name = "isPointInPath")
    public native boolean isPointInPath(double x, double y);
    
    @JsOverlay
    public boolean isPointInPath(double x, double y, CanvasFillRule winding){
        return isPointInPath(x, y, winding.getInternalValue());
    }
    
    @JsMethod(name = "isPointInPath")
    public native boolean isPointInPath(Path2D path, double x, double y);
    
    @JsMethod(name = "isPointInPath")
    public native boolean isPointInPath(double x, double y, String winding);
    
    @JsOverlay
    public boolean isPointInPath(Path2D path, double x, double y, CanvasFillRule winding){
        return isPointInPath(path, x, y, winding.getInternalValue());
    }
    
    @JsMethod(name = "isPointInPath")
    public native boolean isPointInPath(Path2D path, double x, double y, String winding);
    
    @JsMethod(name = "isPointInStroke")
    public native boolean isPointInStroke(double x, double y);
    
    @JsMethod(name = "isPointInStroke")
    public native boolean isPointInStroke(Path2D path, double x, double y);
    
    @JsMethod(name = "lineTo")
    public native void lineTo(float x, float y);
    
    @JsMethod(name = "moveTo")
    public native void moveTo(float x, float y);
    
    @JsMethod(name = "quadraticCurveTo")
    public native void quadraticCurveTo(float cpx, float cpy, float x, float y);
    
    @JsMethod(name = "rect")
    public native void rect(float x, float y, float width, float height);
    
    @JsMethod(name = "resetTransform")
    public native void resetTransform();
    
    @JsMethod(name = "restore")
    public native void restore();
    
    @JsMethod(name = "rotate")
    public native void rotate(double angle);
    
    @JsMethod(name = "save")
    public native void save();
    
    @JsMethod(name = "scale")
    public native void scale(double x, double y);
    
    @JsMethod(name = "setLineDash")
    public native void setLineDash(double[] dash);
    
    @JsMethod(name = "setTransform")
    public native void setTransform(double a, double b, double c, double d, double e, double f);
    
    @JsMethod(name = "stroke")
    public native void stroke();
    
    @JsMethod(name = "stroke")
    public native void stroke(Path2D path);
    
    @JsMethod(name = "strokeRect")
    public native void strokeRect(double x, double y, double width, double height);
    
    @JsMethod(name = "transform")
    public native void transform(double a, double b, double c, double d, double e, double f);
    
    @JsMethod(name = "translate")
    public native void translate(double x, double y);
    
}