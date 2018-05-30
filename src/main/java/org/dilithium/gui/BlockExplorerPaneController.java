package org.dilithium.gui;


public class BlockExplorerPaneController {

	private BlockExplorerPane BlockExplorerPane;
	
	/**
	 * Is called by the main application to give a reference back to itself.
	 * @param OverviewPane 
	 * 
	 * @param mainApp
	 */
	public void setMainApp(BlockExplorerPane BlockExplorerPane) {
		this.BlockExplorerPane = BlockExplorerPane;
	}

	public BlockExplorerPane getBlockExplorerPane() {
		return BlockExplorerPane;
	}

	public void setBlockExplorerPane(BlockExplorerPane blockExplorerPane) {
		this.BlockExplorerPane = blockExplorerPane;
	}
	
	
	
	
}
