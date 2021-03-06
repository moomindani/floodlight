/**
 *    Copyright 2013, Big Switch Networks, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License"); you may
 *    not use this file except in compliance with the License. You may obtain
 *    a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *    License for the specific language governing permissions and limitations
 *    under the License.
 **/

package net.floodlightcontroller.flowcache;

import net.floodlightcontroller.flowcache.PriorityPendingQueue.EventPriority;

/**
 * The Class PendingSwitchResp. This object is used to track the pending
 * responses to switch flow table queries.
 */
public class PendingSwitchResp {
    protected boolean requeryType;
    protected EventPriority priority;

    public PendingSwitchResp(
            boolean requeryType, EventPriority priority) {
        this.requeryType = requeryType;
        this.priority = priority;
    }
    
    public boolean getRequeryType() {
        return requeryType;
    }

    public void setRequeryType(boolean requeryType) {
        this.requeryType = requeryType;
    }
    public EventPriority getEventPriority() {
        return priority;
    }
}
