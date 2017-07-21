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
package gwt.jelement.dom;

import java.util.Arrays;

public enum NativeScrollBehavior{
    DISABLE_NATIVE_SCROLL("disable-native-scroll"),
    PERFORM_BEFORE_NATIVE_SCROLL("perform-before-native-scroll"),
    PERFORM_AFTER_NATIVE_SCROLL("perform-after-native-scroll");

    private String internalValue;

    NativeScrollBehavior(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static NativeScrollBehavior of(String value){
        switch(value){
            case "disable-native-scroll":
                return DISABLE_NATIVE_SCROLL;
            case "perform-before-native-scroll":
                return PERFORM_BEFORE_NATIVE_SCROLL;
            case "perform-after-native-scroll":
                return PERFORM_AFTER_NATIVE_SCROLL;
            default:
                return null;
        }
    }

    public static NativeScrollBehavior[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(NativeScrollBehavior::of)
                .toArray(NativeScrollBehavior[]::new);
    }

}
