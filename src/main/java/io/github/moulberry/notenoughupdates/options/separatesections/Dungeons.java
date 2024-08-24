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
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorColour;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorInfoText;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Dungeons {

	@ConfigOption(
		name = "地牢地图",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean dungeonMapAccordion = false;

	@Expose
	@ConfigOption(
		name = "编辑地牢地图",
		desc = "NEU 地牢地图有自己的编辑器 (/neumap)。\n" +
			"点击左侧按钮打开它"
	)
	@ConfigEditorButton(
		runnableId = 0,
		buttonText = "编辑"
	)
	@ConfigAccordionId(id = 0)
	public int editDungeonMap = 0;

	@Expose
	@ConfigOption(
		name = "显示自己头部作为标记",
		desc = "如果你选择了 \"头部\" 图标风格，不要用头部替换你的绿色标记"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean showOwnHeadAsMarker = false;

	@ConfigOption(
		name = "地牢收益",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean dungeonProfitAccordion = false;

	@Expose
	@ConfigOption(
		name = "收益类型",
		desc = "设置用于计算收益的价格数据集"
	)
	@ConfigEditorDropdown(
		values = {"最低 BIN", "24 平均最低 BIN", "拍卖场平均"}
	)
	@ConfigAccordionId(id = 1)
	public int profitType = 0;

	@Expose
	@ConfigOption(
		name = "收益显示位置",
		desc = "设置收益信息显示的位置\n" +
			"GUI = 显示在库存右侧的GUI\n" +
			"GUI 标题 = 显示在库存标题旁边的文本\n" +
			"描述 = 显示在 \"打开奖励箱\" 项目中"
	)
	@ConfigEditorDropdown(
		values = {"Gui", "GUI 标题", "描述", "关闭"}
	)
	@ConfigAccordionId(id = 1)
	public int profitDisplayLoc = 0;

	@Expose
	@ConfigOption(
		name = "包含 Kismet 羽毛",
		desc = "重新卷轴后在收益计算中包含 Kismet 羽毛"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean useKismetOnDungeonProfit = true;

	@Expose
	@ConfigOption(
		name = "包含精华成本",
		desc = "在地牢箱子的收益计算中包含市场精华出售成本"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean useEssenceCostFromBazaar = true;

	@Expose
	@ConfigOption(
		name = "警告 Derpy 活跃",
		desc = "如果市长 Derpy 活跃，则显示警告"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean shouldWarningDerpy = true;

	@ConfigOption(
		name = "地牢胜利Gui",
		desc = ""
	)
	@ConfigEditorAccordion(id = 3)
	public boolean dungeonWinAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用地牢胜利",
		desc = "完成地牢时显示一个华丽的胜利画面和统计信息"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean enableDungeonWin = true;

	@Expose
	@ConfigOption(
		name = "地牢胜利时间",
		desc = "更改胜利画面显示的时间（毫秒）"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 20000,
		minStep = 500
	)
	@ConfigAccordionId(id = 3)
	public int dungeonWinMillis = 8000;

	@ConfigOption(
		name = "地牢区块Gui",
		desc = ""
	)
	@ConfigEditorAccordion(id = 2)
	public boolean dungeonBlocksAccordion = false;

	@ConfigOption(
		name = "\u00A7c警告",
		desc = "你需要关闭快速渲染和抗锯齿才能使这些设置生效\n" +
			"你可以在视频设置中找到这些选项"
	)
	@ConfigEditorInfoText()
	@ConfigAccordionId(id = 2)
	public boolean dungeonBlockWarning = false;

	@Expose
	@ConfigOption(
		name = "启用区块Gui",
		desc = "在地牢内更改某些区块/实体的颜色，但在地牢外保持正常纹理"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean enableDungBlockOverlay = true;

	@Expose
	@ConfigOption(
		name = "在所有地方显示Gui",
		desc = "即使不在地牢内也显示地牢区块Gui。应仅用于测试。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean dungeonBlocksEverywhere = false;

	@Expose
	@ConfigOption(
		name = "慢更新",
		desc = "每秒更新颜色，而不是每个刻。\n" +
			"\u00A7c警告：这将导致所有纹理动画（例如流动水）更新缓慢。\n" +
			"这应仅在低端机器上使用"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean slowDungeonBlocks = false;

	@Expose
	@ConfigOption(
		name = "裂缝砖块",
		desc = "更改颜色：裂缝砖块"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String dungCrackedColour = "0:255:7:255:217";

	@Expose
	@ConfigOption(
		name = "发射器",
		desc = "更改颜色：发射器"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String dungDispenserColour = "0:255:255:76:0";

	@Expose
	@ConfigOption(
		name = "开关",
		desc = "更改颜色：开关"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String dungLeverColour = "0:252:24:249:255";

	@Expose
	@ConfigOption(
		name = "拉线",
		desc = "更改颜色：拉线"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String dungTripWireColour = "0:255:255:0:0";

	@Expose
	@ConfigOption(
		name = "普通箱子",
		desc = "更改颜色：普通箱子"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String dungChestColour = "0:255:0:163:36";

	@Expose
	@ConfigOption(
		name = "陷阱箱子",
		desc = "更改颜色：陷阱箱子"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String dungTrappedChestColour = "0:255:0:163:36";

	@Expose
	@ConfigOption(
		name = "蝙蝠",
		desc = "更改颜色：蝙蝠"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String dungBatColour = "0:255:12:255:0";

	@ConfigOption(
		name = "Croesus Gui",
		desc = ""
	)
	@ConfigEditorAccordion(id = 4)
	public boolean croesusAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用 Croesus Gui",
		desc = "在查看 Croesus NPC 的箱子预览时，显示一个收益Gui"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean croesusProfitOverlay = true;

	@Expose
	@ConfigOption(
		name = "按收益排序",
		desc = "按收益（降序）列出箱子"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean croesusSortByProfit = true;

	@Expose
	@ConfigOption(
		name = "高亮显示最高收益",
		desc = "高亮显示收益最高的箱子"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean croesusHighlightHighestProfit = true;

}
