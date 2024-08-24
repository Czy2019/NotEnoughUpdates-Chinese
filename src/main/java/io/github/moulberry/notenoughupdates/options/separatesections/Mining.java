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
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorColour;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDraggableList;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import io.github.moulberry.moulconfig.observer.Property;
import io.github.moulberry.notenoughupdates.core.config.Position;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mining {
	@ConfigOption(
		name = "路线点",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean waypointsAccordion = false;

	@Expose
	@ConfigOption(
		name = "矿山路线点",
		desc = "在矮人矿山中显示通往各个位置的路线点\n" +
			"使用\"仅限委托\"仅显示活动委托位置"
	)
	@ConfigEditorDropdown(
		values = {"隐藏", "仅限委托", "总是"}
	)
	@ConfigAccordionId(id = 0)
	public int locWaypoints = 1;

	@Expose
	@ConfigOption(
		name = "在位置时隐藏路线点",
		desc = "如果您已经在路线点的位置，则隐藏委托路线点。\n" +
			"仅在路线点设置为\"仅限委托\"时有效"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean hideWaypointIfAtLocation = true;

	@Expose
	@ConfigOption(
		name = "特使路线点",
		desc = "在矮人矿山中显示通往特使的路线点\n" +
			"使用\"委托结束\"仅在完成委托后显示"
	)
	@ConfigEditorDropdown(
		values = {"隐藏", "委托结束", "总是"}
	)
	@ConfigAccordionId(id = 0)
	public int emissaryWaypoints = 1;

	@Expose
	@ConfigOption(
		name = "启用粉末鬼魂路线点",
		desc = "在粉末鬼魂的位置显示一个路线点"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean powderGhastWaypoint = true;

	@Expose
	@ConfigOption(
		name = "启用陨星路线点",
		desc = "在陨星的位置显示一个路线点"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean fallenStarWaypoint = true;

	@Expose
	@ConfigOption(
		name = "冰晶隧道路线点",
		desc = "在冰晶隧道中显示通往各种宝石位置的路线点，当您有委托时。"
	)
	@ConfigEditorDropdown
	@ConfigAccordionId(id = 0)
	public @NotNull Property<GlaciteTunnelWaypointBehaviour> tunnelWaypoints = Property.of(GlaciteTunnelWaypointBehaviour.SHOW_ALL);

	@Expose
	@ConfigOption(
		name = "始终显示冰晶隧道路线点",
		desc = "始终在隧道中显示宝石路线点，而不仅仅是为了您当前的委托。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean alwaysShowTunnelWaypoints = false;

	public enum GlaciteTunnelWaypointBehaviour {
		SHOW_ALL("显示所有"),
		SHOW_NEAREST("显示最近"),
		NONE("不显示"),
		;
		String text;

		GlaciteTunnelWaypointBehaviour(String text) {
			this.text = text;
		}

		@Override
		public String toString() {
			return text;
		}
	}

	@ConfigOption(
		name = "钻机燃料条",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean drillAccordion = false;

	@Expose
	@ConfigOption(
		name = "钻机燃料条",
		desc = "在采矿区域持有钻机时显示一个华丽的钻机燃料条"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean drillFuelBar = true;

	@Expose
	@ConfigOption(
		name = "燃料条宽度",
		desc = "更改钻机燃料条的宽度"
	)
	@ConfigEditorSlider(
		minValue = 50,
		maxValue = 350,
		minStep = 10
	)
	@ConfigAccordionId(id = 1)
	public int drillFuelBarWidth = 180;

	@Expose
	public Position drillFuelBarPosition = new Position(0, -91, true, false);

	@ConfigOption(
		name = "矮人覆盖层",
		desc = ""
	)
	@ConfigEditorAccordion(id = 2)
	public boolean overlayAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用矮人覆盖层",
		desc = "在矮人矿山中显示一个包含有用信息的覆盖层"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean dwarvenOverlay = true;

	@Expose
	@ConfigOption(
		name = "矮人文本",
		desc = "\u00a7e拖动文本以更改覆盖层的外观\n" +
			"\u00a7r前往矮人矿山以显示此覆盖层及有用信息"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"§3杀戮哥布林: §626.5% §8(委托)\n§3幸运抽奖: §c0.0% §8(委托)",
			"§3锰粉: §26,243",
			"§3宝石粉: §d6,243",
			"§3锻造 1) §9钻石矿石§7: §a已准备好!",
			"§3镐 CD: §a78秒",
			"§3星际教派: §a78秒",
			"§3天空商场: §a5x 钛矿 (78秒)",
			"§3冰晶粉: §b46"
		}
	)
	@ConfigAccordionId(id = 2)
	public List<Integer> dwarvenText2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));

	@Expose
	public Position overlayPosition = new Position(10, 100);

	@Expose
	@ConfigOption(
		name = "覆盖层样式",
		desc = "更改矮人矿山信息覆盖层的样式"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "有阴影", "全阴影"}
	)
	@ConfigAccordionId(id = 2)
	public int overlayStyle = 0;

	@Expose
	@ConfigOption(
		name = "显示图标",
		desc = "显示代表覆盖层部分的图标。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean dwarvenOverlayIcons = true;

	@Expose
	@ConfigOption(
		name = "锻造显示",
		desc = "更改锻造显示中显示的内容"
	)
	@ConfigEditorDropdown(
		values = {"仅完成", "仅工作", "除已锁定外的所有", "所有"}
	)
	@ConfigAccordionId(id = 2)
	public int forgeDisplay = 1;

	@Expose
	@ConfigOption(
		name = "锻造位置",
		desc = "更改锻造显示的显示位置"
	)
	@ConfigEditorDropdown(
		values = {"矮人矿山+水晶洞穴", "除地下城外的所有地方", "所有地方"}
	)
	@ConfigAccordionId(id = 2)
	public int forgeDisplayEnabledLocations = 0;

	@Expose
	@ConfigOption(
		name = "锻造选项卡",
		desc = "仅在选项卡列表打开时显示锻造显示\n" +
			"\u00A7c此功能仅在矮人洞穴外有效!"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean forgeDisplayOnlyShowTab = false;

	@Expose
	@ConfigOption(
		name = "星际教派位置",
		desc = "更改星际教派计时器的显示位置"
	)
	@ConfigEditorDropdown(
		values = {"矮人矿山+水晶洞穴", "除地下城外的所有地方", "所有地方"}
	)
	@ConfigAccordionId(id = 2)
	public int starCultDisplayEnabledLocations = 0;

	@Expose
	@ConfigOption(
		name = "星际教派选项卡",
		desc = "仅在选项卡列表打开时显示星际教派计时器\n" +
			"§c此功能仅在矮人洞穴外有效!"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean starCultDisplayOnlyShowTab = false;

	@Expose
	@ConfigOption(
		name = "天空商场位置",
		desc = "更改天空商场特权的显示位置"
	)
	@ConfigEditorDropdown(
		values = {"矮人矿山+水晶洞穴", "除地下城外的所有地方", "所有地方"}
	)
	@ConfigAccordionId(id = 2)
	public int skyMallDisplayEnabledLocations = 0;

	@Expose
	@ConfigOption(
		name = "天空商场选项卡",
		desc = "仅在选项卡列表打开时显示天空商场特权\n" +
			"§c此功能仅在矮人洞穴外有效!"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean skyMallDisplayOnlyShowTab = false;

	@Expose
	@ConfigOption(
		name = "委托任务提示",
		desc = "显示提示以帮助完成委托任务"
	)
	@ConfigEditorDropdown(
		values = {"关闭", "仅在潜行时", "总是"}
	)
	@ConfigAccordionId(id = 2)
	public int commissionTaskTips = 0;

	@Expose
	@ConfigOption(
		name = "新行中的提示",
		desc = "在下一行中显示委托任务提示。")
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean commissionTaskTipNewLine = true;

	@ConfigOption(
		name = "金属探测器求解器",
		desc = ""
	)
	@ConfigEditorAccordion(id = 3)
	public boolean metalDetectorSolverAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用路线点",
		desc =
			"在迪万矿山启用金属探测器求解器，使用此功能静止不动以计算可能的块，然后在需要时静止不动在另一个块上。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean metalDetectorEnabled = true;

	@Expose
	@ConfigOption(
		name = "到解决方案的线",
		desc = "绘制到解决方案块的线。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean metalDetectorLineToSolution = true;

	@Expose
	@ConfigOption(
		name = "显示可能的块",
		desc = "当 NEU 不确定宝藏所在的块时，在可能的位置上显示路线点。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean metalDetectorShowPossible = false;

	@Expose
	@ConfigOption(
		name = "发送标题",
		desc = "发送找到的解决方案、失败或者需要额外位置的标题。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean metalDetectorTitle = false;

	@Expose
	@ConfigOption(
		name = "找到解决方案标题颜色",
		desc = "警报将显示的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 3)
	public String metalDetectorFoundColor = "0:255:255:255:85";

	@Expose
	@ConfigOption(
		name = "失败解决方案颜色",
		desc = "警报将显示的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 3)
	public String metalDetectorFailedColor = "0:255:255:85:85";

	@Expose
	@ConfigOption(
		name = "需要另一个位置颜色",
		desc = "警报将显示的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 3)
	public String metalDetectorMoveColor = "0:255:255:255:85";

	@Expose
	@ConfigOption(
		name = "标题显示时间",
		desc = "显示将保持多长时间（以 ticks 为单位）"
	)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 200,
		minStep = 20
	)
	@ConfigAccordionId(id = 3)
	public int metalDetectorTicks = 20;

	@ConfigOption(
		name = "水晶洞穴覆盖层",
		desc = ""
	)
	@ConfigEditorAccordion(id = 4)
	public boolean crystalHollowOverlayAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用水晶覆盖层",
		desc = "启用水晶洞穴覆盖层。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean crystalHollowOverlay = true;

	@Expose
	public Position crystalHollowOverlayPosition = new Position(200, 0);

	@Expose
	@ConfigOption(
		name = "选项",
		desc = "拖动文本以更改覆盖层的外观！\n" +
			"点击添加以添加额外的内容！"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"\u00a73Amber Crystal: \u00a7aPlaced\n" +
				"\u00a73Sapphire Crystal: \u00a7eCollected\n" +
				"\u00a73Jade Crystal: \u00a7eMissing\n" +
				"\u00a73Amethyst Crystal: \u00a7cMissing\n" +
				"\u00a73Topaz Crystal: \u00a7cMissing\n",
			"\u00a73Crystals: \u00a7a4/5",
			"\u00a73Crystals: \u00a7a80%",
			"\u00a73Electron Transmitter: \u00a7aDone\n" +
				"\u00a73Robotron Reflector: \u00a7eIn Storage\n" +
				"\u00a73Superlite Motor: \u00a7eIn Inventory\n" +
				"\u00a73Synthetic Heart: \u00a7cMissing\n" +
				"\u00a73Control Switch: \u00a7cMissing\n" +
				"\u00a73FTX 3070: \u00a7cMissing",
			"\u00a73Electron Transmitter: \u00a7a3\n" +
				"\u00a73Robotron Reflector: \u00a7e2\n" +
				"\u00a73Superlite Motor: \u00a7e1\n" +
				"\u00a73Synthetic Heart: \u00a7c0\n" +
				"\u00a73Control Switch: \u00a7c0\n" +
				"\u00a73FTX 3070: \u00a7c0",
			"\u00a73Automaton parts: \u00a7a5/6",
			"\u00a73Automaton parts: \u00a7a83%",
			"\u00a73Scavenged Lapis Sword: \u00a7aDone\n" +
				"\u00a73Scavenged Golden Hammer: \u00a7eIn Storage\n" +
				"\u00a73Scavenged Diamond Axe: \u00a7eIn Inventory\n" +
				"\u00a73Scavenged Emerald Hammer: \u00a7cMissing\n",
			"\u00a73Scavenged Lapis Sword: \u00a7a3\n" +
				"\u00a73Scavenged Golden Hammer: \u00a7e2\n" +
				"\u00a73Scavenged Diamond Axe: \u00a7e1\n" +
				"\u00a73Scavenged Emerald Hammer: \u00a7c0\n",
			"\u00a73Mines of Divan parts: \u00a7a3/4",
			"\u00a73Mines of Divan parts: \u00a7a75%"
		}
	)
	@ConfigAccordionId(id = 4)
	public List<Integer> crystalHollowText = new ArrayList<>(Arrays.asList(0, 3, 7));
	@Expose
	@ConfigOption(
		name = "样式",
		desc = "更改水晶空洞覆盖的样式。"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "阴影", "全阴影"}
	)
	@ConfigAccordionId(id = 4)
	public int crystalHollowOverlayStyle = 0;

	@Expose
	@ConfigOption(
		name = "显示图标",
		desc = "在覆盖中显示表示部分的图标。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean crystalHollowIcons = true;

	@Expose
	@ConfigOption(
		name = "隐藏已完成",
		desc = "不显示您已交给 NPC 的部分。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean crystalHollowHideDone = false;

	@ConfigOption(
		name = "位置",
		desc = ""
	)
	@ConfigEditorAccordion(id = 5)
	@ConfigAccordionId(id = 4)
	public boolean crystalHollowLocationAccordion = false;

	@Expose
	@ConfigOption(
		name = "显示自动机",
		desc = "更改显示自动机部分的位置。"
	)
	@ConfigEditorDropdown(
		values = {"水晶空洞", "前驱遗迹", "失落的前驱城市"}
	)
	@ConfigAccordionId(id = 5)
	public int crystalHollowAutomatonLocation = 2;

	@Expose
	@ConfigOption(
		name = "显示迪瓦恩",
		desc = "更改显示迪瓦恩矿区部分的位置。"
	)
	@ConfigEditorDropdown(
		values = {"水晶空洞", "锰矿", "迪瓦恩矿"}
	)
	@ConfigAccordionId(id = 5)
	public int crystalHollowDivanLocation = 2;

	@Expose
	@ConfigOption(
		name = "显示水晶",
		desc = "更改显示已收集水晶的位置。"
	)
	@ConfigEditorDropdown(
		values = {"水晶空洞", "没有其他覆盖时"}
	)
	@ConfigAccordionId(id = 5)
	public int crystalHollowCrystalLocation = 1;

	@ConfigOption(
		name = "颜色",
		desc = ""
	)
	@ConfigEditorAccordion(id = 6)
	@ConfigAccordionId(id = 4)
	public boolean crystalHollowColourAccordion = false;

	@Expose
	@ConfigOption(
		name = "主颜色",
		desc = "更改覆盖的主颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowPartColor = 3;

	@Expose
	@ConfigOption(
		name = "已完成颜色",
		desc = "更改当部分交给 NPC 时的颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowDoneColor = 10;

	@Expose
	@ConfigOption(
		name = "库存中的颜色",
		desc = "更改当部分在库存中的颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowInventoryColor = 14;

	@Expose
	@ConfigOption(
		name = "存储中的颜色",
		desc = "更改当部分在存储中时的颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowStorageColor = 14;

	@Expose
	@ConfigOption(
		name = "缺失颜色",
		desc = "更改当部分缺失时的颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowMissingColor = 12;

	@Expose
	@ConfigOption(
		name = "已放置颜色",
		desc = "更改当水晶已放置时的颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowPlacedColor = 10;

	@Expose
	@ConfigOption(
		name = "已收集颜色",
		desc = "更改当水晶被收集时的颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowCollectedColor = 14;

	@Expose
	@ConfigOption(
		name = "全部颜色",
		desc = "更改当您收集到 2/3 - 所有部分时的颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowAllColor = 10;

	@Expose
	@ConfigOption(
		name = "1/3 颜色",
		desc = "更改当您收集到 1/3 - 2/3 的部分时的颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowMiddleColor = 14;

	@Expose
	@ConfigOption(
		name = "0 颜色",
		desc = "更改当您收集到 0 - 1/3 的部分时的颜色。"
	)
	@ConfigEditorDropdown(
		values = {
			"黑色",
			"深蓝色",
			"深绿色",
			"深青色",
			"深红色",
			"深紫色",
			"金色",
			"灰色",
			"深灰色",
			"蓝色",
			"绿色",
			"青色",
			"红色",
			"浅紫色",
			"黄色",
			"白色"
		}
	)
	@ConfigAccordionId(id = 6)
	public int crystalHollowNoneColor = 12;

	@ConfigOption(
		name = "许愿指南针求解器",
		desc = ""
	)
	@ConfigEditorAccordion(id = 7)
	public boolean wishingCompassSolverAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用求解器",
		desc = "根据两个样本显示许愿指南针目标坐标。"
	)
	@ConfigAccordionId(id = 7)
	@ConfigEditorBoolean
	public boolean wishingCompassSolver = true;

	@Expose
	@ConfigOption(
		name = "Skytils 路标",
		desc = "自动为知名目标创建 Skytils 路标。"
	)
	@ConfigAccordionId(id = 7)
	@ConfigEditorBoolean
	public boolean wishingCompassAutocreateKnownWaypoints = false;

	@Expose
	@ConfigOption(
		name = "路标名称",
		desc = "注意：Skytils 会用较不准确的值覆盖路标坐标以获取 Skytils 名称。"
	)
	@ConfigAccordionId(id = 7)
	@ConfigEditorDropdown(
		values = {"NEU", "Skytils"}
	)
	public int wishingCompassWaypointNames = 0;

	@ConfigOption(
		name = "粉末研磨跟踪器",
		desc = ""
	)
	@ConfigEditorAccordion(id = 9)
	public boolean powderGrindingTrackerAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用跟踪器",
		desc = "显示与粉末研磨相关的有用信息的覆盖。"
	)
	@ConfigAccordionId(id = 9)
	@ConfigEditorBoolean
	public boolean powderGrindingTrackerEnabled = false;

	@Expose
	@ConfigOption(
		name = "跟踪器文本",
		desc = "\u00a7e拖动文本以更改覆盖的外观\n" +
			"\u00a7r前往水晶空洞以显示此覆盖及有用信息。"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"\u00a73找到的箱子：\u00a7a13",
			"\u00a73已打开的箱子：\u00a7a11",
			"\u00a73未打开的箱子：\u00a7c2",
			"\u00a73找到的锰粉：\u00a726,243",
			"\u00a73每箱平均锰粉：\u00a72568",
			"\u00a73找到的宝石粉：\u00a7d6,243",
			"\u00a73每箱平均宝石粉：\u00a7d568"
		}
	)
	@ConfigAccordionId(id = 9)
	public List<Integer> powderGrindingTrackerText = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));

	@Expose
	public Position powderGrindingTrackerPosition = new Position(10, 265);

	@Expose
	@ConfigOption(
		name = "覆盖样式",
		desc = "更改粉末研磨跟踪器信息覆盖的样式。"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "阴影", "全阴影"}
	)
	@ConfigAccordionId(id = 9)
	public int powderGrindingTrackerOverlayStyle = 0;

	@Expose
	@ConfigOption(
		name = "跟踪器重置模式",
		desc = "粉末研磨跟踪器应在何时重置。"
	)
	@ConfigEditorDropdown(
		values = {"在世界更改时", "在重启时", "从不"}
	)
	@ConfigAccordionId(id = 9)
	public int powderGrindingTrackerResetMode = 2;

	@Expose
	@ConfigOption(
		name = "重置跟踪器",
		desc = "重置粉末研磨跟踪器的所有统计数据。"
	)
	@ConfigEditorButton(
		runnableId = 26,
		buttonText = "重置"
	)
	@ConfigAccordionId(id = 9)
	public int resetPowderGrindingTracker = 0;

	@Expose
	@ConfigOption(
		name = "解谜器求解器",
		desc = "显示在矮人矿区解谜时要挖掘的正确方块。"
	)
	@ConfigEditorBoolean
	public boolean puzzlerSolver = true;

	@Expose
	@ConfigOption(
		name = "钛金警报",
		desc = "每当附近出现钛金时显示警报。"
	)
	@ConfigEditorBoolean
	public boolean titaniumAlert = true;

	@Expose
	@ConfigOption(
		name = "钛金必须接触空气",
		desc = "仅在钛金接触空气时显示警报。（有点可疑）"
	)
	@ConfigEditorBoolean
	public boolean titaniumAlertMustBeVisible = false;

	@ConfigOption(
		name = "自定义纹理",
		desc = ""
	)
	@ConfigEditorAccordion(id = 8)
	public boolean texturesAccordion = false;

	@Expose
	@ConfigOption(
		name = "矮人矿区纹理",
		desc = "允许纹理包重新纹理矮人矿区中的方块。如果您没有使用该功能的纹理包，您应该关闭此选项。"
	)
	@ConfigAccordionId(id = 8)
	@ConfigEditorBoolean
	public boolean dwarvenTextures = false;

	@Expose
	@ConfigOption(
		name = "水晶空洞纹理",
		desc = "允许纹理包重新纹理水晶空洞中的方块。如果您没有使用该功能的纹理包，您应该关闭此选项。"
	)
	@ConfigAccordionId(id = 8)
	@ConfigEditorBoolean
	public boolean crystalHollowTextures = false;

	@Expose
	@ConfigOption(
		name = "替换宝石声音",
		desc = "替换水晶在水晶空洞中的破碎声音。需要具有此功能的纹理包。"
	)
	@ConfigAccordionId(id = 8)
	@ConfigEditorBoolean
	public boolean gemstoneSounds = false;

	@Expose
	@ConfigOption(
		name = "替换锰声音",
		desc = "替换矮人矿区中锰和钛金的破碎声音。需要具有此功能的纹理包。"
	)
	@ConfigAccordionId(id = 8)
	@ConfigEditorBoolean
	public boolean mithrilSounds = false;

	@Expose
	@ConfigOption(
		name = "矿井出口路标",
		desc = "显示通往冰晶矿道出口的路标。"
	)
	@ConfigEditorBoolean
	public boolean mineshaftExitWaypoint = true;

	@Expose
	@ConfigOption(
		name = "粉末待办事项",
		desc = "当您无法负担 /hotm 树中的某个特权时，单击该特权以获得通知。"
	)
	@ConfigEditorBoolean
	public boolean powderTodo = true;
}
