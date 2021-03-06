/*
 * Copyright 2016 Ali Moghnieh
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

package com.blurengine.blur.modules.controlpoints;

import com.google.common.base.Preconditions;

import com.blurengine.blur.events.players.BlurPlayerEvent;
import com.blurengine.blur.session.BlurPlayer;

import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

public class ControlPointEnterEvent extends BlurPlayerEvent {

    private final ControlPoint controlPoint;

    public ControlPointEnterEvent(BlurPlayer blurPlayer, @Nonnull ControlPoint controlPoint) {
        super(blurPlayer);
        this.controlPoint = Preconditions.checkNotNull(controlPoint, "controlPoint cannot be null.");
    }

    @Nonnull
    public ControlPoint getControlPoint() {
        return controlPoint;
    }

    private static final HandlerList handlerList = new HandlerList();

    @Override
    public HandlerList getHandlers() { return handlerList; }

    public static HandlerList getHandlerList() { return handlerList; }
}
