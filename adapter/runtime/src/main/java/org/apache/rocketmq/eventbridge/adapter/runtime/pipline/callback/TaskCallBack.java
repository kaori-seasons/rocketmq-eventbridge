/*
 * Copyright 2023 AntGroup CO., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package org.apache.rocketmq.eventbridge.adapter.runtime.pipline.callback;

public class TaskCallBack {

    private ICallbackFunction callbackFunction;

    public void addCallBack(ICallbackFunction callbackFunction) {
        this.callbackFunction = callbackFunction;
    }

    public ICallbackFunction getCallbackFunction() {
        return callbackFunction;
    }
}
