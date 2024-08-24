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
import io.github.moulberry.moulconfig.annotations.ConfigEditorDraggableList;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorKeybind;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TooltipTweaks {
	@ConfigOption(
		name = "提示信息价格",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean priceInfoAccordion = false;

	@Expose
	@ConfigOption(
		name = "价格信息（拍卖行）",
		desc = "§r选择您希望在可拍卖物品提示中查看的价格信息\n" +
			"§e拖动文本以重新排列"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"§e最低 BIN",
			"§e拍卖行价格",
			"§e拍卖行销售",
			"§e原料成本",
			"§e平均最低 BIN",
			"§e地牢成本"
		}
	)
	@ConfigAccordionId(id = 0)
	public List<Integer> priceInfoAuc = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 5));

	@Expose
	@ConfigOption(
		name = "价格信息（集市）",
		desc = "§r选择您希望在集市物品提示中查看的价格信息\n" +
			"§e拖动文本以重新排列"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"§e购买",
			"§e出售",
			"§e购买（即时）",
			"§e出售（即时）",
			"§e原料成本",
			"§e即时购买（每小时）",
			"§e即时出售（每小时）",
			"§e即时购买（每日）",
			"§e即时出售（每日）",
			"§e即时购买（每周）",
			"§e即时出售（每周）"
		}
	)
	@ConfigAccordionId(id = 0)
	public List<Integer> priceInfoBaz = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));

	@Expose
	@ConfigOption(
		name = "显示无法出售物品的原料成本",
		desc = "原料成本将显示在无法在拍卖行或集市出售的物品上"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean rawCraft = true;

	@Expose
	@ConfigOption(
		name = "显示 NPC 出售价格",
		desc = "显示物品可以出售给 NPC 商店的价格"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean npcSellPrice = false;

	@Expose
	@ConfigOption(
		name = "显示捐赠状态",
		desc = "在您已捐赠给博物馆的物品上添加额外的一行。访问博物馆的所有页面以填充此列表。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean museumDonationStatus = false;

	@Expose
	@ConfigOption(
		name = "使用简短数字格式",
		desc = "使用简短数字（5.1m），而不是 5,130,302"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean shortNumberFormatPrices = false;

	@Expose
	@ConfigOption(
		name = "显示库存物品的价格信息",
		desc = "显示您库存中物品的价格信息"
	)
	@ConfigEditorBoolean
	public boolean showPriceInfoInvItem = true;

	@Expose
	@ConfigOption(
		name = "显示拍卖物品的价格信息",
		desc = "显示拍卖物品的价格信息"
	)
	@ConfigEditorBoolean
	public boolean showPriceInfoAucItem = true;

	@Expose
	@ConfigOption(
		name = "价格信息快捷键",
		desc = "仅在按住某个键时显示价格信息。"
	)
	@ConfigEditorBoolean
	public boolean disablePriceKey = false;

	@Expose
	@ConfigOption(
		name = "显示价格信息快捷键",
		desc = "按住此键以显示价格信息提示"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_NONE)
	public int disablePriceKeyKeybind = Keyboard.KEY_NONE;

	@Expose
	@ConfigOption(
		name = "始终显示所需的地牢物品",
		desc = "如果除了精华之外还需要其他物品，则始终显示所需的物品"
	)
	@ConfigEditorBoolean
	public boolean alwaysShowRequiredItems = false;

	@Expose
	@ConfigOption(
		name = "显示重铸统计信息",
		desc = "显示重铸石将应用的统计数据。"
	)
	@ConfigEditorBoolean
	public boolean showReforgeStats = true;

	@Expose
	@ConfigOption(
		name = "显示宝石统计信息",
		desc = "显示宝石将应用的统计数据"
	)
	@ConfigEditorBoolean
	public boolean showGemstoneStats = true;

	@Expose
	@ConfigOption(
		name = "隐藏默认重铸统计信息",
		desc = "仅对 Hypixel 添加到重铸石的传奇物品隐藏重铸统计信息"
	)
	@ConfigEditorBoolean
	public boolean hideDefaultReforgeStats = true;

	@Expose
	@ConfigOption(
		name = "缺失附魔列表",
		desc = "按 LSHIFT 时显示物品上缺失的附魔"
	)
	@ConfigEditorBoolean
	public boolean missingEnchantList = true;

	@Expose
	@ConfigOption(
		name = "调整提示框大小",
		desc = "调整提示框大小以使其可读"
	)
	@ConfigEditorDropdown(
		values = {"默认", "小", "正常", "大", "自动"}
	)
	public int guiScale = 0;

	@Expose
	@ConfigOption(
		name = "自定义提示框",
		desc = "用 NEU 的自定义提示框替换提示框"
	)
	@ConfigEditorBoolean
	public boolean customTooltips = false;

	@Expose
	@ConfigOption(
		name = "可滚动提示框",
		desc = "使提示框文本可滚动，在使用鼠标悬停在物品上时使某些文本行消失。"
	)
	@ConfigEditorBoolean
	public boolean scrollableTooltips = false;

	@Expose
	@ConfigOption(
		name = "扩展宠物经验要求",
		desc = "显示宠物所需的完整经验数量"
	)
	@ConfigEditorBoolean
	public boolean petExtendExp = false;

	@Expose
	@ConfigOption(
		name = "提示框边框颜色",
		desc = "使提示框的边框与物品的稀有度匹配（仅 NEU 提示框）"
	)
	@ConfigEditorBoolean
	public boolean tooltipBorderColours = true;

	@Expose
	@ConfigOption(
		name = "提示框边框透明度",
		desc = "更改稀有度高亮的透明度（仅 NEU 提示框）"
	)
	@ConfigEditorSlider(
		minValue = 0f,
		maxValue = 255f,
		minStep = 1f
	)
	public int tooltipBorderOpacity = 200;

	@Expose
	@ConfigOption(
		name = "力量石统计",
		desc = "显示您在力量石上的真实魔法力量和真实属性提升"
	)
	@ConfigEditorBoolean
	public boolean powerStoneStats = true;

	@ConfigOption(
		name = "RNG 表",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean rngMeter = false;

	@Expose
	@ConfigOption(
		name = "分数/经验显示为分数",
		desc = "在击杀和地牢 RNG 表库存中显示分数而不是百分比"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean rngMeterFractionDisplay = true;

	@Expose
	@ConfigOption(
		name = "每分数/经验利润",
		desc = "显示 RNG 表库存中的每分数/经验的金币数量"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean rngMeterProfitPerUnit = true;

	@Expose
	@ConfigOption(
		name = "地牢/击杀所需次数",
		desc = "显示 RNG 表需要的地牢运行次数或击杀首领次数"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean rngMeterRunsNeeded = true;

	@Expose
	@ConfigOption(
		name = "Abiphone NPC 要求",
		desc = "显示将 NPC 添加为 Abiphone 联系人所需的条件"
	)
	@ConfigEditorBoolean
	public boolean abiphoneContactRequirements = true;

	@Expose
	@ConfigOption(
		name = "Abiphone NPC 标记",
		desc = "点击 NPC 设置标记位置"
	)
	@ConfigEditorBoolean
	public boolean abiphoneContactMarker = true;

	@Expose
	@ConfigOption(
		name = "商店中的精华价格",
		desc = "显示地牢中心精华商店中的精华价格"
	)
	@ConfigEditorBoolean
	public boolean essencePriceInEssenceShop = true;

	@ConfigOption(
		name = "花园访客",
		desc = ""
	)
	@ConfigEditorAccordion(id = 2)
	public boolean gardenVisitors = false;

	@Expose
	@ConfigOption(
		name = "花园 NPC 中的物品成本",
		desc = "显示花园 NPC 商店中的物品成本"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean gardenNpcPrice = true;

	@Expose
	@ConfigOption(
		name = "铜币价值",
		desc = "计算铜币的金币价值"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean copperCoins = true;

	@Expose
	@ConfigOption(
		name = "拍卖行物品成本阈值",
		desc = "忽略成本低于或等于此铜币数的拍卖行物品"
	)
	@ConfigEditorSlider(
		minValue = 0f,
		maxValue = 500f,
		minStep = 5f
	)
	@ConfigAccordionId(id = 2)
	public double AHPriceIgnoreThreshold = 0;

	@Expose
	@ConfigOption(
		name = "忽略拍卖行物品",
		desc = "忽略所有可以出售到拍卖行的物品"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean ignoreAllAHItems = true;
}
