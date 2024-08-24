/*
 * 版权所有 (C) 2022 NotEnoughUpdates 贡献者
 *
 * 本文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：您可以在 GNU 较小公共许可证的条款下重新分发和/或修改它，
 * 许可证由自由软件基金会发布，版本 3 或（根据您的选择）任何更高版本。
 *
 * NotEnoughUpdates 是在希望它会有用的基础上分发的，
 * 但没有任何担保；甚至没有暗示的适销性或适用于特定目的的担保。有关详细信息，请参见 GNU
 * 较小公共许可证。
 *
 * 您应该已经收到 GNU 较小公共许可证的副本
 * 与 NotEnoughUpdates 一起。如果没有，请参见 <https://www.gnu.org/licenses/>.
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.notenoughupdates.BuildFlags;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDraggableList;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProfileViewer {

	@Expose
	@ConfigOption(
		name = "打开个人资料查看器",
		desc = "打开个人资料查看器 (/pv)\n" +
			"显示玩家的统计数据和财富"
	)
	@ConfigEditorButton(
		runnableId = 13,
		buttonText = "打开"
	)
	public boolean openPV = true;

	@Expose
	@ConfigOption(
		name = "页面布局",
		desc = "\u00a7r选择个人资料查看器顶部页面的顺序\n" +
			"\u00a7e拖动文本以重新排列"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"\u00a7e基本信息",
			"\u00a7e地下城",
			"\u00a7e额外信息",
			"\u00a7e库存",
			"\u00a7e收藏",
			"\u00a7e宠物",
			"\u00a7e挖矿",
			"\u00a7e宾果",
			"\u00a7e奖杯鱼",
			"\u00a7e图鉴",
			"\u00a7e红月岛",
			"\u00a7e博物馆",
			"\u00a7e裂隙",
			"\u00a7e花园"
		},
		allowDeleting = false
	)
	public List<Integer> pageLayout = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));

	@Expose
	@ConfigOption(
		name = "始终显示宾果标签",
		desc = "始终显示宾果标签，或仅在选择宾果配置文件时显示"
	)
	@ConfigEditorBoolean
	public boolean alwaysShowBingoTab = false;

	@Expose
	@ConfigOption(
		name = "在 /pv 中显示代词",
		desc = "在 /pv 中显示玩家的代词。数据来源于 pronoundb.org"
	)
	@ConfigEditorBoolean
	public boolean showPronounsInPv = BuildFlags.ENABLE_PRONOUNS_IN_PV_BY_DEFAULT;

	@Expose
	@ConfigOption(
		name = "使用 Soopy 财富",
		desc = "在 /pv 和 /peek 中用 Soopy 财富替换 NEU 财富"
	)
	@ConfigEditorBoolean
	public boolean useSoopyNetworth = true;

	@Expose
	@ConfigOption(
		name = "显示重量",
		desc = "在基本个人资料页面中显示 Lily 和 Senither 的重量"
	)
	@ConfigEditorBoolean
	public boolean displayWeight = true;
}
