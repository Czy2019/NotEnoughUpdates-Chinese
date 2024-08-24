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
import io.github.moulberry.moulconfig.annotations.ConfigEditorColour;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Notifications {
	@Expose
	@ConfigOption(
		name = "更新消息",
		desc = "每当发布新版本的NEU时在聊天中给出通知"
	)
	@ConfigEditorDropdown(values = {"关闭", "发布", "预发布"})
	public int updateChannel = 1;

	@Expose
	@ConfigOption(
		name = "缺少仓库警告",
		desc = "当仓库数据缺失或过时时发出警告"
	)
	@ConfigEditorBoolean
	public boolean outdatedRepo = true;

	@Expose
	@ConfigOption(
		name = "RAM警告",
		desc = "当游戏启动时分配了大量RAM时发出警告\n" +
			"\u00a7c在禁用此功能之前，请认真阅读消息。如果您在不听取警告的情况下抱怨FPS问题，那是您的错。"
	)
	@ConfigEditorBoolean
	public boolean doRamNotif = true;

	@Expose
	@ConfigOption(
		name = "旧动画警告",
		desc = "当使用不受支持的旧动画mod时发出警告"
	)
	@ConfigEditorBoolean
	public boolean doOamNotif = true;

	@Expose
	@ConfigOption(
		name = "快速渲染警告",
		desc = "\u00a7c如果且仅当您禁用了快速渲染但仍看到警告时，可以在此处禁用它。\n禁用时如果快速渲染仍然打开，将导致功能损坏。"
	)
	@ConfigEditorBoolean
	public boolean doFastRenderNotif = true;

	@Expose
	@ConfigOption(
		name = "助推器饼干警告",
		desc = "当助推器饼干即将过期时发出警告"
	)
	@ConfigEditorBoolean
	public boolean doBoosterNotif = false;

	@Expose
	@ConfigOption(
		name = "助推器饼干警告时间",
		desc = "更改助推器饼干警告激活所需的最短时间"
	)
	@ConfigEditorSlider(
		minValue = 10,
		maxValue = 5760,
		minStep = 25
	)
	public int boosterCookieWarningMins = 1440;

	@Expose
	@ConfigOption(
		name = "末影节点",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean enderNodeAccordion = true;

	@Expose
	@ConfigOption(
		name = "嵌套末影螨警报",
		desc = "如果生成了嵌套末影螨，它将提醒用户"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean endermiteAlert = true;

	@Expose
	@ConfigOption(
		name = "嵌套末影螨警报颜色",
		desc = "警报将显示的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 1)
	public String endermiteAlertColor = "0:255:194:0:174";

	@Expose
	@ConfigOption(
		name = "嵌套末影螨警报显示时间",
		desc = "显示在屏幕上的时间（以刻为单位）"
	)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 200,
		minStep = 20
	)
	@ConfigAccordionId(id = 1)
	public int endermiteAlertTicks = 20;
}
