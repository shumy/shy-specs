package shy.spec.mchannels;

import java.util.function.Function;

public interface IChannelManager {
	public enum Event { OPEN, CLOSE }
	
	IChannelManager onEvent(Event eType, Function<IChannel, Void> listener);
	IChannelManager onError(Function<Throwable, Void> listener);
}
