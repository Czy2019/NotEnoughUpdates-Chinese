/*
 * Copyright (C) 2024 NotEnoughUpdates contributors
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
import io.github.moulberry.moulconfig.annotations.Accordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorButton;
import io.github.moulberry.moulconfig.annotations.ConfigEditorDropdown;
import io.github.moulberry.moulconfig.annotations.ConfigOption;
import io.github.moulberry.moulconfig.observer.Property;
import io.github.moulberry.notenoughupdates.options.customtypes.ConfigVersionDisplay;
import io.github.moulberry.notenoughupdates.util.Utils;

public class About {
	@ConfigOption(name = "当前版本", desc = "这是你当前运行的 NEU 版本")
	@ConfigVersionDisplay
	public transient Void currentVersion = null;

	@ConfigOption(name = "检查更新", desc = "每次启动时自动检查更新")
	@Expose
	@ConfigEditorBoolean
	public boolean autoUpdates = true;

	@ConfigOption(name = "更新流", desc = "你希望多久获取一次更新")
	@Expose
	@ConfigEditorDropdown
	public Property<UpdateStream> updateStream = Property.of(UpdateStream.FULL);

	@ConfigOption(name = "使用的软件", desc = "有关使用的软件和许可证的信息")
	@Accordion
	@Expose
	public Licenses licenses = new Licenses();

	public enum UpdateStream {
		PRE("完整发布和测试版", "pre"),
		FULL("完整发布", "full"),
		NONE("无", "none");

		public final String stream;
		public final String label;

		UpdateStream(String name, String stream) {
			this.label = name;
			this.stream = stream;
		}

		@Override
		public String toString() {
			return label;
		}
	}

	public static class Licenses {

		@ConfigOption(name = "Forge", desc = "Forge 采用 LGPL 3.0 许可证")
		@ConfigEditorButton(buttonText = "源代码")
		public Runnable forge = () -> Utils.openUrl("https://github.com/MinecraftForge/MinecraftForge");

		@ConfigOption(name = "Mixin", desc = "Mixin 采用 MIT 许可证")
		@ConfigEditorButton(buttonText = "源代码")
		public Runnable mixin = () -> Utils.openUrl("https://github.com/SpongePowered/Mixin/");

		@ConfigOption(name = "LibAutoUpdate", desc = "LibAutoUpdate 采用 BSD 2 条款许可证")
		@ConfigEditorButton(buttonText = "源代码")
		public Runnable libAutoUpdate = () -> Utils.openUrl("https://git.nea.moe/nea/libautoupdate/");

		@ConfigOption(name = "Kotlin", desc = "Kotlin 采用 Apache 2 许可证")
		@ConfigEditorButton(buttonText = "源代码")
		public Runnable kotlin = () -> Utils.openUrl("https://github.com/jetbrains/kotlin/");

		@ConfigOption(name = "AutoService", desc = "auto-service-ksp 采用 Apache 2 许可证")
		@ConfigEditorButton(buttonText = "源代码")
		public Runnable autoService = () -> Utils.openUrl("https://github.com/ZacSweers/auto-service-ksp/");

		@ConfigOption(name = "Brigadier", desc = "Brigadier 采用 MIT 许可证")
		@ConfigEditorButton(buttonText = "源代码")
		public Runnable brigadier = () -> Utils.openUrl("https://github.com/Mojang/brigadier/");

		@ConfigOption(name = "JB 注解", desc = "Jetbrains 注解采用 Apache 2 许可证")
		@ConfigEditorButton(buttonText = "源代码")
		public Runnable annotations = () -> Utils.openUrl("https://github.com/JetBrains/java-annotations");

		@ConfigOption(name = "MoulConfig", desc = "MoulConfig 采用 LGPL 3.0 许可证")
		@ConfigEditorButton(buttonText = "源代码")
		public Runnable moulConfig = () -> Utils.openUrl("https://github.com/NotEnoughUpdates/MoulConfig");

		@ConfigOption(name = "Bliki", desc = "Bliki Core 采用 Eclipse 公共许可证 1.0")
		@ConfigEditorButton(buttonText = "源代码")
		public Runnable blikiCore = () -> Utils.openUrl("https://github.com/AaronZhangL/blikiCore/");

		@ConfigOption(name = "Lombok", desc = "Lombok 采用 MIT 许可证")
		@ConfigEditorButton(buttonText = "网站")
		public Runnable lombok = () -> Utils.openUrl("https://projectlombok.org/");
	}
}
