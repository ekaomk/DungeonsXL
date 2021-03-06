package io.github.dre2n.dungeonsxl.event.reward;

import io.github.dre2n.dungeonsxl.reward.Reward;

import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public class RewardRegistrationEvent extends RewardEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	private boolean cancelled;
	
	public RewardRegistrationEvent(Reward reward) {
		super(reward);
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	@Override
	public boolean isCancelled() {
		return cancelled;
	}
	
	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
}
