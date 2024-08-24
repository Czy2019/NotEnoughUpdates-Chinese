/*
 * Copyright (C) 2024 NotEnoughUpdates 贡献者
 *
 * 本文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：您可以根据 GNU 较宽通用公共许可证的条款重新分发和/或修改它，
 * 许可证由自由软件基金会发布，无论是许可证的第 3 版，还是（根据您的选择）任何更高版本。
 *
 * NotEnoughUpdates 以希望它有用的方式发布，但不提供任何保证；甚至不包括对适销性或
 * 适用于特定目的的隐含保证。有关更多详细信息，请参阅 GNU 较宽通用公共许可证。
 *
 * 您应该已经收到 GNU 较宽通用公共许可证的副本，
 * 以及 NotEnoughUpdates。如果没有，请参见 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class RecipeTweaks {

	@ConfigOption(
		name = "搜索 GUI",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean searchAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用搜索 GUI",
		desc = "使用带有自动完成和历史记录的高级搜索 GUI，而不是普通的标志 GUI"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean enableSearchOverlay = true;

	@Expose
	@ConfigOption(
		name = "保留之前的搜索",
		desc = "关闭 GUI 后不要清除搜索栏"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean keepPreviousSearch = false;

	@Expose
	@ConfigOption(
		name = "过去的搜索",
		desc = "在自动完成框下方显示过去的搜索"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean showPastSearches = true;

	@Expose
	@ConfigOption(
		name = "ESC 完全关闭",
		desc = "使按下 ESCAPE 键关闭搜索 GUI，而不会重新打开 Craft 菜单\n" +
			"ENTER 仍然可以用于搜索"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean escFullClose = true;

	@Expose
	@ConfigOption(
		name = "搜索历史记录大小",
		desc = "更改存储多少搜索项"
	)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 15,
		minStep = 1
	)
	@ConfigAccordionId(id = 0)
	public int recipeSearchHistorySize = 5;

}
