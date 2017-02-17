package shy.spec.mchannels;

/**
 * @author micaelpedrosa@gmail.com
 * ITreeInfo is a tree structure specification for additional information that can be available in the CMessage.
 * E.g of implementations are able to store information in memory or request it directly from a server request.
 */
public interface ITreeInfo {
	public static final String KEY_COOKIES = "cookies";
	public static final String KEY_HEADERS = "headers";
	public static final String KEY_PARAMS  = "params";
	
	ITreeInfo tree(String key);
	String value(String name);
}
