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
import io.github.moulberry.moulconfig.annotations.ConfigEditorDraggableList;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import io.github.moulberry.notenoughupdates.core.config.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetOverlay {
	@Expose
	@ConfigOption(
		name = "启用宠物信息覆盖",
		desc = "在屏幕上显示当前活跃的宠物和宠物经验。"
	)
	@ConfigEditorBoolean
	public boolean enablePetInfo = false;

	@Expose
	public Position petInfoPosition = new Position(-1, -1);

	@Expose
	@ConfigOption(
		name = "宠物覆盖文本",
		desc = "拖动文本以更改覆盖的外观\n" +
			"装备宠物以显示覆盖"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"[等级 37] 石头",
			"2,312.9/2,700 (85.7%)",
			"2.3k/2.7k (85.7%)",
			"经验/小时: 27,209",
			"总经验: 30,597.9",
			"持有物品: 采矿经验加成",
			"到等级38: 5分钟13秒",
			"到等级100: 2天13小时"
		}
	)
	public List<Integer> petOverlayText = new ArrayList<>(Arrays.asList(0, 2, 3, 6, 4));

	@Expose
	@ConfigOption(
		name = "宠物覆盖图标",
		desc = "在覆盖中显示你装备的宠物的图标"
	)
	@ConfigEditorBoolean
	public boolean petOverlayIcon = true;

	@Expose
	@ConfigOption(
		name = "宠物物品图标",
		desc = "在覆盖中显示你装备的宠物物品的图标"
	)
	@ConfigEditorBoolean
	public boolean petItemIcon = false;

	@Expose
	@ConfigOption(
		name = "宠物信息覆盖样式",
		desc = "更改宠物信息覆盖的样式"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "有阴影", "完全阴影"}
	)
	public int petInfoOverlayStyle = 0;

	@Expose
	@ConfigOption(
		name = "显示最后一个宠物",
		desc = "在覆盖中显示两个宠物\n" +
			"如果同时训练两个宠物并使用自动宠物功能非常有用"
	)
	@ConfigEditorBoolean
	public boolean dualPets = false;

	@Expose
	@ConfigOption(
		name = "宠物库存显示",
		desc = "在你的库存中显示当前宠物的覆盖\n" +
			"需要启用隐藏药水效果"
	)
	@ConfigEditorBoolean
	public boolean petInvDisplay = false;

	@Expose
	@ConfigOption(
		name = "界面样式",
		desc = "更改界面的颜色"
	)
	@ConfigEditorDropdown(
		values = {"Minecraft", "灰色", "PacksHQ 黑暗", "透明", "FSR"}
	)
	public int colourStyle = 0;

	@Expose
	@ConfigOption(
		name = "点击打开宠物",
		desc = "点击HUD以打开 /pets"
	)
	@ConfigEditorBoolean
	public boolean sendPetsCommand = true;

	@Expose
	@ConfigOption(
		name = "隐藏宠物库存工具提示",
		desc = "隐藏你在库存中活跃宠物的工具提示"
	)
	@ConfigEditorBoolean
	public boolean hidePetTooltip = false;

	@Expose
	@ConfigOption(
		name = "显示升级后的宠物等级",
		desc = "显示在 Kats 升级后的估计宠物等级"
	)
	@ConfigEditorBoolean
	public boolean showKatSitting = true;

	@Expose
	@ConfigOption(
		name = "隐藏宠物等级进度",
		desc = "隐藏已满级宠物的等级进度信息。"
	)
	@ConfigEditorBoolean
	public boolean hidePetLevelProgress = false;
}
