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

package com.blurengine.blur.events.players;

import com.google.common.base.Preconditions;

import com.blurengine.blur.session.BlurPlayer;
import com.blurengine.blur.session.BlurSession;

import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import javax.annotation.Nonnull;

/**
 * Represents a {@link BlurPlayerEvent} fired before a {@link BlurPlayer} joins a {@link BlurSession}.
 */
public class PlayerPreJoinSessionEvent extends BlurPlayerEvent implements Cancellable {

    public PlayerPreJoinSessionEvent(@Nonnull BlurPlayer blurPlayer, @Nonnull BlurSession session) {
        super(Preconditions.checkNotNull(blurPlayer, "blurPlayer cannot be null."), session);
    }

    private boolean cancelled;

    @Override
    public boolean isCancelled() { return cancelled; }

    @Override
    public void setCancelled(boolean cancelled) { this.cancelled = cancelled; }

    private static final HandlerList handlerList = new HandlerList();

    @Override
    public HandlerList getHandlers() { return handlerList; }

    public static HandlerList getHandlerList() { return handlerList; }
}
