package gof.creation.singleton;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

/**
 * 单例模式
 * 实时加载配置文件
 * @author chenkund
 *
 */
public class ConfigManager {
	
	private Properties properties = new Properties();
	
	private static final ConfigManager instance = new ConfigManager();
	
	private long m_lastModified = 0l;
	
	private File file = null;
	
	private ConfigManager(){
		file = new File("/GoF23/src/gof/creation/singleton/config.ini");
		m_lastModified = file.lastModified();
		if(m_lastModified == 0){
			System.err.println("file doesn't exist");
		}
		try {
			properties.load(new FileReader(file));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static ConfigManager getInstance(){
		return instance;
	}
	
	public final Object getConfigItem(String name, Object defaultValue){
		String prop = null;
		if(m_lastModified == 0 || file.lastModified() == 0){
			System.err.println("file doesn't exist");
			return defaultValue;
		}
		if(m_lastModified == file.lastModified()){
			prop = (String) properties.get(name);
		}else{
			m_lastModified = file.lastModified();
			properties.clear();
			try {
				properties.load(new FileReader(file));
			} catch (Exception e) {
				e.printStackTrace();
			} 
			prop = (String) properties.get(name);
		}
		if(prop == null || prop.length() == 0){
			return defaultValue;
		}else{
			return prop;
		}
	}
}
