/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License. 
 */

package com.ait.lienzo.client.core.shape.toolbox;

import com.ait.lienzo.test.LienzoMockitoTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(LienzoMockitoTestRunner.class)
public class ToolboxVisibilityExecutorsTest {

    @Test
    public void testAnimationDelay() {
        assertEquals(Double.valueOf(0d), Double.valueOf(ToolboxVisibilityExecutors.ANIMATION_ALPHA_DELAY_MILLIS));
        assertEquals(Double.valueOf(0d), Double.valueOf(ToolboxVisibilityExecutors.ANIMATION_SCALE_DELAY_MILLIS));
    }
}
