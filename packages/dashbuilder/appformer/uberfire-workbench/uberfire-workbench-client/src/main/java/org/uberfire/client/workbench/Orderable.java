/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.client.workbench;

public interface Orderable {

    /**
     * Returns the unique identifier of this widget. This ID is used when specifying which headers and footers to retain
     * when running the workbench in standalone (embedded) mode.
     * @return a unique identifier for this widget
     */
    String getId();

    /**
     * Returns the stacking order of this header or footer.
     * @return the order this header should be stacked in (higher numbers closer to the top of the screen).
     */
    int getOrder();
}
