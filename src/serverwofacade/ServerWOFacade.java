/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;
public class ServerWOFacade {
    public static void main(String[] args) {
	ServerControlFacade serverControl = getServerControlFacade();
	// scheduleServer.startBooting();
	// scheduleServer.readSystemConfigFile();
	// scheduleServer.init();
	// scheduleServer.initializeContext();
	// scheduleServer.initializeListeners();
	// scheduleServer.createSystemObjects();
	serverControl.startWorking();
	System.out.println("Start working......");
	System.out.println("After work done.........");
	// scheduleServer.releaseProcesses();
	// scheduleServer.destory();
	// scheduleServer.destroySystemObjects();
	// scheduleServer.destoryListeners();
	// scheduleServer.destoryContext();
	// scheduleServer.shutdown();
	serverControl.stopWorking();
    }
    
}
