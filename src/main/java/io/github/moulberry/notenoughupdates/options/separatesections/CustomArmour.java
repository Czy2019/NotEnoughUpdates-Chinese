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
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class CustomArmour {

	@Expose
	@ConfigOption(
		name = "启用装备 HUD",
		desc = "在你的背包中显示一个界面，展示你额外的 4 个护甲槽\n" +
			"\u00A7c需要启用隐藏药水效果"
	)
	@ConfigEditorBoolean
	public boolean enableArmourHud = true;

	@Expose
	@ConfigOption(
		name = "点击打开装备菜单",
		desc = "点击 HUD 打开 /equipment"
	)
	@ConfigEditorBoolean
	public boolean sendWardrobeCommand = true;

	@Expose
	@ConfigOption(
		name = "GUI 风格",
		desc = "更改 GUI 的颜色"
	)
	@ConfigEditorDropdown(
		values = {"Minecraft", "灰色", "PacksHQ 深色", "透明", "FSR"}
	)
	public int colourStyle = 0;
}
