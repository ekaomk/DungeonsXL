package io.github.dre2n.dungeonsxl.event.editworld;

import io.github.dre2n.dungeonsxl.dungeon.EditWorld;

import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public class EditWorldUnloadEvent extends EditWorldEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	private boolean cancelled;
	
	private boolean save;
	
	public EditWorldUnloadEvent(EditWorld editWorld, boolean save) {
		super(editWorld);
		this.save = save;
	}
	
	/**
	 * @return the save
	 */
	public boolean getSave() {
		return save;
	}
	
	/**
	 * @param save
	 * the save to set
	 */
	public void setSave(boolean save) {
		this.save = save;
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
