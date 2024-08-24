/*
 * 版权所有 (C) 2022 NotEnoughUpdates 贡献者
 *
 * 此文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：你可以在 GNU 较宽通用公共许可证的条款下重新分发和/或修改它，
 * 该许可证由自由软件基金会发布，可以是许可证的第 3 版或（根据你的选择）任何更高版本。
 *
 * NotEnoughUpdates 是在希望它会有用的情况下分发的，
 * 但没有任何担保，甚至没有适销性或适合特定目的的默示担保。有关详细信息，请参阅 GNU 较宽通用公共许可证。
 *
 * 你应该已经收到 GNU 较宽通用公共许可证的副本，
 * 如果没有，请访问 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class BazaarTweaks {

	@ConfigOption(
		name = "搜索 GUI",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean searchAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用搜索 GUI",
		desc = "使用具有自动完成和历史记录的高级搜索 GUI，而不是普通的标志 GUI"
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
		desc = "按下 ESC 键时关闭搜索 GUI，而不重新打开市场\n" +
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
	public int bzSearchHistorySize = 5;

	@Expose
	@ConfigOption(
		name = "市场超付警告",
		desc = "在你在市场中支付超过此金额时提醒你"
	)
	@ConfigEditorSlider(minValue = 0, maxValue = 500_000_000, minStep = 1)
	public double bazaarOverpayWarning = 10_000_000;

	@Expose
	@ConfigOption(
		name = "CTRL+F 搜索",
		desc = "在市场中按 CTRL + F 打开搜索 GUI"
	)
	@ConfigEditorBoolean()
	public boolean ctrlFSearch = true;
}
