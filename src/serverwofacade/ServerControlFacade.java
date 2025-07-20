package serverwofacade;

public class ServerControlFacade {
    private static ServerControlFacade serverControl;
    private static ScheduleServer scheduleServer;
    private ServerControlFacade(){}

    public static ServerControlFacade getServerControlFacade(){
        if(serverControl == null){
            serverControl = new ServerControlFacade();
        }

        return serverControl;
    }

    public void startWorking(){
        if(scheduleServer == null){
            scheduleServer = new ScheduleServer();
        }

        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();        
    }

    public void stopWorking(){
        if(scheduleServer == null){
            System.out.println("Server not start working yet.");
            return;
        }

        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
