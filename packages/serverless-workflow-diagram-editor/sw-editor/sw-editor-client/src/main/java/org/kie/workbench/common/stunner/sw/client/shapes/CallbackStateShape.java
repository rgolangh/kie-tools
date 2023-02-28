/*
 * Copyright 2023 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.workbench.common.stunner.sw.client.shapes;

import org.appformer.kogito.bridge.client.resource.ResourceContentService;
import org.kie.workbench.common.stunner.core.client.shape.MutationContext;
import org.kie.workbench.common.stunner.core.graph.Edge;
import org.kie.workbench.common.stunner.core.graph.Node;
import org.kie.workbench.common.stunner.core.graph.content.view.View;
import org.kie.workbench.common.stunner.sw.client.shapes.icons.CornerIcon;
import org.kie.workbench.common.stunner.sw.client.shapes.icons.IconPath;
import org.kie.workbench.common.stunner.sw.client.shapes.icons.IconPosition;
import org.kie.workbench.common.stunner.sw.definition.CallbackState;
import org.kie.workbench.common.stunner.sw.definition.State;

public class CallbackStateShape extends StateShape {

    public static final String ICON_COLOR = "#EC7A08";
    public static final String ICON_SVG = "M63.97,36.13c0-2.13-1.64-3.95-3.76-4.07-2.31-.13-4.23,1.7-4.23,3.99,0,6.61-5.37,11.98-11.98,11.98H24.03v-4.99c0-1.18-.7-2.25-1.78-2.74-1.08-.47-2.34-.28-3.23,.52l-9.98,8.98c-.63,.56-.99,1.37-.99,2.22s.36,1.66,.99,2.23l9.98,8.98c.56,.51,1.28,.77,2,.77,.41,0,.83-.09,1.22-.26,1.08-.48,1.78-1.55,1.78-2.74v-4.99h19.97c10.98,0,19.92-8.91,19.97-19.89ZM20,16.08h19.85l.11,4.99c0,1.18,.7,2.25,1.78,2.74,.4,.17,.81,.26,1.11,.26,.73,0,1.44-.27,2.01-.77l9.98-8.98c.74-.57,1.1-1.38,1.1-2.34s-.36-1.66-.99-2.23L44.97,.76c-.88-.79-2.15-.98-3.22-.51-1.08,.6-1.89,1.67-1.89,2.85l.11,4.99H20C8.99,8.09,.03,17.05,.03,28.06c0,2.21,1.79,3.99,3.99,3.99s3.99-1.79,3.99-3.99c0-6.6,5.38-11.98,11.98-11.98Z";

    public CallbackStateShape(State state, ResourceContentService resourceContentService) {
        super(state, resourceContentService);
    }

    @Override
    public void applyProperties(Node<View<State>, Edge> element, MutationContext mutationContext) {
        super.applyProperties(element, mutationContext);
        CallbackState state = (CallbackState) element.getContent().getDefinition();
        if (state.getTimeouts() != null) {
            getView().addChild(new CornerIcon(IconPath.CLOCK,
                                              IconPosition.LEFT_FROM_RIGHT_TOP_CORNER,
                                              "EventTimeout: " + state.getTimeouts().getEventTimeout() + "\r\n"
                                                      + "StateExecTimeout: " + state.getTimeouts().getStateExecTimeout() + "\r\n"
                                                      + "ActionExecTimeout: " + state.getTimeouts().getActionExecTimeout()));
        }

        getView().addChild(new CornerIcon(IconPath.SERVICE,
                                          IconPosition.RIGHT_TOP_CORNER,
                                          HasAction.getActionString(state.getAction())));
    }

    @Override
    public String getIconColor() {
        return ICON_COLOR;
    }

    @Override
    public String getIconSvg() {
        return ICON_SVG;
    }
}
