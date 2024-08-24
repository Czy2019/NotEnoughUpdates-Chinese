/*
 * Copyright (C) 2022 NotEnoughUpdates contributors
 *
 * This file is part of NotEnoughUpdates.
 *
 * NotEnoughUpdates is free software: you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * NotEnoughUpdates is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with NotEnoughUpdates. If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Garden {
	@Expose
	@ConfigOption(
		name = "静音堆肥机",
		desc = "静音堆肥化的声音"
	)
	@ConfigEditorBoolean
	public boolean muteComposterSounds = false;

	@Expose
	@ConfigOption(
		name = "启用预设删除警告",
		desc = "删除预设时请求确认"
	)
	@ConfigEditorBoolean
	public boolean presetDeleteWarning = true;

	@Expose
	@ConfigOption(
		name = "喷雾器冷却时间",
		desc = "显示喷雾器的冷却时间"
	)
	@ConfigEditorBoolean
	public boolean sprayonatorCooldown = false;
}
