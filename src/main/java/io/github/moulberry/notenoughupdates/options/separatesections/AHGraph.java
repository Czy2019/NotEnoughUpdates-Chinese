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
import io.github.moulberry.moulconfig.annotations.ConfigEditorKeybind;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigEditorText;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import org.lwjgl.input.Keyboard;

public class AHGraph {
	@Expose
	@ConfigOption(
		name = "启用 AH/BZ 价格图",
		desc = "启用或禁用图表。"
	)
	@ConfigEditorBoolean
	public boolean graphEnabled = true;

	@Expose
	@ConfigOption(
		name = "快捷键",
		desc = "按下的键来打开图表。"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_P)
	public int graphKey = Keyboard.KEY_P;

	@Expose
	@ConfigOption(
		name = "GUI 风格",
		desc = "更改图表 GUI 的风格。"
	)
	@ConfigEditorDropdown(
		values = {"Minecraft", "灰色", "PacksHQ 深色", "FSR"}
	)
	public int graphStyle = 0;

	@Expose
	@ConfigOption(
		name = "默认时间",
		desc = "更改图表的默认时间范围。"
	)
	@ConfigEditorDropdown(
		values = {"1 小时", "1 天", "1 周", "所有时间"}
	)
	public int defaultMode = 1;

	@Expose
	@ConfigOption(
		name = "图表颜色",
		desc = "设置图表的自定义颜色。"
	)
	@ConfigEditorColour
	public String graphColor = "0:255:0:255:0";

	@Expose
	@ConfigOption(
		name = "第二图表颜色",
		desc = "设置第二条图表线的自定义颜色。"
	)
	@ConfigEditorColour
	public String graphColor2 = "0:255:255:255:0";

	@Expose
	@ConfigOption(
		name = "移动平均线",
		desc = "图表是否应显示移动平均线。"
	)
	@ConfigEditorBoolean
	public boolean movingAverages = false;
	// 默认禁用，因为对于不了解的人来说，它的效果可能比较奇怪

	@Expose
	@ConfigOption(
		name = "移动平均线大小 (%)",
		desc = "显示时间的百分比用于平均计算。"
	)
	@ConfigEditorSlider(
		minValue = 0.05f,
		maxValue = 0.5f,
		minStep = 0.05f
	)
	public double movingAveragePercent = 0.2;

	@Expose
	@ConfigOption(
		name = "移动平均线颜色",
		desc = "设置图表移动平均线的自定义颜色。"
	)
	@ConfigEditorColour
	public String movingAverageColor = "0:255:0:255:171";

	@Expose
	@ConfigOption(
		name = "第二条移动平均线颜色",
		desc = "设置第二条图表移动平均线的自定义颜色。"
	)
	@ConfigEditorColour
	public String movingAverageColor2 = "0:255:255:109:0";

	@Expose
	@ConfigOption(
		name = "数据源",
		desc = "NEU 应从哪里获取图表数据。\n如果设置为 '本地'，价格仅在本地存储。"
	)
	@ConfigEditorDropdown(
		values = {"服务器", "本地"}
	)
	public int dataSource = 0;

	@Expose
	@ConfigOption(
		name = "价格历史 API",
		desc = "§4请 §l不要 §r§4更改此项，除非你完全了解自己的操作\n§f默认：§apricehistory.notenoughupdates.org"
	)
	@ConfigEditorText
	public String serverUrl = "pricehistory.notenoughupdates.org";

	@Expose
	@ConfigOption(
		name = "数据保留",
		desc = "更改数据保留的时间（以天为单位）。\n较长的保留时间需要更多的存储空间。"
	)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 30,
		minStep = 1
	)
	public int dataRetention = 7;

	@Expose
	@ConfigOption(
		name = "图表区域数量",
		desc = "更改图表区域的数量。\n更多的区域会有更多的细节，但可能会显得拥挤。"
	)
	@ConfigEditorSlider(
		minValue = 50,
		maxValue = 300,
		minStep = 1
	)
	public int numberOfZones = 100;  // 请注意，此处假设了图表区域的默认值。如果有实际默认值，请替换。
	public int graphZones = 175;
}
