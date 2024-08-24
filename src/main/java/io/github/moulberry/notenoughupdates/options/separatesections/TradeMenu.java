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
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class TradeMenu {
	@Expose
	@ConfigOption(
		name = "启用自定义交易菜单",
		desc = "在SkyBlock中与其他玩家交易时，显示一个特殊的GUI以防止欺诈"
	)
	@ConfigEditorBoolean
	public boolean enableCustomTrade = true;

	@Expose
	@ConfigOption(
		name = "价格信息",
		desc = "在交易窗口的两侧显示物品的价格"
	)
	@ConfigEditorBoolean
	public boolean customTradePrices = true;

	@Expose
	public boolean customTradePriceStyle = true;
}
