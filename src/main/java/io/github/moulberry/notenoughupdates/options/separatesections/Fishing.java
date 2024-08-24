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
import io.github.moulberry.moulconfig.annotations.ConfigEditorColour;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Fishing {
	@Expose
	@ConfigOption(
		name = "隐藏其他玩家钓鱼",
		desc = "方便选项，可以轻松隐藏其他玩家的钓钩、鱼竿线和钓鱼粒子\n" +
			"下面的高级选项允许你设置精确的颜色、粒子等。"
	)
	@ConfigEditorBoolean
	public boolean hideOtherPlayerAll = false;

	@ConfigOption(
		name = "即将到来的鱼警告",
		desc = ""
	)
	@ConfigEditorAccordion(id = 3)
	public boolean incomingFishAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用鱼警告（红色）",
		desc = "当你需要拉起鱼时显示红色的 '!'。警告会考虑到你的延迟"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean incomingFishWarningR = true;

	@Expose
	@ConfigOption(
		name = "启用鱼警告（黄色）",
		desc = "当鱼接近你的钓钩时显示黄色的 '!'"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean incomingFishWarning = true;

	@Expose
	@ConfigOption(
		name = "启用钩中声音",
		desc = "当 '!' 变红时播放高音的叮当声"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean incomingFishHookedSounds = true;

	@Expose
	@ConfigOption(
		name = "启用接近声音",
		desc = "当黄色的 '!' 显示时播放低音叮当声"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean incomingFishIncSounds = false;

	@ConfigOption(
		name = "音量",
		desc = ""
	)
	@ConfigAccordionId(id = 3)
	@ConfigEditorAccordion(id = 5)
	public boolean incomingFishVolumeAccordion = false;

	@Expose
	@ConfigOption(
		name = "钩中声音音量",
		desc = "设置钩中声音的音量"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 100,
		minStep = 1
	)
	@ConfigAccordionId(id = 5)
	public float incomingFishHookedSoundsVol = 25;

	@Expose
	@ConfigOption(
		name = "接近声音音量",
		desc = "设置接近声音的音量"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 100,
		minStep = 1
	)
	@ConfigAccordionId(id = 5)
	public float incomingFishIncSoundsVol = 10;

	@ConfigOption(
		name = "钓鱼粒子",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean particleAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用自定义粒子",
		desc = "允许你修改当鱼接近时出现的粒子，适用于你和其他玩家"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean enableCustomParticles = false;

	@ConfigOption(
		name = "你的粒子",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	@ConfigAccordionId(id = 0)
	public boolean yourParticlesAccordion = false;

	@Expose
	@ConfigOption(
		name = "粒子类型",
		desc = "更改生成的粒子类型\n" +
			"带有 (RGB) 的粒子类型支持自定义颜色\n" +
			"设置为 'NONE' 以禁用粒子"
	)
	@ConfigEditorDropdown(
		values = {"默认", "无", "火花 (RGB)", "漩涡 (RGB)", "尘埃 (RGB)", "火焰", "爆裂", "魔法爆裂"}
	)
	@ConfigAccordionId(id = 1)
	public int yourParticleType = 0;

	@Expose
	@ConfigOption(
		name = "自定义颜色",
		desc = "为粒子设置自定义颜色\n" +
			"仅适用于 (RGB) 粒子类型"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 1)
	public String yourParticleColour = "0:255:255:255:255";

	@ConfigOption(
		name = "其他玩家的粒子",
		desc = ""
	)
	@ConfigEditorAccordion(id = 2)
	@ConfigAccordionId(id = 0)
	public boolean otherParticlesAccordion = false;

	@Expose
	@ConfigOption(
		name = "粒子类型",
		desc = "更改生成的粒子类型\n" +
			"带有 (RGB) 的粒子类型支持自定义颜色\n" +
			"设置为 'NONE' 以禁用粒子"
	)
	@ConfigEditorDropdown(
		values = {"默认", "无", "火花 (RGB)", "漩涡 (RGB)", "尘埃 (RGB)", "火焰", "爆裂", "魔法爆裂"}
	)
	@ConfigAccordionId(id = 2)
	public int otherParticleType = 0;

	@Expose
	@ConfigOption(
		name = "自定义颜色",
		desc = "为粒子设置自定义颜色\n" +
			"仅适用于 (RGB) 粒子类型"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String otherParticleColour = "0:255:255:255:255";

	@ConfigOption(
		name = "鱼竿线颜色",
		desc = ""
	)
	@ConfigEditorAccordion(id = 4)
	public boolean rodAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用鱼竿线颜色",
		desc = "更改你和其他玩家的鱼竿线颜色\n" +
			"还可以固定鱼竿线的位置"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean enableRodColours = true;

	@Expose
	@ConfigOption(
		name = "自己的鱼竿颜色",
		desc = "更改你自己鱼竿线的颜色\n" +
			"可以将不透明度设置为 '0' 来隐藏"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 4)
	public String ownRodColour = "0:255:0:0:0";

	@Expose
	@ConfigOption(
		name = "其他玩家鱼竿颜色",
		desc = "更改其他玩家鱼竿线的颜色\n" +
			"可以将不透明度设置为 '0' 来隐藏"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 4)
	public String otherRodColour = "0:255:0:0:0";

	@ConfigOption(
		name = "钓鱼计时器",
		desc = ""
	)
	@ConfigEditorAccordion(id = 6)
	public boolean fishingAccordion = false;

	@Expose
	@ConfigOption(
		name = "显示钓鱼计时器",
		desc = "在你的钓钩上方显示一个计时器，显示你当前的时间"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 6)
	public boolean fishingTimer = false;

	@Expose
	@ConfigOption(
		name = "钓鱼计时器颜色",
		desc = "钓鱼计时器的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 6)
	public String fishingTimerColor = "0:255:0:0:0";

	@Expose
	@ConfigOption(
		name = "钓鱼计时器颜色（20秒）",
		desc = "20秒或更多时间后，钓鱼计时器的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 6)
	public String fishingTimerColor30SecPlus = "0:255:0:0:0";

	@Expose
	@ConfigOption(
		name = "钓鱼计时器声音（20秒）",
		desc = "20秒后播放一个声音"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 6)
	public boolean fishingSound30Sec = true;

	@Expose
	@ConfigOption(
		name = "启用蜗牛宠物检查",
		desc = "检查你正在使用的宠物以确定钓鱼计时器颜色/声音的冷却时间"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 6)
	public boolean enableSlugCheck = true;

	@ConfigOption(
		name = "奖杯奖励",
		desc = ""
	)
	@ConfigEditorAccordion(id = 7)
	public boolean trophyReward = false;

	@Expose
	@ConfigOption(
		name = "奖杯奖励叠加",
		desc = "在 Odger 上显示一个叠加，显示有关你的奖杯的信息"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 7)
	public boolean trophyRewardOverlay = true;

	@Expose
	@ConfigOption(
		name = "奖杯奖励工具提示",
		desc = "在 Odger 库存中显示你的奖杯交换为工具提示"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 7)
	public boolean trophyRewardTooltips = true;

}
