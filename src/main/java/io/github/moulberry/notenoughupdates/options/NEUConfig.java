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

package io.github.moulberry.notenoughupdates.options;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.Config;
import io.github.moulberry.moulconfig.Social;
import io.github.moulberry.moulconfig.annotations.Category;
import io.github.moulberry.moulconfig.gui.MoulConfigEditor;
import io.github.moulberry.notenoughupdates.NotEnoughUpdates;
import io.github.moulberry.notenoughupdates.core.config.GuiPositionEditor;
import io.github.moulberry.notenoughupdates.core.config.Position;
import io.github.moulberry.notenoughupdates.dungeons.GuiDungeonMapEditor;
import io.github.moulberry.notenoughupdates.miscfeatures.FairySouls;
import io.github.moulberry.notenoughupdates.miscfeatures.HotmDesires;
import io.github.moulberry.notenoughupdates.miscfeatures.IQTest;
import io.github.moulberry.notenoughupdates.miscgui.GuiEnchantColour;
import io.github.moulberry.notenoughupdates.miscgui.GuiInvButtonEditor;
import io.github.moulberry.notenoughupdates.miscgui.NEUOverlayPlacements;
import io.github.moulberry.notenoughupdates.miscgui.customtodos.CustomTodo;
import io.github.moulberry.notenoughupdates.options.customtypes.NEUDebugFlag;
import io.github.moulberry.notenoughupdates.options.separatesections.AHGraph;
import io.github.moulberry.notenoughupdates.options.separatesections.AHTweaks;
import io.github.moulberry.notenoughupdates.options.separatesections.About;
import io.github.moulberry.notenoughupdates.options.separatesections.AccessoryBag;
import io.github.moulberry.notenoughupdates.options.separatesections.ApiData;
import io.github.moulberry.notenoughupdates.options.separatesections.BazaarTweaks;
import io.github.moulberry.notenoughupdates.options.separatesections.Calendar;
import io.github.moulberry.notenoughupdates.options.separatesections.CustomArmour;
import io.github.moulberry.notenoughupdates.options.separatesections.DungeonMapConfig;
import io.github.moulberry.notenoughupdates.options.separatesections.Dungeons;
import io.github.moulberry.notenoughupdates.options.separatesections.Enchanting;
import io.github.moulberry.notenoughupdates.options.separatesections.Fishing;
import io.github.moulberry.notenoughupdates.options.separatesections.Garden;
import io.github.moulberry.notenoughupdates.options.separatesections.ImprovedSBMenu;
import io.github.moulberry.notenoughupdates.options.separatesections.InventoryButtons;
import io.github.moulberry.notenoughupdates.options.separatesections.ItemOverlays;
import io.github.moulberry.notenoughupdates.options.separatesections.Itemlist;
import io.github.moulberry.notenoughupdates.options.separatesections.LocationEdit;
import io.github.moulberry.notenoughupdates.options.separatesections.Mining;
import io.github.moulberry.notenoughupdates.options.separatesections.MinionHelper;
import io.github.moulberry.notenoughupdates.options.separatesections.Misc;
import io.github.moulberry.notenoughupdates.options.separatesections.MiscOverlays;
import io.github.moulberry.notenoughupdates.options.separatesections.Museum;
import io.github.moulberry.notenoughupdates.options.separatesections.Notifications;
import io.github.moulberry.notenoughupdates.options.separatesections.PetOverlay;
import io.github.moulberry.notenoughupdates.options.separatesections.ProfileViewer;
import io.github.moulberry.notenoughupdates.options.separatesections.RecipeTweaks;
import io.github.moulberry.notenoughupdates.options.separatesections.SkillOverlays;
import io.github.moulberry.notenoughupdates.options.separatesections.SlayerOverlay;
import io.github.moulberry.notenoughupdates.options.separatesections.SlotLocking;
import io.github.moulberry.notenoughupdates.options.separatesections.StorageGUI;
import io.github.moulberry.notenoughupdates.options.separatesections.Toolbar;
import io.github.moulberry.notenoughupdates.options.separatesections.TooltipTweaks;
import io.github.moulberry.notenoughupdates.options.separatesections.TradeMenu;
import io.github.moulberry.notenoughupdates.options.separatesections.WardrobeKeybinds;
import io.github.moulberry.notenoughupdates.options.separatesections.WorldConfig;
import io.github.moulberry.notenoughupdates.overlays.MiningOverlay;
import io.github.moulberry.notenoughupdates.overlays.OverlayManager;
import io.github.moulberry.notenoughupdates.overlays.TextOverlay;
import io.github.moulberry.notenoughupdates.util.NotificationHandler;
import io.github.moulberry.notenoughupdates.util.SBInfo;
import io.github.moulberry.notenoughupdates.util.Utils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ClientCommandHandler;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NEUConfig extends Config {
	public void editOverlay() {
		final LinkedHashMap<TextOverlay, Position> overlayPositions = new LinkedHashMap<TextOverlay, Position>();
		for (TextOverlay overlay : OverlayManager.textOverlays) {
			overlayPositions.put(overlay, overlay.getPosition());
		}
		GuiScreen savedGui = Minecraft.getMinecraft().currentScreen;
		Minecraft.getMinecraft().displayGuiScreen(new GuiPositionEditor(overlayPositions, () -> {
		}, () -> NotEnoughUpdates.INSTANCE.openGui = savedGui));
	}

	public static GuiScreen editOverlayForCommand() {
		final LinkedHashMap<TextOverlay, Position> overlayPositions = new LinkedHashMap<TextOverlay, Position>();
		for (TextOverlay overlay : OverlayManager.textOverlays) {
			overlayPositions.put(overlay, overlay.getPosition());
		}
		return new GuiPositionEditor(overlayPositions, () -> {
		}, () -> {
		});
	}

	@Override
	public void saveNow() {
		NotEnoughUpdates.INSTANCE.saveConfig();
	}

	private Social social(String name, String iconName, String link) {
		return new Social() {
			@Override
			public void onClick() {
				Utils.openUrl(link);
			}

			@Override
			public List<String> getTooltip() {
				return Arrays.asList(name, "§7Open " + link);
			}

			@Override
			public ResourceLocation getIcon() {
				return new ResourceLocation("notenoughupdates:social/" + iconName + ".png");
			}
		};
	}

	@Override
	public List<Social> getSocials() {
		return Arrays.asList(
			social(
				"Twitch",
				"twitch",
				"https://twitch.tv/moulberry2"
			),
			social(
				"Patreon",
				"patreon",
				"https://patreon.com/moulberry"
			),
			social(
				"YouTube",
				"youtube",
				"https://www.youtube.com/channel/UCPh-OKmRSS3IQi9p6YppLcw"
			),
			social(
				"Twitter",
				"twitter",
				"https://twitter.com/moulberry/"
			),
			social(
				"GitHub",
				"github",
				"https://github.com/NotEnoughUpdates/NotEnoughUpdates"
			),
			social(
				"Discord",
				"discord",
				"https://discord.gg/moulberry"
			)
		);
	}

	@Override
	public String getTitle() {
		return "§7NotEnoughUpdates " + NotEnoughUpdates.VERSION + " by §5Moulberry" + "Translate By §5Czy";
	}

	@Override
	public void executeRunnable(int runnableId) {
		String activeConfigCategory = null;
		if (Minecraft.getMinecraft().currentScreen instanceof io.github.moulberry.moulconfig.gui.GuiScreenElementWrapper) {
			io.github.moulberry.moulconfig.gui.GuiScreenElementWrapper wrapper =
				(io.github.moulberry.moulconfig.gui.GuiScreenElementWrapper) Minecraft.getMinecraft().currentScreen;
			if (wrapper.element instanceof MoulConfigEditor) {
				activeConfigCategory = ((MoulConfigEditor) wrapper.element).getSelectedCategory();
			}
		}

		switch (runnableId) {
			case -1:
				return;
			case 0:
				GuiScreen savedGui = Minecraft.getMinecraft().currentScreen;
				NotEnoughUpdates.INSTANCE.openGui = new GuiDungeonMapEditor(() -> {
					NotEnoughUpdates.INSTANCE.openGui = savedGui;
				});
				return;
			case 1:
			case 4:
				editOverlay();
				return;
			case 6:
				NotEnoughUpdates.INSTANCE.openGui = new NEUOverlayPlacements();
				return;
			case 7:
				NotEnoughUpdates.INSTANCE.openGui = new GuiInvButtonEditor();
				return;
			case 8:
				NotEnoughUpdates.INSTANCE.openGui = new GuiEnchantColour();
				return;
			case 12:
				executeRunnableCommand("/dn");
				return;
			case 13:
				executeRunnableCommand("/pv");
				return;
			case 15:
				String command = NotEnoughUpdates.INSTANCE.config.misc.fariySoul ? "/neusouls on" : "/neusouls off";
				executeRunnableCommand(command);
				return;
			case 16:
				executeRunnableCommand("/neusouls clear");
				return;
			case 17:
				executeRunnableCommand("/neusouls unclear");
				return;
			case 20:
				FairySouls.getInstance().setTrackFairySouls(NotEnoughUpdates.INSTANCE.config.misc.trackFairySouls);
				return;
			case 21:
				NotEnoughUpdates.INSTANCE.overlay.updateSearch();
				return;
			case 22:
				NotEnoughUpdates.INSTANCE.manager
					.userFacingRepositoryReload()
					.thenAccept(strings ->
						NotificationHandler.displayNotification(strings, true, true));
				Minecraft.getMinecraft().displayGuiScreen(null);
				return;
			case 23:
				NotEnoughUpdates.INSTANCE.config.apiData.repoUser = "NotEnoughUpdates";
				NotEnoughUpdates.INSTANCE.config.apiData.repoName = "NotEnoughUpdates-REPO";
				NotEnoughUpdates.INSTANCE.config.apiData.repoBranch = "master";
				return;
			case 26:
				OverlayManager.powderGrindingOverlay.reset();
				return;
			case 27:
				IQTest.testIQ();
				return;
			case 28:
				executeRunnableCommand("/neuresetslotlocking");
				return;
			default:
				System.err.printf("未知的 runnableId = %d 在类别 %s%n", runnableId, activeConfigCategory);
		}
	}

	/**
	 * Adds a check for the player being in a world before executing the given command
	 */
	private void executeRunnableCommand(String command) {
		if (Minecraft.getMinecraft().thePlayer == null) {
			System.err.println("命令（" + command + "）未执行，因为你不在一个世界中。");
			return;
		}
		ClientCommandHandler.instance.executeCommand(Minecraft.getMinecraft().thePlayer, command);
	}
	@Expose
	@Category(
		name = "关于",
		desc = ""
	)
	public About about = new About();

	@Expose
	@Category(
		name = "杂项",
		desc = "其他未归入任何类别的选项"
	)
	public Misc misc = new Misc();

	@Expose
	@Category(
		name = "GUI位置",
		desc = "在这里编辑所有GUI的位置"
	)
	public LocationEdit locationedit = new LocationEdit();

	@Expose
	@Category(
		name = "通知",
		desc = "通知"
	)
	public Notifications notifications = new Notifications();

	@Expose
	@Category(
		name = "物品列表",
		desc = "物品列表"
	)
	public Itemlist itemlist = new Itemlist();

	@Expose
	@Category(
		name = "工具栏",
		desc = "工具栏"
	)
	public Toolbar toolbar = new Toolbar();

	@Expose
	@Category(
		name = "背包按钮",
		desc = "背包按钮"
	)
	public InventoryButtons inventoryButtons = new InventoryButtons();

	@Expose
	@Category(
		name = "槽锁定",
		desc = "槽锁定"
	)
	public SlotLocking slotLocking = new SlotLocking();

	@Expose
	@Category(
		name = "提示信息调整",
		desc = "提示信息调整"
	)
	public TooltipTweaks tooltipTweaks = new TooltipTweaks();

	@Expose
	@Category(
		name = "物品叠加",
		desc = "物品叠加"
	)
	public ItemOverlays itemOverlays = new ItemOverlays();

	@Expose
	@Category(
		name = "技能叠加",
		desc = "技能叠加"
	)
	public SkillOverlays skillOverlays = new SkillOverlays();

	@Expose
	@Category(
		name = "待办事项叠加",
		desc = "待办事项叠加"
	)
	public MiscOverlays miscOverlays = new MiscOverlays();

	@Expose
	@Category(
		name = "猎魔者叠加",
		desc = "猎魔者叠加"
	)
	public SlayerOverlay slayerOverlay = new SlayerOverlay();

	@Expose
	@Category(
		name = "储物柜GUI",
		desc = "储物柜GUI"
	)
	public StorageGUI storageGUI = new StorageGUI();

	@Expose
	@Category(
		name = "地下城",
		desc = "地下城"
	)
	public Dungeons dungeons = new Dungeons();

	@Expose
	@Category(
		name = "附魔GUI/解谜器",
		desc = "附魔GUI/解谜器"
	)
	public Enchanting enchantingSolvers = new Enchanting();

	@Expose
	@Category(
		name = "采矿",
		desc = "采矿"
	)
	public Mining mining = new Mining();

	@Expose
	@Category(
		name = "钓鱼",
		desc = "钓鱼"
	)
	public Fishing fishing = new Fishing();

	@Expose
	@Category(
		name = "花园",
		desc = "花园"
	)
	public Garden garden = new Garden();

	@Expose
	@Category(
		name = "改进的SB菜单",
		desc = "改进的SB菜单"
	)
	public ImprovedSBMenu improvedSBMenu = new ImprovedSBMenu();

	@Expose
	@Category(
		name = "装备HUD",
		desc = "装备HUD"
	)
	public CustomArmour customArmour = new CustomArmour();

	@Expose
	@Category(
		name = "日历",
		desc = "日历"
	)
	public Calendar calendar = new Calendar();

	@Expose
	@Category(
		name = "交易菜单",
		desc = "交易菜单"
	)
	public TradeMenu tradeMenu = new TradeMenu();

	@Expose
	@Category(
		name = "宠物叠加",
		desc = "宠物叠加"
	)
	public PetOverlay petOverlay = new PetOverlay();

	@Expose
	@Category(
		name = "世界渲染器",
		desc = "世界渲染器"
	)
	public WorldConfig world = new WorldConfig();

	@Expose
	@Category(
		name = "拍卖行调整",
		desc = "对拍卖行的调整"
	)
	public AHTweaks ahTweaks = new AHTweaks();

	@Expose
	@Category(
		name = "集市调整",
		desc = "对集市的调整"
	)
	public BazaarTweaks bazaarTweaks = new BazaarTweaks();

	@Expose
	@Category(
		name = "配方调整",
		desc = "对配方搜索的调整"
	)
	public RecipeTweaks recipeTweaks = new RecipeTweaks();

	@Expose
	@Category(
		name = "价格图表",
		desc = "拍卖行和集市价格图表"
	)
	public AHGraph ahGraph = new AHGraph();

	@Expose
	@Category(
		name = "衣柜快捷键",
		desc = "衣柜的快捷键"
	)
	public WardrobeKeybinds wardrobeKeybinds = new WardrobeKeybinds();

	@Expose
	@Category(
		name = "饰品包叠加",
		desc = "饰品包叠加"
	)
	public AccessoryBag accessoryBag = new AccessoryBag();

	@Expose
	@Category(
		name = "博物馆",
		desc = "博物馆叠加"
	)
	public Museum museum = new Museum();

	@Expose
	@Category(
		name = "个人资料查看器",
		desc = "个人资料查看器"
	)
	public ProfileViewer profileViewer = new ProfileViewer();

	@Expose
	@Category(
		name = "仆从助手",
		desc = "仆从助手"
	)
	public MinionHelper minionHelper = new MinionHelper();

	@Expose
	@Category(
		name = "API",
		desc = "API数据"
	)
	public ApiData apiData = new ApiData();

	@Expose
	public LegacyApiKey apiKey = null;

	public static class LegacyApiKey {
		// Blame Ironmoon for this (still better than my idea tho)
		@Expose
		public String apiKey = null;
	}

	@Expose
	public Hidden hidden = new Hidden();

	@Expose
	public DungeonMapConfig dungeonMap = new DungeonMapConfig();

	public static class Hidden {
		@Expose
		public List<CustomTodo> customTodos = new ArrayList<>();
		@Expose
		public HashMap<String, NEUConfig.HiddenProfileSpecific> profileSpecific = new HashMap<>();
		@Expose
		public HashMap<String, NEUConfig.HiddenLocationSpecific> locationSpecific = new HashMap<>();
		@Expose
		public List<NEUConfig.InventoryButton> inventoryButtons = createDefaultInventoryButtons();

		@Expose
		public EnumSet<NEUDebugFlag> debugFlags = EnumSet.noneOf(NEUDebugFlag.class);
		@Expose
		public boolean cacheRenderedItempane = true;
		@Expose
		public String overlaySearchBar = "";
		@Expose
		public String overlayQuickCommand = "";
		@Expose
		public boolean dev = false;
		@Expose
		public boolean loadedModBefore = false;
		@Expose
		public String selectedCape = null;
		@Expose
		public int compareMode = 0;
		@Expose
		public String customUserAgent = null;
		@Expose
		public int sortMode = 0;
		@Expose
		public ArrayList<Boolean> compareAscending = Lists.newArrayList(true, true, true);
		@Expose
		public ArrayList<String> favourites = new ArrayList<>();
		@Expose
		public ArrayList<String> previousAuctionSearches = new ArrayList<>();
		@Expose
		public ArrayList<String> previousBazaarSearches = new ArrayList<>();
		@Expose
		public ArrayList<String> previousProfileSearches = new ArrayList<>();
		@Expose
		public ArrayList<String> previousRecipeSearches = new ArrayList<>();
		@Expose
		public ArrayList<String> eventFavourites = new ArrayList<>();
		@Expose
		public ArrayList<String> quickCommands = createDefaultQuickCommands();
		@Expose
		public ArrayList<String> enchantColours = createDefaultEnchantColours();
		@Expose
		public Set<String> dynamicLightItems = new HashSet<>();

		@Expose
		public boolean firstTimeSearchFocus = true;

		//These config options were added due to a graphical bug that caused the player to be unable to see the screen
		@Expose
		public boolean disableBrokenCapes = false;

		//Ery wanted to texture himself because its ery
		@Expose
		public boolean npcRetextureOnSelf = false;

		@Expose
		public boolean hasOpenedWaypointMenu = false;

		@Expose
		public String externalEditor = null;

	}

	public static ArrayList<String> createDefaultEnchantColours() {
		return Lists.newArrayList(
			"[a-zA-Z\\- ]+:\u003e:9:6:0",
			"[a-zA-Z\\- ]+:\u003e:6:c:0",
			"[a-zA-Z\\- ]+:\u003e:5:5:0",
			"Experience:\u003e:3:5:0",
			"Life Steal:\u003e:3:5:0",
			"Scavenger:\u003e:3:5:0",
			"Looting:\u003e:3:5:0"
		);
	}

	private static ArrayList<String> createDefaultQuickCommands() {
		return new ArrayList<String>() {{
			add(
				"/warp home:Warp Home:eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzljODg4MWU0MjkxNWE5ZDI5YmI2MWExNmZiMjZkMDU5OTEzMjA0ZDI2NWRmNWI0MzliM2Q3OTJhY2Q1NiJ9fX0=");
			add(
				"/warp hub:Warp Hub:eyJ0aW1lc3RhbXAiOjE1NTkyMTU0MTY5MDksInByb2ZpbGVJZCI6IjQxZDNhYmMyZDc0OTQwMGM5MDkwZDU0MzRkMDM4MzFiIiwicHJvZmlsZU5hbWUiOiJNZWdha2xvb24iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q3Y2M2Njg3NDIzZDA1NzBkNTU2YWM1M2UwNjc2Y2I1NjNiYmRkOTcxN2NkODI2OWJkZWJlZDZmNmQ0ZTdiZjgifX19");
			add(
				"/warp dungeon_hub:Dungeon Hub:eyJ0aW1lc3RhbXAiOjE1Nzg0MDk0MTMxNjksInByb2ZpbGVJZCI6IjQxZDNhYmMyZDc0OTQwMGM5MDkwZDU0MzRkMDM4MzFiIiwicHJvZmlsZU5hbWUiOiJNZWdha2xvb24iLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzliNTY4OTViOTY1OTg5NmFkNjQ3ZjU4NTk5MjM4YWY1MzJkNDZkYjljMWIwMzg5YjhiYmViNzA5OTlkYWIzM2QiLCJtZXRhZGF0YSI6eyJtb2RlbCI6InNsaW0ifX19fQ==");
			add("/craft:Crafting Table:CRAFTING_TABLE");
			add("/storage:Storage:CHEST");
			add("/wardrobe:Wardrobe:LEATHER_CHESTPLATE");
			add("/pets:Pets:BONE");
			add("/bz:Bazaar:GOLD_BARDING");
		}};
	}

	public @Nullable HiddenProfileSpecific getProfileSpecific() {
		if (SBInfo.getInstance().currentProfile == null) {
			return null;
		}
		return hidden.profileSpecific.computeIfAbsent(
			SBInfo.getInstance().currentProfile,
			k -> new HiddenProfileSpecific()
		);
	}

	public static class HiddenProfileSpecific {

		@Expose
		public long godPotionDuration = 0L;
		@Expose
		public long puzzlerCompleted = 0L;
		@Expose
		public long firstCakeAte = 0L;
		@Expose
		public long fetchurCompleted = 0L;
		@Expose
		public long commissionsCompleted = 0L;
		@Expose
		public long lastFreeRiftInfusionApplied = 0L;
		@Expose
		public long experimentsCompleted = 0L;
		@Expose
		public long cookieBuffRemaining = 0L;
		@Expose
		public List<MiningOverlay.ForgeItem> forgeItems = new ArrayList<>();

		@Expose
		public Map<String, HotmDesires.Desire> hotmDesires = new HashMap<>();

		@Expose
		public int commissionMilestone = 0;

		@Expose
		public HashMap<String, Boolean> automatonParts = new HashMap<String, Boolean>() {{
			put("Electron Transmitter", false);
			put("FTX 3070", false);
			put("Robotron Reflector", false);
			put("Superlite Motor", false);
			put("Control Switch", false);
			put("Synthetic Heart", false);
		}};

		@Expose
		public HashMap<String, Boolean> divanMinesParts = new HashMap<String, Boolean>() {{
			put("Scavenged Lapis Sword", false);
			put("Scavenged Golden Hammer", false);
			put("Scavenged Diamond Axe", false);
			put("Scavenged Emerald Hammer", false);
		}};

		@Expose
		public HashMap<String, Integer> crystals = new HashMap<String, Integer>() {{
			put("Jade", 0);
			put("Amber", 0);
			put("Amethyst", 0);
			put("Sapphire", 0);
			put("Topaz", 0);
		}};
		@Expose
		public long dailyGemstonePowderCompleted = 0L;
		@Expose
		public long dailyMithrilPowerCompleted = 0L;
		@Expose
		public Set<String> nonUnlockedWarpScrolls = new HashSet<>();
		@Expose
		public long dailyHeavyPearlCompleted = 0L;
		@Expose
		public long questBoardCompleted = 0L;
		@Expose
		public long dailyShopLimitCompleted = 0L;
		@Expose
		public HashMap<Integer, JsonObject> savedEquipment = new HashMap<>();
		@Expose
		public int magicalPower = 0;

		@Expose
		public int chestCount = 0;

		@Expose
		public int openedChestCount = 0;

		@Expose
		public int mithrilPowderFound = 0;

		@Expose
		public int gemstonePowderFound = 0;

		@Expose
		public List<String> abiphoneFavouriteContacts = new ArrayList<>();

		@Expose
		public boolean abiphoneShowOnlyFavourites = false;

		@Expose
		public Map<String, Integer> hotmTree = new HashMap<>();

		@Expose
		public boolean hasConsumedRiftPrism = false;

		@Expose
		public int abiphoneMagicPower = 0;

	}

	public HiddenLocationSpecific getLocationSpecific() {
		String location = SBInfo.getInstance().getLocation();
		if (location == null || location.isEmpty()) {
			return null;
		}

		return getLocationSpecific(location);
	}

	public HiddenLocationSpecific getLocationSpecific(String location) {
		return hidden.locationSpecific.computeIfAbsent(location, k -> new HiddenLocationSpecific());
	}

	public static class HiddenLocationSpecific {
		@Expose
		public Map<String, Integer> commissionMaxes = new HashMap<>();
	}

	public static List<InventoryButton> createDefaultInventoryButtons() {
		return new ArrayList<InventoryButton>() {{
			//Below crafting
			add(new InventoryButton(87, 63, null, true, false, false, 0, ""));
			add(new InventoryButton(87 + 21, 63, null, true, false, false, 0, ""));
			add(new InventoryButton(87 + 21 * 2, 63, null, true, false, false, 0, ""));
			add(new InventoryButton(87 + 21 * 3, 63, null, true, false, false, 0, ""));

			//Above crafting
			add(new InventoryButton(87, 5, null, true, false, false, 0, ""));
			add(new InventoryButton(87 + 21, 5, null, true, false, false, 0, ""));
			add(new InventoryButton(87 + 21 * 2, 5, null, true, false, false, 0, ""));
			add(new InventoryButton(87 + 21 * 3, 5, null, true, false, false, 0, ""));

			//Crafting square
			add(new InventoryButton(87, 25, null, true, false, false, 0, ""));
			add(new InventoryButton(87 + 18, 25, null, true, false, false, 0, ""));
			add(new InventoryButton(87, 25 + 18, null, true, false, false, 0, ""));
			add(new InventoryButton(87 + 18, 25 + 18, null, true, false, false, 0, ""));

			//Crafting result
			add(new InventoryButton(143, 35, null, true, false, false, 0, ""));

			//Player menu area
			add(new InventoryButton(60, 8, null, true, false, false, 0, ""));
			add(new InventoryButton(60, 60, null, true, false, false, 0, ""));
			add(new InventoryButton(26, 8, null, true, false, false, 0, ""));
			add(new InventoryButton(26, 60, null, true, false, false, 0, ""));

			//Right side
			for (int i = 0; i < 8; i++) {
				int y = 2 + 20 * i;
				if (y < 80) {
					add(new InventoryButton(2, 2 + 20 * i, null, false, true, false, 0, ""));
				} else {
					add(new InventoryButton(2, 2 + 20 * i - 166, null, false, true, true, 0, ""));
				}
			}

			//Top side
			for (int i = 0; i < 8; i++) {
				add(new InventoryButton(4 + 21 * i, -19, null, false, false, false, 0, ""));
			}

			//Left side
			for (int i = 0; i < 8; i++) {
				int y = 2 + 20 * i;
				if (y < 80) {
					add(new InventoryButton(-19, 2 + 20 * i, null, false, false, false, 0, ""));
				} else {
					add(new InventoryButton(-19, 2 + 20 * i - 166, null, false, false, true, 0, ""));
				}
			}

			//Bottom side
			for (int i = 0; i < 8; i++) {
				add(new InventoryButton(4 + 21 * i, 2, null, false, false, true, 0, ""));
			}
		}};
	}

	public static class InventoryButton {
		@Expose
		public int x;
		@Expose
		public int y;
		@Expose
		public boolean playerInvOnly;

		@Expose
		public boolean anchorRight;
		@Expose
		public boolean anchorBottom;

		@Expose
		public int backgroundIndex;
		@Expose
		public String command;
		@Expose
		public String icon;

		public boolean isActive() {
			return command.trim().length() > 0;
		}

		public InventoryButton(
			int x,
			int y,
			String icon,
			boolean playerInvOnly,
			boolean anchorRight,
			boolean anchorBottom,
			int backgroundIndex,
			String command
		) {
			this.x = x;
			this.y = y;
			this.icon = icon;
			this.playerInvOnly = playerInvOnly;
			this.anchorRight = anchorRight;
			this.anchorBottom = anchorBottom;
			this.backgroundIndex = backgroundIndex;
			this.command = command;
		}
	}

}
