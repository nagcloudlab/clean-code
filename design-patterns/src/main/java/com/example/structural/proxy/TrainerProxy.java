package com.example.structural.proxy;

public class TrainerProxy extends Trainer{

    private Logging logging = new Logging();
    private Authorization authorization = new Authorization();

    @Override
    public String getCleanCodeTraining() {
        logging.log("getCleanCodeTraining");
        authorization.isAuthorized("foo");
        return super.getCleanCodeTraining();
    }

    @Override
    public String getJavaTraining() {
        logging.log("getJavaTraining");
        authorization.isAuthorized("foo");
        return super.getJavaTraining();
    }

}
