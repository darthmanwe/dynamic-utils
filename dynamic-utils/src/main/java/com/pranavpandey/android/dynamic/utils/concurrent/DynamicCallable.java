/*
 * Copyright 2017-2020 Pranav Pandey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pranavpandey.android.dynamic.utils.concurrent;

import androidx.annotation.Nullable;

import java.util.concurrent.Callable;

/**
 * Base class to implement the {@link Callable} with parameters.
 */
public abstract class DynamicCallable<Params, Result> implements Callable<Result> {

    /**
     * Parameters associated with this class.
     */
    private Params mParams;

    /**
     * Get the parameters associated with this class.
     *
     * @return The parameters associated with this class.
     */
    public @Nullable Params getParams() {
        return mParams;
    }

    /**
     * Set the parameters associated for this class.
     *
     * @param params The parameters for this class.
     */
    public void setParams(@Nullable Params params) {
        this.mParams = params;
    }
}