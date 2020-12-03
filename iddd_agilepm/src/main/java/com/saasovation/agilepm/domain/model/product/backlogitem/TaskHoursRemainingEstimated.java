//   Copyright 2012,2013 Vaughn Vernon
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.saasovation.agilepm.domain.model.product.backlogitem;

import java.util.Date;

import com.saasovation.agilepm.domain.model.tenant.TenantId;
import com.saasovation.common.domain.model.DomainEvent;

public class TaskHoursRemainingEstimated implements DomainEvent {

    private BacklogItemId backlogItemId;
    private int eventVersion;
    private int hoursRemaining;
    private Date occurredOn;
    private TaskId taskId;
    private TenantId tenantId;

    public TaskHoursRemainingEstimated(
            TenantId aTenantId,
            BacklogItemId aBacklogItemId,
            TaskId aTaskId,
            int aHoursRemaining) {

        super();

        this.backlogItemId = aBacklogItemId;
        this.eventVersion = 1;
        this.hoursRemaining = aHoursRemaining;
        this.occurredOn = new Date();
        this.taskId = aTaskId;
        this.tenantId = aTenantId;
    }

    public BacklogItemId backlogItemId() {
        return this.backlogItemId;
    }

    public int eventVersion() {
        return this.eventVersion;
    }

    public int hoursRemaining() {
        return this.hoursRemaining;
    }

    @Override
    public Date occurredOn() {
        return this.occurredOn;
    }

    public TaskId taskId() {
        return this.taskId;
    }

    public TenantId tenantId() {
        return this.tenantId;
    }
}
