/*
 * 版权所有 (C) 2023 NotEnoughUpdates 贡献者
 *
 * 本文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：你可以在 GNU 较宽松公共许可证的条款下重新分发
 * 和/或修改它，许可证由自由软件基金会发布，无论是许可证的第 3 版，还是（根据你的选择）任何更高版本。
 *
 * NotEnoughUpdates 的分发是希望它会有用，
 * 但不提供任何担保；甚至不包括对特定用途的适销性或适用性的默示担保。有关详细信息，请参阅 GNU
 * 较宽松公共许可证。
 *
 * 你应该已经收到 GNU 较宽松公共许可证的副本
 * 与 NotEnoughUpdates 一起。如果没有，请参见 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorColour;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Museum {

	@Expose
	@ConfigOption(
		name = "显示博物馆物品",
		desc = "在博物馆中显示真实物品，而不是绿色染料"
	)
	@ConfigEditorBoolean
	public boolean museumItemShow = false;

	@Expose
	@ConfigOption(
		name = "高亮虚拟博物馆物品",
		desc = "用背景颜色高亮虚拟博物馆物品"
	)
	@ConfigEditorColour
	public String museumItemColor = "0:255:0:255:0";

	@Expose
	@ConfigOption(
		name = "显示待捐赠物品",
		desc = "显示你尚未捐赠给博物馆的最便宜的物品"
	)
	@ConfigEditorBoolean
	public boolean museumCheapestItemOverlay = true;

	@Expose
	@ConfigOption(
		name = "价值计算",
		desc = "选择价值计算的来源"
	)
	@ConfigEditorDropdown(
		values = {"最低 BIN", "制作成本"}
	)
	public int museumCheapestItemOverlayValueSource = 0;

}
