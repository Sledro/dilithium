package org.dilithium.networking.Commands;

import org.dilithium.Start;
import org.dilithium.util.ByteUtil;
public class BlockHeightCommandHandler extends NetworkCommand{

	@Override
	public byte[] execute(String[] args) {
		return ByteUtil.longToBytes(Start.localNode.getContext().calculateChainSize());
	}

}
