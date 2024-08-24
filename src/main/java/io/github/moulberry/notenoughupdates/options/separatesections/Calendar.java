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
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Calendar {
	@Expose
	@ConfigOption(
		name = "事件通知",
		desc = "显示 SkyBlock 日历事件的通知"
	)
	@ConfigEditorBoolean
	public boolean eventNotifications = true;

	@Expose
	@ConfigOption(
		name = "即将开始时间",
		desc = "在事件开始前显示通知，时间单位为秒。\n" +
			"0 = 不显示提前通知"
	)
	@ConfigEditorSlider(
		minValue = 0f,
		maxValue = 600f,
		minStep = 30f
	)
	public int startingSoonTime = 300;

	@Expose
	@ConfigOption(
		name = "背包中的计时器",
		desc = "在背包界面时，在屏幕顶部显示到下一个事件的倒计时"
	)
	@ConfigEditorBoolean
	public boolean showEventTimerInInventory = true;

	@Expose
	@ConfigOption(
		name = "通知声音",
		desc = "事件开始时播放声音"
	)
	@ConfigEditorBoolean
	public boolean eventNotificationSounds = true;

	@Expose
	@ConfigOption(
		name = "万圣节通知",
		desc = "在万圣节中，当时间达到晚上 7 点时发送通知"
	)
	@ConfigEditorBoolean
	public boolean spookyNightNotification = true;
}
