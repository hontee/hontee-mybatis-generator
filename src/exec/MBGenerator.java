package exec;

import org.mybatis.generator.api.ShellRunner;

/**
 * 自动生成实体类与映射文件
 * @author larry.qi
 */
public class MBGenerator {

    public static void main(String[] args) { 
    	String generatorConfig = MBGenerator.class.getClassLoader().getResource("").getPath().replace("build/classes/", "generatorConfig.xml");
    	String[] arg = { "-configfile", generatorConfig, "-overwrite" };  
        ShellRunner.main(arg);  
    }

}
