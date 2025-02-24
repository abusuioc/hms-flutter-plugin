/*
 * Copyright 2020-2022. Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.hms.flutter.health.foundation.listener;

/**
 * Base Result Listener.
 *
 * @param <T>
 * @since v.5.0.5
 */
public interface ResultListener<T> {
    /**
     * Presents the success scenario.
     *
     * @param result Health Result instance.
     */
    void onSuccess(T result);

    /**
     * Presents the failure scenario, Exception instance is returned.
     *
     * @param exception Exception instance.
     */
    void onFail(Exception exception);
}
