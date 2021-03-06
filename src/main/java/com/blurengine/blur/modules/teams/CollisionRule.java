/*
 * Copyright 2017 Ali Moghnieh
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

package com.blurengine.blur.modules.teams;

import org.bukkit.scoreboard.Team.OptionStatus;

/**
 * Represents a collision rules for handling team entity collisions.
 */
public enum CollisionRule {
    EVERYONE(OptionStatus.ALWAYS), NOONE(OptionStatus.NEVER), ALLIES(OptionStatus.FOR_OTHER_TEAMS),
    ENEMIES(OptionStatus.FOR_OWN_TEAM);
    private final OptionStatus bukkit;

    CollisionRule(OptionStatus bukkit) {
        this.bukkit = bukkit;
    }

    public OptionStatus getBukkit() {
        return bukkit;
    }
}
