/*
 * Copyright (C) 2022-2023 NotEnoughUpdates contributors
 *
 * This file is part of NotEnoughUpdates.
 *
 * NotEnoughUpdates is free software: you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * NotEnoughUpdates is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with NotEnoughUpdates. If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorColour;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorInfoText;
import io.github.moulberry.moulconfig.annotations.ConfigEditorKeybind;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import org.lwjgl.input.Keyboard;

public class StorageGUI {
	@ConfigOption(
		name = "存储叠加",
		desc = "末影箱 / 背包"
	)
	@ConfigEditorAccordion(id = 1)
	public boolean storageOverlayAccordion = false;

	@Expose
	public int selectedIndex = 0;
	@ConfigOption(
		name = "警告",
		desc = "您需要关闭快速渲染和抗锯齿才能使这些设置生效\n" +
			"您可以在视频设置中找到这些选项"
	)
	@ConfigEditorInfoText()
	@ConfigAccordionId(id = 1)
	public boolean storageGUIWarning = false;
	@Expose
	@ConfigOption(
		name = "启用存储 GUI",
		desc = "访问 /storage 时显示自定义存储叠加\n" +
			"使在页面之间切换更加容易，也允许搜索所有存储"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean enableStorageGUI3 = true;

	@Expose
	@ConfigOption(
		name = "存储高度",
		desc = "更改存储预览部分的高度。增加此高度可以一次性查看更多存储"
	)
	@ConfigEditorSlider(
		minValue = 104,
		maxValue = 312,
		minStep = 26
	)
	@ConfigAccordionId(id = 1)
	public int storageHeight = 208;

	@Expose
	@ConfigOption(
		name = "存储风格",
		desc = "更改叠加层的视觉风格"
	)
	@ConfigEditorDropdown(
		values = {"透明", "Minecraft", "灰色", "自定义"}
	)
	@ConfigAccordionId(id = 1)
	public int displayStyle = 0;

	@Expose
	@ConfigOption(
		name = "末影箱预览",
		desc = "当将鼠标悬停在左侧选择器上时，预览末影箱页面"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean enderchestPreview = true;

	@Expose
	@ConfigOption(
		name = "背包预览",
		desc = "当将鼠标悬停在左侧选择器上时，预览背包"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean backpackPreview = true;

	@Expose
	@ConfigOption(
		name = "垂直紧凑",
		desc = "当背包之间有尺寸差异时，去除背包之间的间距"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean masonryMode = false;

	@Expose
	@ConfigOption(
		name = "花式玻璃板",
		desc = "用花式连接纹理替换存储容器中的玻璃板纹理"
	)
	@ConfigEditorDropdown(
		values = {"开启", "锁定", "关闭"}
	)
	@ConfigAccordionId(id = 1)
	public int fancyPanes = 0;

	@Expose
	@ConfigOption(
		name = "搜索栏自动聚焦",
		desc = "按下按键时自动聚焦搜索栏"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean searchBarAutofocus = true;

	@Expose
	@ConfigOption(
		name = "显示附魔光辉",
		desc = "在存储 GUI 中切换附魔光辉"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean showEnchantGlint = true;

	@Expose
	@ConfigOption(
		name = "选定存储颜色",
		desc = "更改用于绘制选定背包边框的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 1)
	public String selectedStorageColour = "0:255:255:223:0";

	@Expose
	@ConfigOption(
		name = "自定义文本颜色",
		desc = "使用自定义默认文本颜色。\n" +
			"覆盖叠加样式设置的颜色。\n" +
			"可以通过在页面标题中使用颜色代码来覆盖"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean useCustomTextColour = false;

	@Expose
	@ConfigOption(
		name = "自定义文本颜色",
		desc = "需要将上面的选项设置为 true"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 1)
	public String customTextColour = "0:255:144:144:144";

	@Expose
	@ConfigOption(
		name = "可滚动工具提示",
		desc = "支持小屏幕用户的滚动工具提示\n" +
			"这将防止菜单在按住按键时滚动，使您可以滚动工具提示"
	)
	@ConfigEditorKeybind(defaultKey = 0)
	@ConfigAccordionId(id = 1)
	public int cancelScrollKey = 0;

	@Expose
	@ConfigOption(
		name = "禁用 Optifine CIT",
		desc = "禁用 Optifine 自定义物品以提高性能"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean disableCIT = false;

	@ConfigOption(
		name = "库存背包",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean inventorySlotAccordion = false;

	@Expose
	@ConfigOption(
		name = "库存背包",
		desc = "在您的库存中添加一个“第10个槽位”，允许您快速访问背包"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean showInvBackpack = false;

	//public boolean showInvBackpack = false;
	@Expose
	@ConfigOption(
		name = "滚动到背包",
		desc = "允许使用鼠标滚轮滚动到背包。\n" +
			"“滚动（按键）” = 仅在按下“背包滚动按键”（默认: SHIFT）时允许滚动到第10个槽位"
	)
	@ConfigEditorDropdown(
		values = {"滚动（按键）", "滚动（始终）", "不滚动"}
	)
	@ConfigAccordionId(id = 0)
	public int scrollToBackpack2 = 0;

	@Expose
	@ConfigOption(
		name = "背包侧边",
		desc = "设置热键栏中背包槽位显示在哪一侧"
	)
	@ConfigEditorDropdown(
		values = {"左侧", "右侧"}
	)
	@ConfigAccordionId(id = 0)
	public int backpackHotbarSide = 0;

	@Expose
	@ConfigOption(
		name = "背包预览",
		desc = "当选择背包时，在屏幕上显示其内容"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean showInvBackpackPreview = true;

	@Expose
	@ConfigOption(
		name = "背包不透明度%",
		desc = "更改背包预览背景的透明度"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 100,
		minStep = 5
	)
	@ConfigAccordionId(id = 0)
	public int backpackOpacity = 50;

	@Expose
	@ConfigOption(
		name = "背包滚动按键",
		desc = "更改需要按下的键，以允许在背包之间滚动"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_LSHIFT)
	@ConfigAccordionId(id = 0)
	public int backpackScrollKey = Keyboard.KEY_LSHIFT;

	@Expose
	@ConfigOption(
		name = "背包热键",
		desc = "快速切换到背包槽位的热键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_GRAVE)
	@ConfigAccordionId(id = 0)
	public int backpackHotkey = Keyboard.KEY_GRAVE;

	@Expose
	@ConfigOption(
		name = "箭头键背包",
		desc = "使用箭头键 [左], [右] 在背包之间移动，使用 [下] 导航背包，即使槽位未被选中。按键可以在下方自定义"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean arrowKeyBackpacks = false;

	@ConfigOption(
		name = "箭头键背包按键绑定",
		desc = ""
	)
	@ConfigEditorAccordion(id = 2)
	@ConfigAccordionId(id = 0)
	public boolean backpackArrowAccordion = false;

	@Expose
	@ConfigOption(
		name = "背包左侧",
		desc = "选择左侧的背包"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_LEFT)
	@ConfigAccordionId(id = 2)
	public int arrowLeftKey = Keyboard.KEY_LEFT;

	@Expose
	@ConfigOption(
		name = "背包右侧",
		desc = "选择右侧的背包"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_RIGHT)
	@ConfigAccordionId(id = 2)
	public int arrowRightKey = Keyboard.KEY_RIGHT;

	@Expose
	@ConfigOption(
		name = "背包打开",
		desc = "打开选定的背包"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_DOWN)
	@ConfigAccordionId(id = 2)
	public int arrowDownKey = Keyboard.KEY_DOWN;
}
