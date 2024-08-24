/*
 * 版权所有 (C) 2022-2023 NotEnoughUpdates 贡献者
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
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorKeybind;
import io.github.moulberry.moulconfig.annotations.ConfigEditorText;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import org.lwjgl.input.Keyboard;

public class ApiData {

	@Expose
	@ConfigOption(
		name = "解锁 API 数据选项卡",
		desc = "如果关闭此选项，你将需要重新进行 IQ 测试"
	)
	@ConfigEditorBoolean
	public boolean apiDataUnlocked = false;

	@ConfigEditorAccordion(id = 0)
	@ConfigOption(name = "存储库", desc = "")
	public boolean repository = false;

	@Expose
	@ConfigOption(
		name = "自动更新存储库",
		desc = "每次启动时更新存储库"
	)
	@ConfigEditorBoolean()
	@ConfigAccordionId(id = 0)
	public boolean autoupdate_new = true;

	@ConfigAccordionId(id = 0)
	@ConfigOption(
		name = "立即更新存储库",
		desc = "刷新你的存储库"
	)
	@ConfigEditorButton(runnableId = 22, buttonText = "更新")
	public int updateRepositoryButton = 0;

	@ConfigEditorAccordion(id = 1)
	@ConfigAccordionId(id = 0)
	@ConfigOption(
		name = "存储库位置",
		desc = ""
	)
	public boolean repositoryLocation = false;

	@ConfigAccordionId(id = 1)
	@ConfigOption(
		name = "使用默认存储库",
		desc = "官方 NEU 版本的最新、最更新的物品列表。"
	)
	@ConfigEditorButton(runnableId = 23, buttonText = "重置")
	public int setRepositoryToDefaultButton = 0;

	@Expose
	@ConfigAccordionId(id = 1)
	@ConfigOption(
		name = "存储库用户",
		desc = "存储库用户"
	)
	@ConfigEditorText
	public String repoUser = "NotEnoughUpdates";

	@Expose
	@ConfigAccordionId(id = 1)
	@ConfigOption(
		name = "存储库名称",
		desc = "存储库名称"
	)
	@ConfigEditorText
	public String repoName = "NotEnoughUpdates-REPO";

	@Expose
	@ConfigAccordionId(id = 1)
	@ConfigOption(
		name = "存储库分支",
		desc = "存储库分支"
	)
	@ConfigEditorText
	public String repoBranch = "master";

	@Expose
	@ConfigAccordionId(id = 0)
	@ConfigOption(
		name = "编辑模式",
		desc = "启用编辑物品列表中的物品。\n§4仅推荐给存储库维护者。\n§4§l记住：§r同时关闭自动更新"
	)
	@ConfigEditorBoolean
	public boolean repositoryEditing = false;

	@Expose
	@ConfigAccordionId(id = 0)
	@ConfigOption(
		name = "编辑模式快捷键",
		desc = "打开物品编辑器 GUI 的快捷键"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_K)
	public int repositoryEditingKeybind = Keyboard.KEY_K;

	@Expose
	@ConfigAccordionId(id = 0)
	@ConfigOption(
		name = "即时编辑快捷键",
		desc = "无需打开 GUI 即可编辑物品"
	)
	@ConfigEditorKeybind(defaultKey = Keyboard.KEY_NONE)
	public int instantEditKeybind = Keyboard.KEY_NONE;

	@Expose
	@ConfigOption(
		name = "Lowestbin API",
		desc = "§4请 §l不要 §r§4更改此项，除非你完全了解自己的操作\n§f默认：§amoulberry.codes"
	)
	@ConfigEditorText
	public String moulberryCodesApi = "moulberry.codes";

	@Expose
	@ConfigOption(
		name = "Ursa Minor 代理",
		desc = "§4请 §l不要 §r§4更改此项，除非你完全了解自己的操作"
	)
	@ConfigEditorText
	public String ursaApi = "https://ursa.notenoughupdates.org/";

	public String getCommitApiUrl() {
		return String.format("https://api.github.com/repos/%s/%s/commits/%s", repoUser, repoName, repoBranch);
	}

	public String getDownloadUrl(String commitId) {
		return String.format("https://github.com/%s/%s/archive/%s.zip", repoUser, repoName, commitId);
	}
}
