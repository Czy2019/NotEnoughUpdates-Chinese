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
import io.github.moulberry.moulconfig.annotations.ConfigEditorDraggableList;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorInfoText;
import io.github.moulberry.moulconfig.annotations.ConfigEditorKeybind;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import io.github.moulberry.notenoughupdates.core.config.Position;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.github.moulberry.notenoughupdates.overlays.FarmingSkillOverlay.CPS_WINDOW_SIZE;

public class SkillOverlays {
	@ConfigOption(
		name = "技能叠加信息",
		desc =
			"要显示叠加信息，您需要一个§b数学锄头§77 或者一个带有§b耕作§77 附魔的斧头用于耕作，一个带有§b紧凑§77 的镐用于挖矿，或者一个带有§b专业§77 的钓竿"
	)
	@ConfigEditorInfoText()
	public boolean skillInfo = false;

	@ConfigOption(
		name = "耕作",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean farmingAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用耕作叠加信息",
		desc = "在耕作时显示叠加信息"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean farmingOverlay = true;

	@Expose
	@ConfigOption(
		name = "耕作文本",
		desc = "§e拖动文本以更改叠加信息的外观\n" +
			"§r持有数学锄头或使用带有耕作附魔的斧头在获取耕作经验时显示叠加信息"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"§b计数器: §e37,547,860",
			"§b作物/s: §e732",
			"§b耕作: §e12§77 [§e|||||||||||||||||§8||||||||§77] §e67%",
			"§b当前经验: §e6,734",
			"§b剩余经验: §e3,265",
			"§b经验/h: §e238,129",
			"§b偏航: §e68.25§lᴒ",
			"§bETA: §e13小时12分钟",
			"§b俯仰: §e69.42§lᴒ",
			"§b耕作: §e10,137,945/20,000,000",
			"§b金币/m §e57,432",
			"§b比赛估计 §e342,784",
		}
	)
	@ConfigAccordionId(id = 0)
	public List<Integer> farmingText = new ArrayList<>(Arrays.asList(0, 9, 10, 1, 2, 3, 4, 5, 7, 6, 11));

	@Expose
	@ConfigOption(
		name = "使用BZ价格计算金币/m",
		desc = "使用集市价格而不是NPC价格计算金币/m"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean useBZPrice = true;

	@Expose
	@ConfigOption(
		name = "暂停计时器",
		desc = "暂停XP/h计时器之前等待多少秒"
	)
	@ConfigAccordionId(id = 0)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 20,
		minStep = 1
	)
	public int farmingPauseTimer = 3;

