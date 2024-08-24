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
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class ImprovedSBMenu {
	@Expose
	@ConfigOption(
		name = "启用改进的 SB 菜单",
		desc = "更改 SkyBlock 菜单（例如 /sbmenu）的外观"
	)
	@ConfigEditorBoolean
	public boolean enableSbMenus = true;

	@Expose
	@ConfigOption(
		name = "菜单背景样式",
		desc = "更改 SkyBlock 菜单的背景样式"
	)
	@ConfigEditorDropdown(
		values = {
			"暗色 1", "暗色 2", "透明", "亮色 1", "亮色 2", "亮色 3",
			"未使用 1", "未使用 2", "未使用 3", "未使用 4"
		}
	)
	public int backgroundStyle = 0;

	@Expose
	@ConfigOption(
		name = "按钮背景样式",
		desc = "更改 SkyBlock 菜单中前景元素的样式"
	)
	@ConfigEditorDropdown(
		values = {
			"暗色 1", "暗色 2", "透明", "亮色 1", "亮色 2", "亮色 3",
			"未使用 1", "未使用 2", "未使用 3", "未使用 4"
		}
	)
	public int buttonStyle = 0;

	@Expose
	@ConfigOption(
		name = "隐藏空的工具提示",
		desc = "隐藏没有文本的玻璃板的工具提示"
	)
	@ConfigEditorBoolean
	public boolean hideEmptyPanes = true;
}
