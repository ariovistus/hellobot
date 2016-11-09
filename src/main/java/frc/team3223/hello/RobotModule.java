package frc.team3223.hello;

import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;

public class RobotModule extends IterativeModule {

    public static Logger logger;

    @Override
    public String getModuleName() {
        return "Hello";
    }

    @Override
    public String getModuleVersion() {
        return "0.0.1";
    }

    @Override
    public void robotInit() {
        logger = new Logger("Hello", Logger.ATTR_DEFAULT);
        //TODO: Module Init
    }
}
