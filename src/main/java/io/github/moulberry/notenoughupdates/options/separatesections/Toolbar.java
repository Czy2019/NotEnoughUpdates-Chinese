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
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Toolbar {
	@Expose
	@ConfigOption(
		name = "编辑工具栏位置",
		desc = "更改快速命令 / 搜索栏的位置"
	)
	@ConfigEditorButton(runnableId = 6, buttonText = "编辑")
	public boolean positionButton = true;

	@ConfigOption(
		name = "搜索栏",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean searchBarAccordion = false;

	@Expose
	@ConfigOption(
		name = "显示搜索栏",
		desc = "在 NEU 工具栏中显示物品列表搜索栏"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean searchBar = true;

	@Expose
	@ConfigOption(
		name = "显示快速设置按钮",
		desc = "在 NEU 工具栏中显示快速设置按钮"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean enableSettingsButton = true;

	@Expose
	@ConfigOption(
		name = "显示库存搜索按钮",
		desc = "在 NEU 工具栏中显示启用库存搜索的按钮"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean enableSearchModeButton = true;

	@Expose
	@ConfigOption(
		name = "CTRL+F 快捷键",
		desc = "按 CTRL + F 时更改搜索栏的焦点"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean ctrlF = true;

	@Expose
	@ConfigOption(
		name = "将计算结果复制到剪贴板",
		desc = "在搜索栏中计算时按 ENTER 复制计算结果到剪贴板"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean copyToClipboardWhenGettingResult = true;

	@Expose
	@ConfigOption(
		name = "搜索栏宽度",
		desc = "更改搜索栏的宽度"
	)
	@ConfigEditorSlider(
		minValue = 50f,
		maxValue = 300f,
		minStep = 10f
	)
	@ConfigAccordionId(id = 0)
	public int searchBarWidth = 200;

	@Expose
	@ConfigOption(
		name = "搜索栏高度",
		desc = "更改搜索栏的高度"
	)
	@ConfigEditorSlider(
		minValue = 15f,
		maxValue = 50f,
		minStep = 1f
	)
	@ConfigAccordionId(id = 0)
	public int searchBarHeight = 40;

	@Expose
	@ConfigOption(
		name = "自动关闭搜索模式",
		desc = "在 2 分钟后关闭库存搜索模式"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean autoTurnOffSearchMode = true;

	@Expose
	@ConfigOption(
		name = "显示快速命令",
		desc = "在 NEU 工具栏中显示 QuickCommands™"
	)
	@ConfigEditorBoolean
	public boolean quickCommands = false;

	@Expose
	@ConfigOption(
		name = "快速命令点击类型",
		desc = "更改触发快速命令所需的点击类型"
	)
	@ConfigEditorDropdown(
		values = {"鼠标抬起", "鼠标按下"}
	)
	public int quickCommandsClickType = 0;
}
