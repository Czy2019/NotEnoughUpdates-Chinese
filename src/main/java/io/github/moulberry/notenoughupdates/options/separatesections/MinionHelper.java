/*
 * 版权所有 (C) 2022 NotEnoughUpdates 贡献者
 *
 * 本文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：您可以根据 GNU 较宽松公共许可证的条款重新分发
 * 和/或修改它，许可证由自由软件基金会发布，可以是许可证的第 3 版，或（根据您的选择）任何后续版本。
 *
 * NotEnoughUpdates 的分发希望它将是有用的，但不提供任何保证；甚至没有暗示的保证
 * 适销性或适合特定用途。有关更多详细信息，请参见 GNU 较宽松公共许可证。
 *
 * 您应该已经收到了 GNU 较宽松公共许可证的副本，随 NotEnoughUpdates 一同提供。如果没有，请参见 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

//TODO jani 重命名消息格式
public class MinionHelper {
	@Expose
	@ConfigOption(
		name = "启用界面",
		desc =
			"在制作的仆人物品栏中显示一个列表，列出每个可制作的或所有缺少的仆人，分多个页面 " +
				"您需要获取下一个仆人槽位，按升级成本排序"
	)

	@ConfigEditorBoolean
	public boolean gui = true;
	@Expose
	@ConfigOption(
		name = "启用工具提示",
		desc = "在制作的仆人中显示每个仆人的价格"
	)
	@ConfigEditorBoolean
	public boolean tooltip = true;
}
