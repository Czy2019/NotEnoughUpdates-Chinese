/*
 * 版权 (C) 2022 NotEnoughUpdates 贡献者
 *
 * 本文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：您可以在 GNU 较宽松通用公共许可证的条款下重新分发和/或修改它，
 * 该许可证由自由软件基金会发布，版本 3 或（根据您的选择）任何更高版本。
 *
 * NotEnoughUpdates 以希望它对您有用的方式分发，但不提供任何担保；甚至没有暗示的
 * 适销性或适合某一特定用途的担保。有关详细信息，请参见 GNU 较宽松通用公共许可证。
 *
 * 您应该已经收到 GNU 较宽松通用公共许可证的副本
 * 与 NotEnoughUpdates 一起提供。如果没有，请参见 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigEditorInfoText;
import io.github.moulberry.notenoughupdates.core.config.Position;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDraggableList;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlayerOverlay {
	@Expose
	@ConfigOption(
		name = "警告",
		desc = "您可能需要完成 2 个 Boss 才能显示所有内容"
	)
	@ConfigEditorInfoText()
	public boolean slayerWarning = false;

	@Expose
	@ConfigOption(
		name = "启用 Slayer 悬浮窗",
		desc = "切换 Slayer 悬浮窗的显示"
	)
	@ConfigEditorBoolean
	public boolean slayerOverlay = false;

	@Expose
	@ConfigOption(
		name = "仅在相关时显示",
		desc = "仅在您处于可以完成当前 Slayer 的区域时显示悬浮窗"
	)
	@ConfigEditorBoolean
	public boolean onlyShowWhenRelevant = true;

	@Expose
	@ConfigOption(
		name = "Slayer 文本",
		desc = "拖动文本以更改悬浮窗的外观"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"Slayer: Sven",
			"RNG 表：100%",
			"等级：7",
			"击杀时间：1:30",
			"经验：75,450/100,000",
			"下一个等级所需 Boss 数：17",
			"平均击杀时间：3:20"
		}
	)
	public List<Integer> slayerText = new ArrayList<>(Arrays.asList(0, 1, 4, 5, 3, 6));

	@Expose
	public Position slayerPosition = new Position(10, 200);

	@Expose
	@ConfigOption(
		name = "Slayer 风格",
		desc = "更改 Slayer 悬浮窗的风格"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "阴影", "完全阴影"}
	)
	public int slayerStyle = 0;
}
