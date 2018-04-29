package org.dilithium.networking.Commands;

public class PingCommandHandler extends NetworkCommand{

	@Override
	public byte[] execute(String[] args) {
		return "pong".getBytes();
	}

}
