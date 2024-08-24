/*
 * 版权所有 (C) 2022-2024 NotEnoughUpdates 贡献者
 *
 * 这个文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：您可以根据自由软件基金会发布的 GNU 较小通用公共许可证的条款，
 * 再分发和/或修改它，许可证版本为 3，或（根据您的选择）任何更高版本。
 *
 * NotEnoughUpdates 的发布是希望它能有用，但没有任何保证；甚至没有适销性或特定用途适用性的隐含保证。
 * 有关更多详细信息，请参阅 GNU 较小通用公共许可证。
 *
 * 您应该已经收到随 NotEnoughUpdates 一起发布的 GNU 较小通用公共许可证的副本。如果没有，请参阅 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorColour;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDraggableList;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigEditorInfoText;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import io.github.moulberry.notenoughupdates.core.config.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemOverlays {
	@ConfigOption(
		name = "树斧覆盖显示",
		desc = "丛林斧"
	)
	@ConfigEditorAccordion(id = 0)
	public boolean treecapAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用树斧覆盖显示",
		desc = "显示使用丛林斧或树斧时将要破坏的方块"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean enableTreecapOverlay = true;

	@Expose
	@ConfigOption(
		name = "在物品耐久中显示",
		desc = "在物品耐久中显示树斧的冷却时间"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean enableCooldownInItemDurability = true;

	@Expose
	@ConfigOption(
		name = "覆盖颜色",
		desc = "更改覆盖显示的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 0)
	public String treecapOverlayColour = "00:50:64:224:208";

	@Expose
	@ConfigOption(
		name = "启用猴子宠物检查",
		desc = "根据是否有猴子宠物来确定冷却时间。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean enableMonkeyCheck = true;

	@ConfigOption(
		name = "建造者之杖覆盖显示",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean wandAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用建造者之杖覆盖显示",
		desc = "显示使用建造者之杖时将要放置的方块"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean enableWandOverlay = true;

	@Expose
	@ConfigOption(
		name = "杖方块数量",
		desc = "显示库存中方块的总数"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean wandBlockCount = true;

	@Expose
	@ConfigOption(
		name = "覆盖颜色",
		desc = "更改虚拟方块轮廓的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 1)
	public String wandOverlayColour = "00:50:64:224:208";

	@ConfigOption(
		name = "方块破坏器覆盖显示",
		desc = ""
	)
	@ConfigEditorAccordion(id = 2)
	public boolean zapperAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用方块破坏器覆盖显示",
		desc = "显示使用方块破坏器时将要破坏的方块"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean enableZapperOverlay = true;

	@Expose
	@ConfigOption(
		name = "覆盖颜色",
		desc = "更改虚拟方块轮廓的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String zapperOverlayColour = "0:102:171:5:0";

	@ConfigOption(
		name = "平滑瞬移天使",
		desc = ""
	)
	@ConfigEditorAccordion(id = 3)
	public boolean aoteAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用平滑瞬移天使",
		desc = "使用瞬移天使、瞬移天使II或瞬移天使L时平滑地瞬移到目的地"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean enableSmoothAOTE = true;

	@Expose
	@ConfigOption(
		name = "启用平滑Hyperion",
		desc = "使用Hyperion时平滑地瞬移到目的地"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean enableSmoothHyperion = true;

	@Expose
	@ConfigOption(
		name = "平滑瞬移时间",
		desc = "更改瞬移所需的时间（毫秒）"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 500,
		minStep = 25
	)
	@ConfigAccordionId(id = 3)
	public int smoothTpMillis = 125;

	@Expose
	@ConfigOption(
		name = "平滑瞬移时间（Etherwarp）",
		desc = "使用瞬移天使II Etherwarp时平滑地瞬移到目的地"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 500,
		minStep = 25
	)
	@ConfigAccordionId(id = 3)
	public int smoothTpMillisEtherwarp = 50;

	@Expose
	@ConfigOption(
		name = "禁用Hyperion粒子",
		desc = "使用Hyperion时移除爆炸效果"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean disableHyperionParticles = true;

	@ConfigOption(
		name = "Etherwarp",
		desc = ""
	)
	@ConfigEditorAccordion(id = 4)
	public boolean etherwarpAccordion = false;

	@Expose
	@ConfigOption(
		name = "Etherwarp变焦",
		desc = "使用Etherwarp时放大目标方块，使其在远处更容易调整"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean etherwarpZoom = true;

	@Expose
	@ConfigOption(
		name = "启用Etherwarp帮助覆盖显示",
		desc = "显示一个覆盖，告诉您Etherwarp是否会失败。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean enableEtherwarpHelperOverlay = true;

	@Expose
	@ConfigOption(
		name = "启用Etherwarp方块覆盖显示",
		desc = "显示一个覆盖，告诉您将要瞬移到哪个方块。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean enableEtherwarpBlockOverlay = true;

	@Expose
	@ConfigOption(
		name = "失败时禁用覆盖",
		desc = "当您无法瞬移到方块时不显示Etherwarp方块覆盖"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean disableOverlayWhenFailed = false;

	@Expose
	@ConfigOption(
		name = "隐藏失败文本",
		desc = "不显示无法瞬移到方块的文本"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean hideEtherwarpFailText = false;

	@Expose
	@ConfigOption(
		name = "失败时更改颜色",
		desc = "当您无法瞬移到方块时显示不同的颜色"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean changeEtherwarpColourWhenFailed = false;

	@Expose
	@ConfigOption(
		name = "高亮颜色",
		desc = "更改Etherwarp目标方块轮廓的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 4)
	public String etherwarpHighlightColour = "00:70:156:8:96";

	@Expose
	@ConfigOption(
		name = "失败高亮颜色",
		desc = "当您无法瞬移到该方块时更改Etherwarp目标方块轮廓的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 4)
	public String etherwarpFailHighlightColour = "00:70:220:40:40";

	@ConfigOption(
		name = "投骨镖覆盖显示",
		desc = ""
	)
	@ConfigEditorAccordion(id = 5)
	public boolean bonemerangAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用投骨镖覆盖显示",
		desc = "在持有投骨镖时显示它的信息。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 5)
	public boolean enableBonemerangOverlay = true;

	@Expose
	@ConfigOption(
		name = "高亮目标实体",
		desc = "高亮将被您的投骨镖击中的实体"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 5)
	public boolean highlightTargeted = true;

	@Expose
	public Position bonemerangPosition = new Position(-1, -1);

	@Expose
	@ConfigOption(
		name = "投骨镖覆盖文本",
		desc = "\u00a7e拖动文本以更改覆盖显示的外观\n" +
			"\u00a7r持有投骨镖以显示覆盖"
	)
	@ConfigEditorDraggableList(
		exampleText = {
			"\u00a7c投骨镖将破碎！",
			"\u00a77目标：\u00a76\u00a7l10"
		}
	)
	@ConfigAccordionId(id = 5)
	public List<Integer> bonemerangOverlayText = new ArrayList<>(Arrays.asList(0, 1));

	@Expose
	@ConfigOption(
		name = "投骨镖覆盖样式",
		desc = "更改投骨镖覆盖的样式"
	)
	@ConfigEditorDropdown(
		values = {"背景", "无阴影", "仅阴影", "全阴影"}
	)
	@ConfigAccordionId(id = 5)
	public int bonemerangOverlayStyle = 0;
	@Expose
	@ConfigOption(
		name = "快速更新",
		desc = "更快更新投骨镖覆盖。\n" +
			"可能会导致一些延迟。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 5)
	public boolean bonemerangFastUpdate = false;

	@ConfigOption(
		name = "小仆水晶半径覆盖",
		desc = ""
	)
	@ConfigEditorAccordion(id = 6)
	public boolean crystalAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用水晶覆盖",
		desc = "显示小仆水晶（农耕、采矿等）的有效半径的方块覆盖。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 6)
	public boolean enableCrystalOverlay = true;

	@Expose
	@ConfigOption(
		name = "始终显示水晶覆盖",
		desc = "即使未持有小仆水晶，也显示水晶覆盖。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 6)
	public boolean alwaysShowCrystal = false;

	@ConfigOption(
		name = "农耕覆盖",
		desc = ""
	)
	@ConfigEditorAccordion(id = 7)
	public boolean farmingAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用棱镜泵覆盖",
		desc = "显示棱镜泵能力影响的方块覆盖。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 7)
	public boolean enablePrismapumpOverlay = true;

	@Expose
	@ConfigOption(
		name = "启用锄头耕作覆盖",
		desc = "显示锄头耕作能力影响的方块覆盖。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 7)
	public boolean enableHoeOverlay = true;

	@Expose
	@ConfigOption(
		name = "启用土杖覆盖",
		desc = "显示土杖能力影响的方块覆盖。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 7)
	public boolean enableDirtWandOverlay = true;

	@Expose
	@ConfigOption(
		name = "启用镰刀覆盖",
		desc = "显示镰刀能力影响的方块覆盖。"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 7)
	public boolean enableScytheOverlay = true;

	@ConfigOption(
		name = "自定义凋零披风",
		desc = ""
	)
	@ConfigEditorAccordion(id = 8)
	public boolean customWitherCloakAccordion = false;

	@Expose
	@ConfigAccordionId(id = 8)
	@ConfigOption(
		name = "启用自定义凋零披风",
		desc = "由于Hypixel凋零披风难以看穿，因此用自定义盾牌替换Hypixel凋零披风"
	)
	@ConfigEditorBoolean
	public boolean customWitherCloakToggle = true;

	@Expose
	@ConfigAccordionId(id = 8)
	@ConfigOption(
		name = "盾牌数量",
		desc = "围绕玩家的盾牌数量\n0 = 无盾牌"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 20,
		minStep = 1
	)
	public int customWitherCloakCount = 6;

	@Expose
	@ConfigAccordionId(id = 8)
	@ConfigOption(
		name = "盾牌速度",
		desc = "它们围绕玩家旋转的速度\n0 = 不动\n负数 = 反方向旋转"
	)
	@ConfigEditorSlider(
		minValue = -20f,
		maxValue = 20f,
		minStep = 1.0f
	)
	public double customWitherCloakSpeed = 2d;

	/*@Expose
	@ConfigAccordionId(id = 7)
	@ConfigOption(
		name = "盾牌透明度",
		desc = "更改每个盾牌的可见度\n0 = 隐形"
	)
	@ConfigEditorSlider(
		minValue = 0f,
		maxValue = 1,
		minStep = 0.1f
	)
	public float customWitherCloakTransparency = 1.0f;

	无法使其工作，也无法弄清楚原因 - Cobble8
	*/

	@Expose
	@ConfigAccordionId(id = 8)
	@ConfigOption(
		name = "盾牌离玩家的距离",
		desc = "每个盾牌离玩家的距离（以方块计）\n" +
			"0 = 在玩家内部"
	)
	@ConfigEditorSlider(
		minValue = 0f,
		maxValue = 3.0f,
		minStep = 0.1f
	)
	public float customWitherCloakDistance = 1.2f;

	@Expose
	@ConfigAccordionId(id = 8)
	@ConfigOption(
		name = "\u00A7a灵感来源：",
		desc = "\u00A76u/Sori0612 \u00A77在 \u00A7cReddit\n\n\u00A78https://tinyurl.com/creeperveil"
	)
	@ConfigEditorInfoText()
	public boolean customWitherCloakCredit = false;

	@ConfigOption(
		name = "抓钩覆盖显示",
		desc = ""
	)
	@ConfigEditorAccordion(id = 9)
	public boolean grappleAccordion = false;

	@Expose
	@ConfigOption(
		name = "启用抓钩覆盖显示",
		desc = "在物品耐久中显示抓钩的冷却时间"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 9)
	public boolean enableGrappleOverlay = true;

	@Expose
	@ConfigOption(
		name = "使用耐久显示冷却时间",
		desc = "将冷却时间显示为耐久度。"
	)
	@ConfigEditorBoolean
	public boolean oldCooldowns = false;

	@Expose
	@ConfigOption(
		name = "镐能力冷却时间",
		desc = "显示镐能力的冷却时间。"
	)
	@ConfigEditorBoolean
	public boolean pickaxeAbility = true;

	@Expose
	@ConfigOption(
		name = "Bonzo面具能力冷却时间",
		desc = "显示Bonzo面具能力的冷却时间。"
	)
	@ConfigEditorBoolean
	public boolean bonzoAbility = true;

	@Expose
	@ConfigOption(
		name = "Spirit面具能力冷却时间",
		desc = "显示Spirit面具能力的冷却时间。"
	)
	@ConfigEditorBoolean
	public boolean spiritAbility = true;

}
