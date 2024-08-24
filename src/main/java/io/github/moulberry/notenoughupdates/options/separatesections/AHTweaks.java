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
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class AHTweaks {
	@ConfigOption(
		name = "搜索 GUI",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean searchAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用搜索 GUI",
		desc = "使用具有自动完成和历史记录的高级搜索 GUI，而不是普通的标志 GUI\n\u00a7e星标选择纹理：Johnny#4567"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean enableSearchOverlay = true;

	@Expose
	@ConfigOption(
		name = "保留上次搜索",
		desc = "关闭 GUI 后不要清除搜索栏"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean keepPreviousSearch = false;

	@Expose
	@ConfigOption(
		name = "历史搜索",
		desc = "在自动完成框下方显示历史搜索"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean showPastSearches = true;

	@Expose
	@ConfigOption(
		name = "ESC 完全关闭",
		desc = "按下 ESC 键时关闭搜索 GUI，而不重新打开 AH\n" +
			"ENTER 键仍然可以用于搜索"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean escFullClose = true;

	@Expose
	@ConfigOption(
		name = "搜索历史大小",
		desc = "更改存储的搜索项数量"
	)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 15,
		minStep = 1
	)
	@ConfigAccordionId(id = 0)
	public int ahSearchHistorySize = 5;

	@ConfigOption(
		name = "BIN 警告",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean binWarningAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用低价 BIN 警告",
		desc = "当 BIN 价格低于最低 BIN 的 X% 时请求确认"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean underCutWarning = true;

	@Expose
	@ConfigOption(
		name = "启用高价 BIN 警告",
		desc = "当 BIN 价格高于最低 BIN 的 X% 时请求确认"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean overCutWarning = true;

	@Expose
	@ConfigOption(
		name = "低价警告阈值",
		desc = "BIN 警告的阈值\n例如：10% 意味着当售价比最低 BIN 低 10% 时警告"
	)
	@ConfigEditorSlider(
		minValue = 0.0f,
		maxValue = 100.0f,
		minStep = 5f
	)
	@ConfigAccordionId(id = 1)
	public float warningThreshold = 10f;

	@Expose
	@ConfigOption(
		name = "高价警告阈值",
		desc = "BIN 警告的阈值\n例如：50% 意味着当售价比最低 BIN 高 50% 时警告\n\u00A7c\u00a7l警告：\u00A7r\u00A7c100% 将始终触发警告，0% 则从不触发"
	)
	@ConfigEditorSlider(
		minValue = 0.0f,
		maxValue = 100.0f,
		minStep = 5f
	)
	@ConfigAccordionId(id = 1)
	public float overcutWarningThreshold = 50f;

	@ConfigOption(
		name = "排序警告",
		desc = ""
	)
	@ConfigEditorAccordion(id = 2)
	public boolean sortWarningAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用排序警告",
		desc = "当排序模式不是 '最低价格' 时显示排序模式"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean enableSortWarning = true;

	@Expose
	@ConfigOption(
		name = "启用 AH 销售值",
		desc = "显示利润信息（待领取的金币、全部售出价值、过期和未领取的拍卖）"
	)
	@ConfigEditorBoolean
	public boolean enableAhSellValue = true;

	@Expose
	@ConfigOption(
		name = "CTRL+F 搜索",
		desc = "在 AH 中按 CTRL + F 打开搜索 GUI"
	)
	@ConfigEditorBoolean
	public boolean ctrlFSearch = true;

	@Expose
	@ConfigOption(
		name = "转换搜索命令",
		desc = "将 §e/ah arg arg2 §r转换为 §e/ahs arg arg2"
	)
	@ConfigEditorBoolean
	public boolean convertSearchCommand = true;
}
