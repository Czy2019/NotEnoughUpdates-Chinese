/*
 * Copyright (C) 2022 NotEnoughUpdates contributors
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
import io.github.moulberry.moulconfig.annotations.ConfigEditorKeybind;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import org.lwjgl.input.Keyboard;

public class WardrobeKeybinds {

	@Expose
	@ConfigOption(
		name = "启用衣柜快捷键",
		desc = "允许你使用数字键快速更换衣柜中的服装"
	)
	@ConfigEditorBoolean
	public boolean enableWardrobeKeybinds = false;

	@ConfigOption(
		name = "衣柜快捷键",
		desc = ""
	)
	@ConfigEditorAccordion(id = 2)
	public boolean wardrobeKeybindAccordion = false;

	@Expose
	@ConfigOption(
		name = "槽位 1",
		desc = "切换衣柜中第一个套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_1)
	@ConfigAccordionId(id = 2)
	public int wardrobeSlot1 = Keyboard.KEY_1;

	@Expose
	@ConfigOption(
		name = "槽位 2",
		desc = "切换衣柜中第二个套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_2)
	@ConfigAccordionId(id = 2)
	public int wardrobeSlot2 = Keyboard.KEY_2;

	@Expose
	@ConfigOption(
		name = "槽位 3",
		desc = "切换衣柜中第三个套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_3)
	@ConfigAccordionId(id = 2)
	public int wardrobeSlot3 = Keyboard.KEY_3;

	@Expose
	@ConfigOption(
		name = "槽位 4",
		desc = "切换衣柜中第四个套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_4)
	@ConfigAccordionId(id = 2)
	public int wardrobeSlot4 = Keyboard.KEY_4;

	@Expose
	@ConfigOption(
		name = "槽位 5",
		desc = "切换衣柜中第五个套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_5)
	@ConfigAccordionId(id = 2)
	public int wardrobeSlot5 = Keyboard.KEY_5;

	@Expose
	@ConfigOption(
		name = "槽位 6",
		desc = "切换衣柜中第六个套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_6)
	@ConfigAccordionId(id = 2)
	public int wardrobeSlot6 = Keyboard.KEY_6;

	@Expose
	@ConfigOption(
		name = "槽位 7",
		desc = "切换衣柜中第七个套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_7)
	@ConfigAccordionId(id = 2)
	public int wardrobeSlot7 = Keyboard.KEY_7;

	@Expose
	@ConfigOption(
		name = "槽位 8",
		desc = "切换衣柜中第八个套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_8)
	@ConfigAccordionId(id = 2)
	public int wardrobeSlot8 = Keyboard.KEY_8;

	@Expose
	@ConfigOption(
		name = "槽位 9",
		desc = "切换衣柜中第九个套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_9)
	@ConfigAccordionId(id = 2)
	public int wardrobeSlot9 = Keyboard.KEY_9;

	@Expose
	@ConfigOption(
		name = "卸下衣柜槽位",
		desc = "卸下当前激活的衣柜套装的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_0)
	@ConfigAccordionId(id = 2)
	public int wardrobePageUnequip = Keyboard.KEY_0;

	@Expose
	@ConfigOption(
		name = "上一页",
		desc = "打开衣柜中的上一页的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_MINUS)
	@ConfigAccordionId(id = 2)
	public int wardrobePagePrevious = Keyboard.KEY_MINUS;

	@Expose
	@ConfigOption(
		name = "下一页",
		desc = "打开衣柜中的下一页的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_EQUALS)
	@ConfigAccordionId(id = 2)
	public int wardrobePageNext = Keyboard.KEY_EQUALS;
}
