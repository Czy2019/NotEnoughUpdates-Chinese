/*
 * 版权所有 (C) 2022 NotEnoughUpdates 贡献者
 *
 * 本文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是免费软件：你可以根据 GNU 较宽松公共许可证的条款重新分发和/或修改它，
 * 该许可证由自由软件基金会发布，版本 3 或（根据你的选择）任何更高版本。
 *
 * NotEnoughUpdates 的发行目的是希望它对你有用，
 * 但不提供任何担保；甚至不包含对适销性或特定用途适用性的隐含担保。有关详细信息，请参阅 GNU 较宽松公共许可证。
 *
 * 你应该已经收到 GNU 较宽松公共许可证的副本，
 * 随着 NotEnoughUpdates 一起。如果没有，请参见 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import io.github.moulberry.notenoughupdates.core.config.Position;

public class LocationEdit {

	@ConfigOption(
		name = "编辑 GUI 位置",
		desc = "更改 NEU 的覆盖层位置"
	)
	@ConfigEditorButton(
		runnableId = 4,
		buttonText = "编辑"
	)
	public Position positions = new Position(-1, -1);

	@Expose
	@ConfigOption(
		name = "编辑 GUI 缩放",
		desc = "更改 NEU 的覆盖层大小。\n" +
			"§c4x 及更高仅支持大屏幕（4k 分辨率）"
	)
	@ConfigEditorDropdown(
		values = {"默认", "小", "正常", "大", "自动", "4x", "5x", "6x", "7x", "8x"}
	)
	public int guiScale = 0;

	@ConfigOption(
		name = "编辑地下城地图",
		desc = "NEU 地下城地图有自己的编辑器 (/neumap)。\n" +
			"点击左侧的按钮打开它"
	)
	@ConfigEditorButton(
		runnableId = 0,
		buttonText = "编辑"
	)
	public int editDungeonMap = 0;

	@ConfigOption(
		name = "库存",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean inventoryAccordion = false;

	@ConfigOption(
		name = "编辑工具栏位置",
		desc = "更改快捷命令 / 搜索栏的位置"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorButton(runnableId = 6, buttonText = "编辑")
	public boolean positionButton = true;

	@ConfigOption(
		name = "打开按钮编辑器",
		desc = "打开按钮编辑器 GUI (/neubuttons)"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorButton(runnableId = 7, buttonText = "打开")
	public boolean openEditorButton = true;
}
