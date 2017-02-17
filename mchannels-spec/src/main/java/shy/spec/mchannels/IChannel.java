package shy.spec.mchannels;

import java.util.function.Function;

public interface IChannel {
	String id();
	
	IChannel publish(CMessage msg);
	IChannel onMessage(Function<CMessage, Void> listener);
	IChannel onError(Function<Throwable, Void> listener);
	
	void close();
}