	@Expose
	@ConfigOption(
		name = "作物速率时间框架",
		desc = "定义计算平均作物产量的时间段（以秒为单位）"
	)
	@ConfigAccordionId(id = 0)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = CPS_WINDOW_SIZE - 2,
		minStep = 1
	)
	public int farmingCropsPerSecondTimeFrame = 5;

	@Expose
	@ConfigOption(
		name = "作物速率单位",
		desc = "选择显示作物速率的单位"
	)
	@ConfigAccordionId(id = 0)
	@ConfigEditorDropdown(
		values = {"/秒", "/分钟", "/小时"}
	)
	public int farmingCropRateUnit = 0;

	@Expose
	@ConfigOption(
		name = "金币速率单位",
		desc = "选择显示金币速率的单位"
	)
	@ConfigAccordionId(id = 0)
	@ConfigEditorDropdown(
		values = {"/秒", "/分钟", "/小时"}
	)
	public int farmingCoinRateUnit = 0;

	@Expose
	@ConfigOption(
		name = "重置作物速率",
		desc = "在不活跃时重置作物速率值之前等待多少秒"
	)
	@ConfigAccordionId(id = 0)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = CPS_WINDOW_SIZE - 2,
		minStep = 1
	)
	public int farmingResetCPS = 5;

	@Expose
	public Position farmingPosition = new Position(10, 200);

	@Expose
	@ConfigOption(
		name = "耕作样式",
		desc = "更改耕作叠加信息的样式"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "有阴影", "全阴影"}
	)
	@ConfigAccordionId(id = 0)
	public int farmingStyle = 0;

	@ConfigOption(
		name = "挖矿",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean miningAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用挖矿叠加信息",
		desc = "在挖矿时显示叠加信息"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean miningSkillOverlay = true;

	@Expose
	@ConfigOption(
		name = "挖矿文本",
		desc = "§e拖动文本以更改叠加信息的外观\n" +
			"§r持有带有紧凑的镐在获取挖矿经验时显示叠加信息"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"§b紧凑: §e547,860",
			"§b方块/m: §e38.29",
			"§b挖矿: §e12§77 [§e|||||||||||||||||§8||||||||§77] §e67%",
			"§b当前经验: §e6,734",
			"§b剩余经验: §e3,265",
			"§b经验/h: §e238,129",
			"§b偏航: §e68.25§lᴒ",
			"§bETA: §e13小时12分钟",
			"§b紧凑进度: §e137,945/150,000"
		}
	)
	@ConfigAccordionId(id = 1)
	public List<Integer> miningText = new ArrayList<>(Arrays.asList(0, 8, 1, 2, 3, 4, 5, 7));
	@Expose
	@ConfigOption(
		name = "暂停计时器",
		desc = "暂停前等待多少秒"
	)
	@ConfigAccordionId(id = 1)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 20,
		minStep = 1
	)
	public int miningPauseTimer = 3;

	@Expose
	public Position miningPosition = new Position(10, 200);

	@Expose
	@ConfigOption(
		name = "挖矿样式",
		desc = "更改挖矿覆盖层的样式"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "阴影", "全阴影"}
	)
	@ConfigAccordionId(id = 1)
	public int miningStyle = 0;

	@ConfigOption(
		name = "钓鱼",
		desc = ""
	)
	@ConfigEditorAccordion(id = 3)
	public boolean fishingAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用钓鱼覆盖层",
		desc = "在钓鱼时显示一个带有有用信息的覆盖层"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean FishingSkillOverlay = true;

	@Expose
	@ConfigOption(
		name = "钓鱼文本",
		desc = "拖动文本以更改覆盖层的外观\n" +
			"在获得钓鱼经验时持有带有专业附魔的钓竿以显示覆盖层"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"专业: 7,945/10,000",
			"钓鱼: 12 [|||||||||||||||||░░░░░░░░░░] 67%",
			"当前经验: 6,734",
			"剩余经验: 3,265",
			"经验/小时: 238,129",
			"预计: 13小时12分钟",
			"计时器: 1分钟15秒"
		}
	)
	@ConfigAccordionId(id = 3)
	public List<Integer> fishingText = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));

	@Expose
	@ConfigOption(
		name = "暂停计时器",
		desc = "暂停前等待多少秒"
	)
	@ConfigAccordionId(id = 3)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 20,
		minStep = 1
	)
	public int fishingPauseTimer = 3;

	@Expose
	public Position fishingPosition = new Position(10, 200);

	@Expose
	@ConfigOption(
		name = "钓鱼样式",
		desc = "更改钓鱼覆盖层的样式"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "阴影", "全阴影"}
	)
	@ConfigAccordionId(id = 3)
	public int fishingStyle = 0;

	@Expose
	@ConfigOption(
		name = "切换钓鱼计时器",
		desc = "启动或停止钓鱼覆盖层上的计时器"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_END)
	@ConfigAccordionId(id = 3)
	public int fishKey = Keyboard.KEY_END;

	@Expose
	@ConfigOption(
		name = "钓鱼计时器提醒",
		desc = "更改计时器响铃前的时间（秒）"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 600,
		minStep = 20
	)
	@ConfigAccordionId(id = 3)
	public int customFishTimer = 300;

	@ConfigOption(
		name = "战斗",
		desc = ""
	)
	@ConfigEditorAccordion(id = 4)
	public boolean combatAccordion = false;

	@Expose
	@ConfigOption(
		name = "警告",
		desc = "战斗显示仅在你拥有统计书或冠军附魔时才会显示"
	)
	@ConfigEditorInfoText()
	@ConfigAccordionId(id = 4)
	public boolean combatInfo = false;

	@Expose
	@ConfigOption(
		name = "启用战斗覆盖层",
		desc = "在战斗时显示一个带有有用信息的覆盖层"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean combatSkillOverlay = false;

	@Expose
	@ConfigOption(
		name = "战斗文本",
		desc = "拖动文本以更改覆盖层的外观\n" +
			"持有带有统计书的物品以显示显示层"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"击杀: 547,860",
			"战斗: 12 [|||||||||||||||||░░░░░░░░░░] 67%",
			"当前经验: 6,734",
			"剩余经验: 3,265",
			"经验/小时: 238,129",
			"预计: 13小时12分钟",
			"冠军经验: 3,523"
		}
	)
	@ConfigAccordionId(id = 4)
	public List<Integer> combatText = new ArrayList<>(Arrays.asList(0, 6, 1, 2, 3, 4, 5));

	@Expose
	@ConfigOption(
		name = "暂停计时器",
		desc = "暂停前等待多少秒"
	)
	@ConfigAccordionId(id = 4)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 20,
		minStep = 1
	)
	public int combatPauseTimer = 3;

	@Expose
	public Position combatPosition = new Position(10, 200);

	@Expose
	@ConfigOption(
		name = "战斗样式",
		desc = "更改战斗覆盖层的样式"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "阴影", "全阴影"}
	)
	@ConfigAccordionId(id = 4)
	public int combatStyle = 0;

	@Expose
	@ConfigOption(
		name = "始终显示战斗覆盖层",
		desc = "即使没有统计书或冠军附魔也显示战斗覆盖层"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean alwaysShowCombatOverlay = false;
}
