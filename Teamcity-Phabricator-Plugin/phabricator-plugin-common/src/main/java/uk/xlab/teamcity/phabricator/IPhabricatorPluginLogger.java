package uk.xlab.teamcity.phabricator;

public interface IPhabricatorPluginLogger {

    public void info(String message);

    public void warn(String message, Exception e);

    public void error(String message, Exception e);
}
