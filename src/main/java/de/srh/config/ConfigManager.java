package de.srh.config;


import de.srh.service.PasswordService;

import java.util.ArrayList;
import java.util.Properties;

/**
 * Config parser parses configuration files and matches keys of env variables.
 * Then it puts the values to the corresponding keys
 * static singleton object with parsed configuration is used for DBConnector
 * @author  Andreas Lakus
 */

public class ConfigManager {

    private static Properties dBConfigProps;
    private static PasswordService passwordService;

    private ArrayList<String> configProps = null;
    public static void setDBConfigProps(Properties props){
        dBConfigProps = props;
    }

    public static Properties getDBConfigProps() {
        return dBConfigProps;
    }

    public ConfigManager() {
        dBConfigProps = new Properties();
        parseConfigPropsEnum();
        setEnvVariables();
    }

    public void parseConfigPropsEnum(){
        for (ConfigProps props : ConfigProps.values()) {
            dBConfigProps.setProperty(props.toString(), "unset");
        }
    }

    private void setEnvVariables(){
        dBConfigProps.forEach((key, val) -> {
            try{
                String newVal = System.getProperty(key.toString());
                dBConfigProps.setProperty(key.toString(), newVal.toString());
            } catch ( NullPointerException e ){
                System.out.println(e);
            }
        });
    }
}
