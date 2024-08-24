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
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class InventoryButtons {
	@Expose
	@ConfigOption(
		name = "启用库存按钮",
		desc = "快速切换以启用/禁用所有库存按钮"
	)
	@ConfigEditorBoolean
	public boolean enableInventoryButtons = true;

	@Expose
	@ConfigOption(
		name = "打开按钮编辑器",
		desc = "打开按钮编辑器 GUI (/neubuttons)"
	)
	@ConfigEditorButton(runnableId = 7, buttonText = "打开")
	public boolean openEditorButton = true;

	@Expose
	@ConfigOption(
		name = "始终隐藏 \"制作\" 文本",
		desc = "在库存中隐藏制作文本，即使没有按钮时也隐藏"
	)
	@ConfigEditorBoolean
	public boolean hideCrafting = false;

	@Expose
	@ConfigOption(
		name = "在地牢菜单中隐藏按钮",
		desc = "在地牢菜单中隐藏库存按钮。"
	)
	@ConfigEditorBoolean
	public boolean hideInDungeonMenus = false;

	@Expose
	@ConfigOption(
		name = "按钮点击类型",
		desc = "更改触发命令所需的点击类型"
	)
	@ConfigEditorDropdown(
		values = {"鼠标按下", "鼠标抬起"}
	)
	public int clickType = 0;

	@Expose
	@ConfigOption(
		name = "工具提示延迟",
		desc = "更改工具提示的延迟时间（毫秒）"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 1500,
		minStep = 50
	)
	public int tooltipDelay = 600;
}
