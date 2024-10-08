/*
 * Copyright 2023 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.centraldogma.server.mirror;

import com.linecorp.armeria.common.annotation.Nullable;

/**
 * Creates a new {@link Mirror} dynamically via Java SPI (Service Provider Interface).
 */
@FunctionalInterface
public interface MirrorProvider {

    /**
     * Returns a new {@link Mirror} if this {@link MirrorProvider} can create a {@link Mirror} using
     * the specified {@link MirrorContext}. Otherwise, {@code null} will be returned.
     */
    @Nullable
    Mirror newMirror(MirrorContext context);
}
