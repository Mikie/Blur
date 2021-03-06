/*
 * Copyright 2016 Ali Moghnieh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.blurengine.blur.framework;

import com.supaham.commons.utils.StringUtils;

import java.util.Collection;
import java.util.stream.Collectors;

class ModuleNameHelper {

    public static Collection<String> getSimilarModuleNames(String name) {
        return getSimilarModuleNames(name, 3);
    }

    public static Collection<String> getSimilarModuleNames(String name, int levenshteinDistance) {
        return ModuleLoader.getModuleInfos().stream()
            .filter(info -> StringUtils.getLevenshteinDistance(name, info.name()) <= levenshteinDistance)
            .map(ModuleInfo::name).collect(Collectors.toList());
    }
}
