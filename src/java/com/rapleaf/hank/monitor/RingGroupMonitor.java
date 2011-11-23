/**
 *  Copyright 2011 Rapleaf
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.rapleaf.hank.monitor;

import com.rapleaf.hank.coordinator.Ring;
import com.rapleaf.hank.coordinator.RingGroup;
import com.rapleaf.hank.monitor.notifier.Notifier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class RingGroupMonitor {

  private final RingGroup ringGroup;
  private final Notifier notifier;
  private Collection<RingMonitor> ringMonitors = new ArrayList<RingMonitor>();

  public RingGroupMonitor(RingGroup ringGroup,
                          Notifier notifier) throws IOException {
    this.notifier = notifier;
    this.ringGroup = ringGroup;
    for (Ring ring : ringGroup.getRings()) {
      ringMonitors.add(new RingMonitor(ring, notifier));
    }
  }

  public void stop() {
    for (RingMonitor ringMonitor : ringMonitors) {
      ringMonitor.stop();
    }
  }
}