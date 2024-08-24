/*
 * Copyright (C) 2022-2024 NotEnoughUpdates contributors
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
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorKeybind;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import org.lwjgl.input.Keyboard;

public class Misc {
	@Expose
	@ConfigOption(
		name = "仅在SkyBlock上显示",
		desc = "物品列表和其他一些GUI元素仅在SkyBlock上显示"
	)
	@ConfigEditorBoolean
	public boolean onlyShowOnSkyblock = true;

	@Expose
	@ConfigOption(
		name = "隐藏药水效果",
		desc = "在SkyBlock上隐藏你库存中的药水效果"
	)
	@ConfigEditorBoolean
	public boolean hidePotionEffect = true;

	@Expose
	@ConfigOption(
		name = "主播模式",
		desc = "随机化记分板和聊天消息中的大厅名称，以帮助防止直播间干扰"
	)
	@ConfigEditorBoolean
	public boolean streamerMode = false;

	@Expose
	@ConfigOption(
		name = "修复Steve头像",
		desc = "修复某些头像和皮肤在旧Java版本上无法下载的问题。可能需要重启。"
	)
	@ConfigEditorBoolean
	public boolean fixSteveSkulls = true;

	@ConfigOption(
		name = "仙女魂路标",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean fariySoulAccordion = false;
	@Expose
	@ConfigOption(
		name = "跟踪仙女魂",
		desc = "跟踪发现的仙女魂"
	)
	@ConfigEditorBoolean(runnableId = 20)
	@ConfigAccordionId(id = 0)
	public boolean trackFairySouls = true;

	@Expose
	@ConfigOption(
		name = "显示路标",
		desc = "显示仙女魂路标（需要仙女魂跟踪）"
	)
	@ConfigEditorBoolean(
		runnableId = 15
	)
	@ConfigAccordionId(id = 0)
	public boolean fariySoul = false;

	@Expose
	@ConfigOption(
		name = "显示路标距离",
		desc = "显示每个仙女魂路标的距离"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean fairySoulWaypointDistance = false;

	@Expose
	@ConfigOption(
		name = "标记所有为已发现",
		desc = "将当前地点的所有仙女魂标记为已发现"
	)
	@ConfigEditorButton(
		runnableId = 16,
		buttonText = "清除"
	)
	@ConfigAccordionId(id = 0)
	public boolean fariySoulClear = false;

	@Expose
	@ConfigOption(
		name = "标记所有为未发现",
		desc = "将当前地点的所有仙女魂标记为未发现"
	)
	@ConfigEditorButton(
		runnableId = 17,
		buttonText = "恢复"
	)
	@ConfigAccordionId(id = 0)
	public boolean fariySoulUnclear = false;

	@Expose
	@ConfigOption(
		name = "GUI点击声音",
		desc = "在各种NEU相关的GUI中点击按钮时播放点击声音"
	)
	@ConfigEditorBoolean
	public boolean guiButtonClicks = true;

	@Expose
	@ConfigOption(
		name = "替换聊天社交选项",
		desc = "用NEU的个人资料查看器或/ah替换Hypixel的聊天社交选项"
	)
	@ConfigEditorDropdown(
		values = {"关闭", "/pv", "/ah"}
	)
	public int replaceSocialOptions1 = 1;

	@Expose
	@ConfigOption(
		name = "伤害指示器风格",
		desc = "更改SkyBlock的伤害指示器为缩短数字\n" +
			"\u00A7c一些旧动画模组会破坏此功能"
	)
	@ConfigEditorBoolean
	public boolean damageIndicatorStyle2 = false;

	@Expose
	@ConfigOption(
		name = "个人资料查看器",
		desc = "打开个人资料查看器 (/pv)\n" +
			"显示玩家的统计数据和净资产"
	)
	@ConfigEditorButton(runnableId = 13, buttonText = "打开")
	public boolean openPV = true;

	@ConfigOption(
		name = "自定义附魔颜色",
		desc = ""
	)
	@ConfigEditorAccordion(
		id = 1
	)
	public boolean neuEnchantsAccordion = true;
	@Expose
	@ConfigOption(
		name = "编辑附魔颜色",
		desc = "更改某些 SkyBlock 附魔的颜色 (/neuec)"
	)
	@ConfigEditorButton(runnableId = 8, buttonText = "打开")
	@ConfigAccordionId(id = 1)
	public boolean editEnchantColoursButton = true;

	@Expose
	@ConfigOption(
		name = "色彩文本速度",
		desc = "更改物品名称的色彩文本速度 (/neucustomize) 和附魔颜色 (/neuec) 使用色彩代码 (&z)"
	)
	@ConfigEditorSlider(
		minValue = 10,
		maxValue = 500,
		minStep = 10
	)
	@ConfigAccordionId(id = 1)
	public int chromaSpeed = 100;

	@Expose
	@ConfigOption(
		name = "缓存工具提示附魔",
		desc = "缓存物品附魔到工具提示中，以便每次物品查找时只使用一次 neuec 配置。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean cacheItemEnchant = true;

	@Expose
	@ConfigOption(
		name = "禁用头骨重新纹理",
		desc = "禁用头骨重新纹理。"
	)
	@ConfigEditorBoolean
	public boolean disableSkullRetexturing = false;

	@Expose
	@ConfigOption(
		name = "禁用 NPC 重新纹理",
		desc = "禁用 NPC 重新纹理。"
	)
	@ConfigEditorBoolean
	public boolean disableNPCRetexturing = false;

	@Expose
	@ConfigOption(
		name = "维基",
		desc = "在维基渲染器中使用的维基。"
	)
	@ConfigEditorDropdown(values = {
		"Hypixel",
		"Fandom"
	})
	public int wiki = 0;

	@Expose
	@ConfigOption(
		name = "导航键绑定",
		desc = "按此键绑定以显示到各种 NPC 的导航点"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_NONE)
	public int keybindWaypoint = Keyboard.KEY_NONE;

	@Expose
	@ConfigOption(
		name = "关闭附近导航点",
		desc = "当你接近导航点时自动取消跟踪。"
	)
	@ConfigEditorBoolean
	public boolean untrackCloseWaypoints = true;

	@Expose
	@ConfigOption(
		name = "双重传送",
		desc = "使用 SHIFT+<导航点键绑定> 传送到导航点时进行双重传送。"
	)
	@ConfigEditorBoolean
	public boolean warpTwice = true;

	@Expose
	@ConfigOption(
		name = "计算器",
		desc = "在标志弹出窗口 (AH/BZ) 和 neu 搜索栏中将 §9\"1+2\"§7 替换为计算结果"
	)
	@ConfigEditorDropdown(values = {"关闭", "启用并带有 ! 前缀", "始终启用"})
	public int calculationMode = 2;

	@Expose
	@ConfigOption(
		name = "计算器精度",
		desc = "计算器中显示的小数位数"
	)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 100,
		minStep = 1
	)
	public int calculationPrecision = 5;

	@Expose
	@ConfigOption(
		name = "启用 Abiphone 警告",
		desc = "删除 Abiphone 中的联系人时要求确认"
	)
	@ConfigEditorBoolean
	public boolean abiphoneWarning = true;

	@Expose
	@ConfigOption(
		name = "启用 Coop 警告",
		desc = "点击个人资料菜单中的 Coop 钻石时要求确认，并防止错误的 /coopadd 命令"
	)
	@ConfigEditorBoolean
	public boolean coopWarning = true;

	@Expose
	@ConfigOption(
		name = "过滤聊天中的 Skyblock 等级",
		desc = "需要启用 \"SkyBlock 等级在聊天中\" 的 skyblock 设置"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 300,
		minStep = 10
	)
	public int filterChatLevel = 0;

	@Expose
	@ConfigOption(
		name = "启用文本字段调整",
		desc = "允许在文本字段中使用 ctrl + z、ctrl + y 和 ctrl + Lshift + z"
	)
	@ConfigEditorBoolean
	public boolean textFieldTweaksEnabled = true;

	@Expose
	@ConfigOption(
		name = "Abiphone 收藏夹",
		desc = "允许将 Abiphone 联系人设置为收藏夹，切换显示所有联系人或仅显示收藏夹，并禁用删除联系人的选项。"
	)
	@ConfigEditorBoolean
	public boolean abiphoneFavourites = true;

	@Expose
	@ConfigOption(
		name = "组加入 PV",
		desc = "通过点击聊天消息查看其他玩家的个人资料，当他们加入地下城或 Kuudra 组时。"
	)
	@ConfigEditorBoolean
	public boolean dungeonGroupsPV = true;

	@Expose
	@ConfigOption(
		name = "旧 SkyBlock 菜单",
		desc = "在 SkyBlock 菜单中显示旧按钮：交易、配件、药水、箭袋、钓鱼和背包。 " +
			"§c仅在激活增益饼干效果时有效。"
	)
	@ConfigEditorBoolean
	public boolean oldSkyBlockMenu = false;

	@Expose
	@ConfigOption(
		name = "默认盔甲颜色",
		desc = "将所有盔甲（包括自己和其他人）的颜色更改为默认物品颜色。也会覆盖任何 /neucustomize 的更改。"
	)
	@ConfigEditorBoolean
	public boolean defaultArmorColour = false;

	@Expose
	@ConfigOption(
		name = "搜索 AH/BZ 中的当前物品",
		desc = "在 AH/BZ 中搜索你正在悬停的物品"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_M)
	public int openAHKeybind = Keyboard.KEY_M;

	@Expose
	@ConfigOption(
		name = "打开 /recipe 以获取当前物品",
		desc = "打开你正在悬停的物品的 SkyBlock 配方。用于超级合成"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_NONE)
	public int openSkyBlockRecipeKeybind = Keyboard.KEY_NONE;

	@Expose
	@ConfigOption(
		name = "倒计时计算",
		desc = "显示物品工具提示中倒计时结束的 (估计) 时间戳，相对于你的时区。也适用于 §e/neucalendar§r。"
	)
	@ConfigEditorDropdown(
		values = {"关闭", "AM/PM [1PM]", "24小时 [13:00]"}
	)
	public int showWhenCountdownEnds = 1;

	@Expose
	@ConfigOption(
		name = "使用英文倒计时",
		desc = "使用英文语言进行倒计时，而不是系统选择的语言"
	)
	@ConfigEditorBoolean
	public boolean useEnglishCountdown = false;

	@Expose
	@ConfigOption(
		name = "停止心形动画",
		desc = "停止心形的再生效果动画"
	)
	@ConfigEditorBoolean
	public boolean hideRegenBounce = false;

	@Expose
	@ConfigOption(
		name = "打开 /neurename 的键绑定",
		desc = "打开你正在悬停的物品上的 /neurename"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_NONE)
	public int neuCustomizeKeybind = Keyboard.KEY_NONE;
}
