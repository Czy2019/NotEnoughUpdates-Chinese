/*
 * 版权所有 (C) 2022 NotEnoughUpdates 贡献者
 *
 * 本文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：您可以根据自由软件基金会发布的 GNU 较宽通用公共许可证条款，
 * 重新分发和/或修改它，许可证版本为 3，或（根据您的选择）任何更高版本。
 *
 * NotEnoughUpdates 是在希望它会有用的情况下分发的，
 * 但没有任何担保；甚至没有暗示的适销性或适合特定目的的担保。有关更多详细信息，请参见 GNU
 * 较宽通用公共许可证。
 *
 * 您应该已经收到了一份 GNU 较宽通用公共许可证的副本
 * 与 NotEnoughUpdates 一起提供。如果没有，请访问 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorInfoText;
import io.github.moulberry.moulconfig.annotations.ConfigEditorKeybind;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import org.lwjgl.input.Keyboard;

public class SlotLocking {
	@Expose
	@ConfigOption(
		name = "\u00A7c警告",
		desc = "请确保在启用 NEU 之前关闭 SBA 的锁定槽位"
	)
	@ConfigEditorInfoText()
	public boolean slotLockWarning = false;

	@Expose
	@ConfigOption(
		name = "启用槽位锁定",
		desc = "允许您锁定槽位并创建槽位绑定"
	)
	@ConfigEditorBoolean
	public boolean enableSlotLocking = false;

	@Expose
	@ConfigOption(
		name = "启用槽位绑定",
		desc = "允许您创建槽位绑定\n注意：\"启用槽位锁定\" 必须开启"
	)
	@ConfigEditorBoolean
	public boolean enableSlotBinding = true;

	@Expose
	@ConfigOption(
		name = "不要丢弃绑定槽位",
		desc = "槽位绑定也会作为锁定槽位（防止在背包中丢弃/移动）"
	)
	@ConfigEditorBoolean
	public boolean bindingAlsoLocks = false;

	@Expose
	@ConfigOption(
		name = "槽位锁定按键",
		desc = "点击此按键来锁定槽位\n" +
			"按住此按键并拖动以绑定槽位"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_L)
	public int slotLockKey = Keyboard.KEY_L;

	@Expose
	@ConfigOption(
		name = "在交易中锁定槽位",
		desc = "防止在自定义交易窗口中交易锁定的物品"
	)
	@ConfigEditorBoolean
	public boolean lockSlotsInTrade = true;

	@Expose
	@ConfigOption(
		name = "禁用存储中的锁定",
		desc = "在存储界面中禁用槽位锁定和绑定"
	)
	@ConfigEditorBoolean
	public boolean disableInStorage = false;

	@Expose
    /*@ConfigOption(
            name = "物品交换丢弃延迟",
            desc = "设置交换到另一个物品后可以丢弃它的延迟。\n"+
                    "这是为了修复一个允许您丢弃锁定槽位物品的错误。"
    )
    @ConfigEditorSlider(
            minValue = 0,
            maxValue = 500,
            minStep = 5
    )*/
	public int slotLockSwapDelay = 100;

	@Expose
	@ConfigOption(
		name = "槽位锁定声音",
		desc = "锁定/解锁槽位时播放叮当声"
	)
	@ConfigEditorBoolean
	public boolean slotLockSound = true;

	@Expose
	@ConfigOption(
		name = "槽位锁定声音音量",
		desc = "设置叮当声的音量"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 100,
		minStep = 1
	)
	public float slotLockSoundVol = 20;

	@Expose
	@ConfigOption(
		name = "重置锁定槽位",
		desc = "运行 §e/neuresetslotlocking"
	)
	@ConfigEditorButton(
		runnableId = 28,
		buttonText = "重置"
	)
	public float resetSlotLocking = 39;
}
