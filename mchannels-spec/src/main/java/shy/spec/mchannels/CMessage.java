package shy.spec.mchannels;

public class CMessage {
	public enum Command { SEND, PUBLISH, REPLY }
	
	public final long id;			// used for reply binding
	public final Command cmd;		// used to identify message types
	public final String path; 		// used for routing
	public final String format; 	// (json, xml, file, ...)
	
	public final ITreeInfo info;	// additional info (cookies, headers, parameters)
	public final Object carrier; 	// (Publisher<?>, ByteBuffer, String)
	
	public CMessage(long id, Command cmd, String path, String format, ITreeInfo info, Object carrier) {
		this.id = id;
		this.cmd = cmd;
		this.path = path;
		this.format = format;
		
		this.info = info;
		this.carrier = carrier;
	}
}
