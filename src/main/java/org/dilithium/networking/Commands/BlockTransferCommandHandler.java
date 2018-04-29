package org.dilithium.networking.Commands;

import org.dilithium.Start;

public class BlockTransferCommandHandler extends NetworkCommand{

	@Override
	public byte[] execute(String[] args) {
		return Start.localNode.getContext().getBlock(Start.localNode.getContext().calculateChainSize()-1).getEncoded();
	}

}
