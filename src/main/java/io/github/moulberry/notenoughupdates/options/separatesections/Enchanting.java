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
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Enchanting {
	@ConfigOption(
		name = "附魔台 / Hex 界面",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean tableGUIAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用附魔台界面",
		desc = "使用附魔台时显示自定义界面"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean enableTableGUI = true;

	@Expose
	@ConfigOption(
		name = "启用 Hex 界面",
		desc = "使用 Hex 时显示自定义界面"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean enableHexGUI = true;

    /*@Expose
    @ConfigOption(
        name = "不兼容的附魔",
        desc = "如何显示与你当前物品不兼容的附魔，例如，剑上有锋利时的惩戒"
    )
    @ConfigEditorDropdown(
        values = {"高亮", "隐藏"}
    )
    @ConfigAccordionId(id = 1)
    public int incompatibleEnchants = 0;*/

	@Expose
	@ConfigOption(
		name = "附魔排序",
		desc = "更改附魔在界面中的排序方式"
	)
	@ConfigEditorDropdown(
		values = {"按成本", "按字母"}
	)
	@ConfigAccordionId(id = 1)
	public int enchantSorting = 0;

	@Expose
	@ConfigOption(
		name = "附魔顺序",
		desc = "更改排序时使用的顺序"
	)
	@ConfigEditorDropdown(
		values = {"升序", "降序"}
	)
	@ConfigAccordionId(id = 1)
	public int enchantOrdering = 0;

	@Expose
	@ConfigOption(
		name = "使用 /et 中的最高等级在 /hex 中",
		desc = "在 Hex 中显示 /et 的最大等级，而不是最高可能的等级"
	)
	@ConfigEditorBoolean()
	@ConfigAccordionId(id = 1)
	public boolean maxEnchLevel = false;

	@ConfigOption(
		name = "附魔解答器",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean enchantingSolversAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用解答器",
		desc = "开启实验台的解答器"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean enableEnchantingSolvers = true;

	@Expose
	@ConfigOption(
		name = "防止误点击",
		desc = "防止意外失败 Chronomatron 和 Ultrasequencer 实验"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean preventMisclicks1 = false;

	@Expose
	@ConfigOption(
		name = "隐藏提示",
		desc = "隐藏 Chronomatron 和 Ultrasequencer 实验中的物品提示"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean hideTooltips = true;

	@Expose
	@ConfigOption(
		name = "Ultrasequencer 数字",
		desc = "将 Ultrasequencer 中的物品替换为仅数字"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean seqNumbers = false;

	@Expose
	@ConfigOption(
		name = "在 Chronomatron 中显示下一个点击",
		desc = "显示你在 Chronomatron 中需要点击的下一个方块"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean showNextClick = true;

	@Expose
	@ConfigOption(
		name = "隐藏按钮",
		desc = "在实验台中隐藏库存按钮和快捷命令"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean hideButtons = false;

	@Expose
	@ConfigOption(
		name = "Ultrasequencer 下一个",
		desc = "设置 Ultrasequencer 中下一个元素后面显示的玻璃板颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"无", "白色", "橙色", "浅紫色", "浅蓝色", "黄色", "浅绿色", "粉色",
			"灰色", "浅灰色", "青色", "深紫色", "深蓝色", "棕色", "深绿色", "红色", "黑色"
		}
	)
	@ConfigAccordionId(id = 0)
	public int seqNext = 6;

	@Expose
	@ConfigOption(
		name = "Ultrasequencer 即将到来",
		desc = "设置 Ultrasequencer 中 \"下一个\" 元素之后显示的玻璃板颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"无", "白色", "橙色", "浅紫色", "浅蓝色", "黄色", "浅绿色", "粉色",
			"灰色", "浅灰色", "青色", "深紫色", "深蓝色", "棕色", "深绿色", "红色", "黑色"
		}
	)
	@ConfigAccordionId(id = 0)
	public int seqUpcoming = 5;

	@Expose
	@ConfigOption(
		name = "Superpairs 匹配",
		desc = "设置成功匹配的对的玻璃板颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"无", "白色", "橙色", "浅紫色", "浅蓝色", "黄色", "浅绿色", "粉色",
			"灰色", "浅灰色", "青色", "深紫色", "深蓝色", "棕色", "深绿色", "红色", "黑色"
		}
	)
	@ConfigAccordionId(id = 0)
	public int supMatched = 6;

	@Expose
	@ConfigOption(
		name = "Superpairs 可能",
		desc = "设置可以匹配但尚未匹配的对的玻璃板颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"无", "白色", "橙色", "浅紫色", "浅蓝色", "黄色", "浅绿色", "粉色",
			"灰色", "浅灰色", "青色", "深紫色", "深蓝色", "棕色", "深绿色", "红色", "黑色"
		}
	)
	@ConfigAccordionId(id = 0)
	public int supPossible = 2;

	@Expose
	@ConfigOption(
		name = "Superpairs 未匹配",
		desc = "设置已被揭示但尚未匹配的对的玻璃板颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"无", "白色", "橙色", "浅紫色", "浅蓝色", "黄色", "浅绿色", "粉色",
			"灰色", "浅灰色", "青色", "深紫色", "深蓝色", "棕色", "深绿色", "红色", "黑色"
		}
	)
	@ConfigAccordionId(id = 0)
	public int supUnmatched = 5;

	@Expose
	@ConfigOption(
		name = "Superpairs 能力提升",
		desc = "设置能力提升的玻璃板颜色"
	)
	@ConfigEditorDropdown(
		values = {
			"无", "白色", "橙色", "浅紫色", "浅蓝色", "黄色", "浅绿色", "粉色",
			"灰色", "浅灰色", "青色", "深紫色", "深蓝色", "棕色", "深绿色", "红色", "黑色"
		}
	)
	@ConfigAccordionId(id = 0)
	public int supPower = 11;

	@Expose
	@ConfigOption(
		name = "Hex 超支警告",
		desc = "在你为 /hex 中的物品支付超过此金额时发出警告"
	)
	@ConfigEditorSlider(minValue = 0, maxValue = 500_000_000, minStep = 1)
	public double hexOverpayWarning = 10_000_000;
}
