/*
 * 版权所有 (C) 2022 NotEnoughUpdates 贡献者
 *
 * 此文件是 NotEnoughUpdates 的一部分。
 *
 * NotEnoughUpdates 是自由软件：你可以在 GNU 较宽通用公共许可证的条款下重新分发和/或修改它，
 * 该许可证由自由软件基金会发布，可以是许可证的第 3 版或（根据你的选择）任何更高版本。
 *
 * NotEnoughUpdates 是在希望它会有用的情况下分发的，
 * 但没有任何担保，甚至没有适销性或适合特定目的的默示担保。有关详细信息，请参阅 GNU 较宽通用公共许可证。
 *
 * 你应该已经收到 GNU 较宽通用公共许可证的副本，
 * 如果没有，请访问 <https://www.gnu.org/licenses/>。
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.notenoughupdates.core.config.Position;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class DungeonMapConfig {
	@Expose
	@ConfigOption(
		name = "边框大小",
		desc = "更改地图边框的大小，而不改变内容的大小"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 5,
		minStep = 0.25f
	)
	public float dmBorderSize = 1;

	@Expose
	@ConfigOption(
		name = "房间大小",
		desc = "更改房间的大小。适用于具有较大地图的高难度地牢"
	)
	@ConfigEditorSlider(
		minValue = 0,
		maxValue = 5,
		minStep = 0.25f
	)
	public float dmRoomSize = 1;

	@Expose
	@ConfigOption(
		name = "图标大小",
		desc = "更改房间指示器和玩家图标的缩放"
	)
	@ConfigEditorSlider(
		minValue = 0.5f,
		maxValue = 3f,
		minStep = 0.25f
	)
	public float dmIconScale = 1.0f;

	@Expose
	@ConfigOption(
		name = "边框风格",
		desc = "各种来自不同才华横溢的艺术家的自定义边框。\n如果你的纹理包有自定义边框，请使用 'custom'"
	)
	public int dmBorderStyle = 0;

	@Expose
	@ConfigOption(
		name = "显示地牢地图",
		desc = "显示/隐藏 NEU 地牢地图"
	)
	public boolean dmEnable = true;

	@Expose
	@ConfigOption(
		name = "地图中心",
		desc = "以房间为中心，还是以你的玩家为中心"
	)
	public boolean dmCenterPlayer = true;

	@Expose
	@ConfigOption(
		name = "随玩家旋转",
		desc = "将地图旋转以面对与玩家相同的方向"
	)
	public boolean dmRotatePlayer = true;

	@Expose
	@ConfigOption(
		name = "对齐勾选标记",
		desc = "勾选标记始终垂直显示，无论旋转方向如何"
	)
	public boolean dmOrientCheck = true;

	@Expose
	@ConfigOption(
		name = "中心勾选标记",
		desc = "勾选标记将显示在房间的中心附近"
	)
	public boolean dmCenterCheck = false;

	@Expose
	@ConfigOption(
		name = "玩家图标风格",
		desc = "各种玩家图标风格"
	)
	public int dmPlayerHeads = 0;

	@Expose
	@ConfigOption(
		name = "远处玩家插值",
		desc = "使远处的玩家平滑移动"
	)
	public boolean dmPlayerInterp = true;

	@Expose
	@ConfigOption(
		name = "OpenGL 兼容性",
		desc = "针对配置较差的计算机的兼容性选项。仅在你知道自己在做什么的情况下使用，否则地图会看起来更糟"
	)
	public int dmCompat = 0;

	@Expose
	@ConfigOption(
		name = "背景颜色",
		desc = "地图背景的颜色。支持透明度和色度"
	)
	public String dmBackgroundColour = "00:170:75:75:75";

	@Expose
	@ConfigOption(
		name = "边框颜色",
		desc = "地图边框的颜色。支持透明度和色度。关闭自定义边框以查看"
	)
	public String dmBorderColour = "00:0:0:0:0";

	@Expose
	@ConfigOption(
		name = "色度边框模式",
		desc = "在地图边框周围应用色调偏移"
	)
	public boolean dmChromaBorder = false;

	@Expose
	@ConfigOption(
		name = "背景模糊因子",
		desc = "更改地图后面的模糊因子。设置为 0 以禁用模糊"
	)
	public float dmBackgroundBlur = 0;

	@Expose
	@ConfigOption(
		name = "位置",
		desc = "更改地图的位置"
	)
	public Position dmPosition = new Position(10, 10);
}
