/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.siddhi.core.table.holder;

import org.wso2.siddhi.core.event.stream.StreamEvent;
import org.wso2.siddhi.query.api.expression.condition.Compare;

import java.util.Set;

public interface IndexedEventHolder extends EventHolder {

    boolean isAttributeIndexed(String attribute);

    boolean isSupportedIndex(String attribute, Compare.Operator operator);

    Set<StreamEvent> getAllEventSet();

    Set<StreamEvent> findEventSet(String attribute, Compare.Operator operator, Object value);

    void deleteAll();

    void deleteAll(Set<StreamEvent> candidateEventSet);

    void delete(String attribute, Compare.Operator operator, Object value);
}