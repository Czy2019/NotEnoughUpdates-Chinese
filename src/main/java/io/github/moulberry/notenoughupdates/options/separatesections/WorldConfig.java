/*
 * 版权所有 (C) 2022 NotEnoughUpdates 贡献者
 *
 * 本文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：您可以根据 GNU 较宽通用公共许可证的条款重新分发和/或修改它，
 * 许可证由自由软件基金会发布，可以是许可证的第 3 版或（根据您的选择）任何更高版本。
 *
 * NotEnoughUpdates 以其对有用性的期望进行分发，但不提供任何保证；甚至不包括对适销性或特定目的适用性的隐含保证。
 * 有关更多详细信息，请参见 GNU 较宽通用公共许可证。
 *
 * 您应当已收到 GNU 较宽通用公共许可证的副本，以及 NotEnoughUpdates。如果没有，请访问 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorColour;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class WorldConfig {

	@Expose
	@ConfigOption(
		name = "发光蘑菇",
		desc = ""
	)
	@ConfigEditorAccordion(id = 1)
	public boolean glowingMushroomAccordion = true;

	@Expose
	@ConfigOption(
		name = "高亮发光蘑菇",
		desc = "在蘑菇峡谷中高亮发光蘑菇"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 1)
	public boolean highlightGlowingMushrooms = false;

	@Expose
	@ConfigOption(
		name = "发光蘑菇颜色",
		desc = "发光蘑菇应突出显示的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 1)
	public String glowingMushroomColor2 = "0:100:142:88:36";

	@Expose
	@ConfigOption(
		name = "末影节点",
		desc = ""
	)
	@ConfigEditorAccordion(id = 2)
	public boolean enderNodeAccordion = true;

	@Expose
	@ConfigOption(
		name = "高亮末影节点",
		desc = "在末地中高亮末影节点"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 2)
	public boolean highlightEnderNodes = false;

	@Expose
	@ConfigOption(
		name = "末影节点颜色",
		desc = "末影节点应突出显示的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 2)
	public String enderNodeColor2 = "0:100:0:255:0";

	@Expose
	@ConfigOption(
		name = "冰冻宝藏",
		desc = ""
	)
	@ConfigEditorAccordion(id = 3)
	public boolean frozenTreasuresAccordion = true;

	@Expose
	@ConfigOption(
		name = "高亮冰冻宝藏",
		desc = "在冰川洞穴中高亮冰冻宝藏"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 3)
	public boolean highlightFrozenTreasures = false;

	@Expose
	@ConfigOption(
		name = "冰冻宝藏颜色",
		desc = "冰冻宝藏应突出显示的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 3)
	public String frozenTreasuresColor2 = "0:100:0:255:0";

	@Expose
	@ConfigOption(
		name = "水晶洞穴箱子",
		desc = ""
	)
	@ConfigEditorAccordion(id = 4)
	public boolean crystalHollowChestsAccordion = true;

	@Expose
	@ConfigOption(
		name = "水晶洞穴箱子高亮",
		desc = "在水晶洞穴中开采时高亮箱子"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 4)
	public boolean highlightCrystalHollowChests = false;

	@Expose
	@ConfigOption(
		name = "箱子高亮颜色",
		desc = "箱子应突出显示的颜色"
	)
	@ConfigEditorColour
	@ConfigAccordionId(id = 4)
	public String crystalHollowChestColor = "0:66:255:0:41";
}
