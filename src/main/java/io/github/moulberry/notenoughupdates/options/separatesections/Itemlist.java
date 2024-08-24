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
import io.github.moulberry.moulconfig.annotations.ConfigEditorColour;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Itemlist {
	@Expose
	@ConfigOption(
		name = "显示原版物品",
		desc = "将原版物品包括在物品列表中"
	)
	@ConfigEditorBoolean
	public boolean showVanillaItems = true;

	@Expose
	@ConfigOption(
		name = "打开物品列表箭头",
		desc = "在右侧创建一个箭头，当悬停时打开物品列表"
	)
	@ConfigEditorBoolean
	public boolean tabOpen = true;

	@Expose
	@ConfigOption(
		name = "保持打开",
		desc = "在关闭库存后保持物品列表打开"
	)
	@ConfigEditorBoolean
	public boolean keepopen = false;

	@Expose
	@ConfigOption(
		name = "搜索时打开",
		desc = "在容器搜索模式下通过双击搜索栏打开物品列表"
	)
	@ConfigEditorBoolean
	public boolean openWhenSearching = true;

	@Expose
	@ConfigOption(
		name = "物品样式",
		desc = "设置物品背景的样式"
	)
	@ConfigEditorDropdown(
		values = {"圆形", "方形"}
	)
	public int itemStyle = 0;

	@Expose
	@ConfigOption(
		name = "面板 GUI 缩放",
		desc = "更改物品列表的 GUI 缩放"
	)
	@ConfigEditorDropdown(
		values = {"默认", "小", "中", "大", "自动"}
	)
	public int paneGuiScale = 0;

	@Expose
	@ConfigOption(
		name = "背景模糊",
		desc = "更改物品列表背后的模糊量。0 = 关闭"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 20,
		minStep = 1
	)
	public int bgBlurFactor = 5;

	@Expose
	@ConfigOption(
		name = "面板宽度倍增器",
		desc = "更改物品列表的宽度"
	)
	@ConfigEditorSlider(
		minValue = 0.5f,
		maxValue = 1.5f,
		minStep = 0.1f
	)
	public float paneWidthMult = 1.0f;

	@Expose
	@ConfigOption(
		name = "面板内边距",
		desc = "更改物品列表的内边距"
	)
	@ConfigEditorSlider(
		minValue = 0f,
		maxValue = 20f,
		minStep = 1f
	)
	public int panePadding = 10;

	@Expose
	@ConfigOption(
		name = "前景颜色",
		desc = "更改物品列表中前景元素的颜色"
	)
	@ConfigEditorColour
	public String foregroundColour = "00:255:100:100:100";

	@Expose
	@ConfigOption(
		name = "收藏颜色",
		desc = "更改物品列表中收藏元素的颜色"
	)
	@ConfigEditorColour
	public String favouriteColour = "00:255:200:150:50";

	@Expose
	@ConfigOption(
		name = "面板背景颜色",
		desc = "更改物品列表的背景颜色"
	)
	@ConfigEditorColour
	public String backgroundColour = "15:6:0:0:255";

	@Expose
	@ConfigOption(
		name = "始终显示怪物",
		desc = "始终在物品列表中显示怪物物品"
	)
	@ConfigEditorBoolean(
		runnableId = 21
	)
	public boolean alwaysShowMonsters = false;

	@Expose
	@ConfigOption(
		name = "网页在浏览器中打开",
		desc = "在你的网页浏览器中打开 wiki 页面，而不是在游戏中的信息面板中渲染。"
	)
	@ConfigEditorBoolean
	public boolean wikiInBrowser = false;
}
