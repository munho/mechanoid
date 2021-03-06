/*
 * Copyright 2013 Robotoworks Limited
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.robotoworks.mechanoid.net;

import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class NetLogHelper {
    private NetLogHelper() {}

    public static void logProperties(Method methodI, String tag, Map<String, List<String>> properties) {
        for (String key : properties.keySet()) {
            if (methodI != null) {
                try {
                    methodI.invoke(null, tag, key + " " + properties.get(key).toString());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } else {
                Log.d(tag, key + " " + properties.get(key).toString());
            }
        }
    }
}
