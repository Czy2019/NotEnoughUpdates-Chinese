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
import io.github.moulberry.notenoughupdates.core.config.Position;
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDraggableList;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiscOverlays {
	@ConfigOption(
		name = "待办事项覆盖层",
		desc = ""
	)
	public boolean todoAccordion = true;

	@Expose
	@ConfigOption(
		name = "启用待办事项覆盖层",
		desc = "显示一个提醒你做重要任务的覆盖层"
	)
	@ConfigEditorBoolean
	public boolean todoOverlay2 = false;

	@Expose
	@ConfigOption(
		name = "待办事项覆盖层标签",
		desc = "仅在标签列表打开时显示待办事项覆盖层"
	)
	@ConfigEditorBoolean
	public boolean todoOverlayOnlyShowTab = false;

	@Expose
	@ConfigOption(
		name = "待办事项覆盖层隐藏宾果",
		desc = "在宾果配置文件下隐藏一些待办事项：饼干增益、神药、重型珍珠、猩红岛任务"
	)
	@ConfigEditorBoolean
	public boolean todoOverlayHideAtBingo = true;

	@Expose
	@ConfigOption(
		name = "待办事项文本",
		desc = "§e拖动文本以更改覆盖层的外观\n" +
			"§r如果你想查看某个任务的可用时间，点击\"添加\"，然后选择相应的计时器"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"§3蛋糕：§e1天21小时",
			"§3饼干增益：§e2天23小时",
			"§3神药：§e19小时",
			"§3拼图游戏：§e13小时",
			"§3收集者：§e3小时38分钟",
			"§3佣金：§e3小时38分钟",
			"§3实验：§e3小时38分钟",
			"§3秘银粉末：§e3小时38分钟",
			"§3宝石粉末：§e3小时38分钟",
			"§3重型珍珠：§e3小时38分钟",
			"§3猩红岛任务：§e3小时38分钟",
			"§3NPC每日限制：§e3小时38分钟",
			"§3免费裂缝注入：§e3小时38分钟",
		}
	)
	public List<Integer> todoText2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));

	@ConfigOption(
		name = "仅在即将到来时显示",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean TodoAccordion = false;

	@Expose
	@ConfigOption(
		name = "实验显示",
		desc = "更改实验计时器的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int experimentationDisplay = 0;

	@Expose
	@ConfigOption(
		name = "拼图游戏重置显示",
		desc = "更改拼图游戏重置计时器的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int puzzlerDisplay = 0;

	@Expose
	@ConfigOption(
		name = "收集者重置显示",
		desc = "更改收集者重置计时器的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int fetchurDisplay = 0;

	@Expose
	@ConfigOption(
		name = "佣金计时器显示",
		desc = "更改佣金计时器的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int commissionDisplay = 0;

	@Expose
	@ConfigOption(
		name = "蛋糕增益显示",
		desc = "更改蛋糕增益计时器的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int cakesDisplay = 0;

	@Expose
	@ConfigOption(
		name = "饼干增益显示",
		desc = "更改饼干增益的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int cookieBuffDisplay = 0;

	@Expose
	@ConfigOption(
		name = "神药显示",
		desc = "更改神药的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int godpotDisplay = 0;

	@Expose
	@ConfigOption(
		name = "秘银粉末显示",
		desc = "更改秘银粉末的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int dailyMithrilPowderDisplay = 0;

	@Expose
	@ConfigOption(
		name = "宝石粉末显示",
		desc = "更改宝石粉末的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int dailyGemstonePowderDisplay = 0;

	@Expose
	@ConfigOption(
		name = "重型珍珠显示",
		desc = "更改重型珍珠的显示方式\n" +
			"仅在准备好时、非常接近时、接近时、稍微接近时或始终显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "非常接近时", "接近时", "稍微接近时", "始终显示"}
	)
	public int dailyHeavyPearlDisplay = 0;
	@Expose
	@ConfigOption(
		name = "血色岛任务显示",
		desc = "更改血色岛任务的显示方式\n" +
			"仅在准备好时、很快、快、稍微快或总是显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "很快", "快", "稍微快", "总是"}
	)
	public int questBoardDisplay = 0;

	@Expose
	@ConfigOption(
		name = "NPC每日购买限制显示",
		desc = "更改NPC商店限制的显示方式\n" +
			"仅在准备好时、很快、快、稍微快或总是显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "很快", "快", "稍微快", "总是"}
	)
	public int shopLimitDisplay = 0;

	@Expose
	@ConfigOption(
		name = "免费裂缝注入显示",
		desc = "更改免费裂缝注入的显示方式\n" +
			"仅在准备好时、很快或总是显示。"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorDropdown(
		values = {"仅在准备好时", "很快", "总是"}
	)
	public int freeRiftInfusionDisplay = 0;

	@ConfigOption(
		name = "颜色",
		desc = ""
	)

	@ConfigEditorAccordion(id = 2)
	public boolean TodoColourAccordion = false;

	@Expose
	@ConfigOption(
		name = "准备颜色",
		desc = "更改计时器准备好时的颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 2)
	public int readyColour = 10;

	@Expose
	@ConfigOption(
		name = "消失颜色",
		desc = "更改计时器消失时的颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 2)
	public int goneColour = 12;

	@Expose
	@ConfigOption(
		name = "很快颜色",
		desc = "更改计时器几乎准备好/消失时的颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 2)
	public int verySoonColour = 11;

	@Expose
	@ConfigOption(
		name = "快颜色",
		desc = "更改计时器快准备好/消失时的颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 2)
	public int soonColour = 9;

	@Expose
	@ConfigOption(
		name = "稍微快颜色",
		desc = "更改计时器稍微快准备好/消失时的颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 2)
	public int kindaSoonColour = 1;

	@Expose
	@ConfigOption(
		name = "默认颜色",
		desc = "更改计时器的默认颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 2)
	public int defaultColour = 15;

	@Expose
	public Position todoPosition = new Position(100, 0);

	@Expose
	@ConfigOption(
		name = "待办样式",
		desc = "更改待办覆盖层的样式"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "有阴影", "完全阴影"}
	)
	public int todoStyle = 0;

	@Expose
	@ConfigOption(
		name = "待办图标",
		desc = "在待办覆盖层的行旁边添加小图标"
	)
	@ConfigEditorBoolean
	public boolean todoIcons = true;
}
